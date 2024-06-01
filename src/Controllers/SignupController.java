package Controllers;

import Authorizaztion.Auth;
import Exceptions.InvalidEmailException;
import Exceptions.InvalidInfoException;
import Exceptions.InvalidPasswordException;
import Exceptions.InvalidPhoneNumberException;
import Exceptions.InvalidUsernameException;
import People.Person;
import People.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignupController {

    @FXML
    private TextField emailField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField newPasswordField;

    @FXML
    private TextField newUsernameField;

    @FXML
    private TextField phoneNumberFiled;

    @FXML
    private TextField repeatPasswordField;

    @FXML
    void getTextInput(ActionEvent event) {
        try {
            Auth.isInfoValid(newUsernameField.getText(), newPasswordField.getText(), repeatPasswordField.getText(), emailField.getText(),
                    phoneNumberFiled.getText());
            
            User member = new User(newUsernameField.getText(), newPasswordField.getText(), nameField.getText(),
                    lastNameField.getText(), emailField.getText(), phoneNumberFiled.getText());
            Person.setCurrentPerson(member);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("You were signed up successfully.");
            // alert.setContentText("This is content text.");
            alert.showAndWait();

        } catch (InvalidUsernameException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid info");
            alert.setHeaderText("Invalid username");
            alert.setContentText("Please enter a valid username.");
            alert.showAndWait();
        } catch (InvalidPasswordException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid info");
            alert.setHeaderText("Invalid password");
            alert.setContentText("Please enter a valid password.");
            alert.showAndWait();
        } catch (InvalidEmailException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid info");
            alert.setHeaderText("Invalid email");
            alert.setContentText("Please enter a valid email.");
            alert.showAndWait();
        } catch (InvalidPhoneNumberException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid info");
            alert.setHeaderText("Invalid phone number");
            alert.setContentText("Please enter a valid phone number.");
            alert.showAndWait();
        } catch (InvalidInfoException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid info");
            alert.setHeaderText("Invalid sign up information");
            alert.setContentText("Please check your info.");
            alert.showAndWait();
        }
    }

    @FXML
    void openLoginPage(MouseEvent event) {
        System.out.println("SignUpController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

}
