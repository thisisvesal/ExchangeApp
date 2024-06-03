package Controllers;

import Authorizaztion.Auth;
import People.Person;
import People.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController {

    @FXML
    private TextField emailField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField newUsernameField;

    @FXML
    private PasswordField passwordFiled;
    @FXML
    private TextField phoneNumberFiled;

    @FXML
    private TextField repeatPasswordField;

    @FXML
    void getTextInput() {
        boolean[] invalid = Auth.isInfoValid(newUsernameField.getText(), passwordFiled.getText(), repeatPasswordField.getText(), emailField.getText(),
                phoneNumberFiled.getText());
        boolean allInfoValid = true;
        for (int i = 0; i <= 3; i++) {
            if (invalid[i]) {
                allInfoValid = false;
                switch (i) {
                    case 0:
                        phoneNumberFiled.setText(null);
                        break;
                    case 1:
                        emailField.setText(null);
                        break;
                    case 2:
                        newUsernameField.setText(null);
                        break;
                    case 3:
                        passwordFiled.setText(null);
                        repeatPasswordField.setText(null);
                        break;
                }
            }
        }

        if (allInfoValid) {
            User member = new User(newUsernameField.getText(), passwordFiled.getText(), nameField.getText(),
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

}
