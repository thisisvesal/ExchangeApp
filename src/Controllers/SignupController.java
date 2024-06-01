package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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
    }

}
