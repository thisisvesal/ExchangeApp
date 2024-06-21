package Controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AdminWalletController {

    @FXML
    private Text HomeFiled;

    @FXML
    private Text LogOutFiled;

    @FXML
    private Text historyFiled;

    @FXML
    private Text walletFiled;

    @FXML
    void LogInPage(MouseEvent event) {
        System.out.println("AdminWalletController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

    @FXML
    void openAdminHistoryPage(MouseEvent event) {
        System.out.println("AdminWalletController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("AdminHistoryPage.fxml");
    }

    @FXML
    void openAminHomePage(MouseEvent event) {
        System.out.println("AdminWalletController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("AminHomePage.fxml");
    }

}
