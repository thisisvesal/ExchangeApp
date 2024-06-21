package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.awt.*;

public class ProfileController {


    @FXML
    private TextField EmailTextFiled;

    @FXML
    private Text HomeFiled;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private TextField PhoneNumberTextFiled;

    @FXML
    private Button editButton;

    @FXML
    private Text exchangeFiled;

    @FXML
    private TextField firstNameTextFiled;

    @FXML
    private Text historyFiled;

    @FXML
    private TextField lastNameTextFiled;

    @FXML
    private Circle profilePic;

    @FXML
    private Text profileTitle;

    @FXML
    private Text swapFiled;

    @FXML
    private Text transferFiled;

    @FXML
    private Text usernameFiled;

    @FXML
    private Text walletFiled;
    @FXML
    private Text LogOutFiled;
    @FXML
    private CheckBox demoMode;
    boolean isEdit = true;
    //first name/last name/phone number/email/password//
    String[] afterEdit = new String[5];
    @FXML
    void MakeTextFiledEditableAndChangeText(MouseEvent event) {
        if (isEdit){
            firstNameTextFiled.setEditable(true);
            lastNameTextFiled.setEditable(true);
            PhoneNumberTextFiled.setEditable(true);
            EmailTextFiled.setEditable(true);
            PasswordTextField.setEditable(true);
            editButton.setLabel("OK");
            isEdit=false;
        } else {
            afterEdit[0]=firstNameTextFiled.getText();
            afterEdit[1]=lastNameTextFiled.getText();
            afterEdit[2]=PhoneNumberTextFiled.getText();
            afterEdit[3]=EmailTextFiled.getText();
            afterEdit[4]=PasswordTextField.getText();
            //set new info of user
            firstNameTextFiled.setEditable(false);
            lastNameTextFiled.setEditable(false);
            PhoneNumberTextFiled.setEditable(false);
            EmailTextFiled.setEditable(false);
            PasswordTextField.setEditable(false);
            editButton.setLabel("Edit");
            isEdit=true;
        }
    }

    @FXML
    void DemoModeCheck(MouseEvent event) {
        if (demoMode.isSelected()){
            demoMode.setIndeterminate(true);
        }else {
            demoMode.setSelected(true);
        }
    }


    @FXML
    void LogInPage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }
    @FXML
    void openExchangePage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ExchangePage.fxml");
    }

    @FXML
    void openHistoryPage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HistoryPage.fxml");
    }

    @FXML
    void openHomePage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HomePage.fxml");
    }

    @FXML
    void openSwapPage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("SwapPage.fxml");
    }

    @FXML
    void openTransferPage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("TransferPage.fxml");
    }

    @FXML
    void openWalletPage(MouseEvent event) {
        System.out.println("ProfileController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("WalletPage.fxml");
    }


}
