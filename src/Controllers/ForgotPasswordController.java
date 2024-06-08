package Controllers;

import Exceptions.UserNotFoundException;
import People.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import Authorization.Auth;

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

    @FXML
    void openLoginPage() {
        System.out.println("SignUpController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }
}
