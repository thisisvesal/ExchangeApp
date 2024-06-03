package Controllers;

import Exceptions.UserNotFoundException;
import People.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void getTextInput(ActionEvent event) {
        try {
            Person.setCurrentPerson(Person.findPerson(usernameField.getText(), passwordField.getText()));
            System.out.println("Loginpage controller - username and password recieved");
        } catch (UserNotFoundException e) {
            System.out.print("Loginpage controller - caught an exception - message: ");
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


}
