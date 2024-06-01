package Controllers;

import People.Person;
import People.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
        System.out.println("Ok was pressed");
        User member = new User(newUsernameField.getText(), newPasswordField.getText(), nameField.getText(),
                lastNameField.getText(), emailField.getText(), phoneNumberFiled.getText());
        Person.addPerson(member);
    }

    @FXML
    void openLoginPage(MouseEvent event) {
        System.out.println("SignUpController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

}
