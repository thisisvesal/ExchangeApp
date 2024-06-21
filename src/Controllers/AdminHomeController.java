package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AdminHomeController {

    @FXML
    private Text HomeFiled;

    @FXML
    private Text LogOutFiled;

    @FXML
    private Button changeButton;

    @FXML
    private RadioButton closeOption;

    @FXML
    private Text historyFiled;

    @FXML
    private RadioButton openOption;

    @FXML
    private Text walletFiled;

    @FXML
    void LogInPage(MouseEvent event) {
        System.out.println("AdminHomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

    @FXML
    void changeStatus(MouseEvent event) {
        //Active or deActive exchange
    }

    @FXML
    void openAdminHistoryPage(MouseEvent event) {
        System.out.println("AdminHomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("AdminHistoryPage.fxml");
    }

    @FXML
    void openAdminWalletPage(MouseEvent event) {
        System.out.println("AdminHomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("AdminWalletPage.fxml");
    }

}
