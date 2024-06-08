package Controllers;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;

import Authorization.Auth;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

import Exceptions.UserNotFoundException;
import People.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private TextField captchaField;

    @FXML
    private ImageView captchaImage;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void getTextInput(ActionEvent event) {
        try {
            Person.setCurrentPerson(Person.findPerson(usernameField.getText(), passwordField.getText()));
            System.out.println("LoginController - Person found");
            if (!Auth.isCaptchaValid(captchaField.getText())) {
                System.out.println("Invalid captcha input");
            } else {
                System.out.println("Correct captcha");
            }
        } catch (UserNotFoundException e) {
            System.out.print("LoginController - caught an exception - message: ");
            System.out.println(e.getMessage() + ", cause: " + e.getCause());
        }
    }

    @FXML
    void openSignUpPage(MouseEvent event) {
        System.out.println("LoginController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("SignupPage.fxml");
    }

    @FXML
    void openForgotPasswordPage(MouseEvent event) {
        System.out.println("LoginController - calling forgot Password for scene switch");
        SceneController.getInstance().switchScene("ForgotPasswordPage.fxml");
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