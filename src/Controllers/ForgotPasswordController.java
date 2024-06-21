package Controllers;

import Exceptions.UserNotFoundException;
import People.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import Authorization.Auth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
//                Process theProcess = null;
//                BufferedReader inStream = null;

                // call the Hello class
//                try
//                {
//                    ProcessBuilder theProcess = new ProcessBuilder("java", "-jar","D:\\2  semester\\advancedPrograming\\Final-Project-Exchange-App\\ExchangeApp\\lib\\sendemail.jar");
//                    theProcess.inheritIO();
//                    Process process = theProcess.start();
//                    process.waitFor();
//                }
//                catch(IOException e)
//                {
//                    System.err.println("Error on exec() method");
//                    e.printStackTrace();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

        // read from the called program's stanpdard output stream
//                try
//                {
//                    inStream = new BufferedReader(
//                            new InputStreamReader( theProcess.getInputStream() ));
//                    System.out.println(inStream.readLine());
//                }
//                catch(IOException e)
//                {
//                    System.err.println("Error on inStream.readLine()");
//                    e.printStackTrace();
//                }

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
