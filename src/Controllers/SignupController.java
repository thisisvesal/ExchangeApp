package Controllers;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;

import Authorization.Auth;
import People.Person;
import People.User;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;

public class SignupController {

    @FXML
    private TextField captchaField;

    @FXML
    private ImageView captchaImage;

    @FXML
    private TextField emailField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField newUsernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField phoneNumberFiled;

    @FXML
    private TextField repeatPasswordField;

    @FXML
    void getTextInput() {
        boolean[] invalid = Auth.isInfoValid(newUsernameField.getText(), passwordField.getText(),
                repeatPasswordField.getText(), emailField.getText(),
                phoneNumberFiled.getText(), captchaField.getText());
        boolean allInfoValid = true;
        for (int i = 0; i < 5; i++) {
            if (invalid[i]) {
                allInfoValid = false;
                Alert alert = new Alert(Alert.AlertType.WARNING);
                switch (i) {
                    case 0:
                        // phoneNumberFiled.setText(null);
                        alert.setTitle("Invalid phone number");
                        alert.setHeaderText("Check your phone number and try again.");
                        alert.showAndWait();
                        break;
                    case 1:
                        alert.setTitle("Invalid email");
                        alert.setHeaderText("Check your email and try again.");
                        alert.showAndWait();
                        // emailField.setText(null);
                        break;
                    case 2:
                        alert.setTitle("Invalid username");
                        alert.setHeaderText("Please enter a valid username");
                        alert.showAndWait();
                        // newUsernameField.setText(null);
                        break;
                    case 3:
                        alert.setTitle("Invalid password");
                        alert.setHeaderText("Please choose a stronger password");
                        alert.showAndWait();
                        // passwordField.setText(null);
                        // repeatPasswordField.setText(null);
                        break;
                    case 4:
                        alert.setTitle("Wrong captcha");
                        alert.setHeaderText("Try again.");
                        alert.showAndWait();
                        // captchaField.setText(null);
                        break;
                }
                break;
            }
        }

        if (allInfoValid) {
            User member = new User(newUsernameField.getText(), passwordField.getText(), nameField.getText(),
                    lastNameField.getText(), emailField.getText(), phoneNumberFiled.getText());
            Person.setCurrentPerson(member);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("You were signed up successfully.");
            alert.showAndWait();
        }
    }

    @FXML
    void openLoginPage() {
        System.out.println("SignUpController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

    @FXML
    void regenerateCaptcha(MouseEvent event) {
        Properties properties = new Properties();
        properties.setProperty("kaptcha.textproducer.char.length", "5");
        properties.setProperty("kaptcha.image.width", "200");
        properties.setProperty("kaptcha.image.height", "50");
        Config config = new Config(properties);

        // Create a Kaptcha producer with the configuration
        Producer kaptchaProducer = config.getProducerImpl();

        // Generate the CAPTCHA text
        String captchaText = kaptchaProducer.createText();
        System.out.println("CAPTCHA Text: " + captchaText);
        Auth.setCurrentCaptchaText(captchaText);

        // Generate the CAPTCHA image based on the text
        BufferedImage captchaImage = kaptchaProducer.createImage(captchaText);

        // Save the image to a file
        try {
            File outputFile = new File("src/Authorization/Captcha/kaptcha.png");
            ImageIO.write(captchaImage, "png", outputFile);
            System.out.println("Kaptcha generated in: " + outputFile.getAbsolutePath());
            this.captchaImage.setImage(new Image(outputFile.toURI().toString()));
        } catch (IOException ioException) {
            System.out.println("Kaptcha generation failed at: LoginController : regenerateCaptcha");
        }
    }

}
