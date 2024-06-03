package Controllers;

import Authorizaztion.Auth;
import Exceptions.UserNotFoundException;
import People.Person;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

public class ForgotPasswordController {

    @FXML
    private TextField emailFiled;

    @FXML
    private TextField newPassword;

    @FXML
    private Button okButton;

    @FXML
    private PasswordField repeatNewPassword;

    @FXML
    private TextField usernameFiled;
    @FXML
    public void changePassword(javafx.scene.input.MouseEvent mouseEvent) {
        try {
            Person p = Person.findPersonNoPassword(usernameFiled.getText(),emailFiled.getText());
            if (Auth.isPasswordValid(newPassword.getText())&&Auth.doPasswordAndRepeatMatch(newPassword.getText(),repeatNewPassword.getText())){
                //send email...
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
