package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class HomeController {

    @FXML
    private Text HomeFiled;

    @FXML
    private Text exchangeFiled;

    @FXML
    private Text historyFiled;

    @FXML
    private Circle profilePic;

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
    void LogInPage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }
    @FXML
    void openExchangePage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ExchangePage.fxml");
    }

    @FXML
    void openHistoryPage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HistoryPage.fxml");
    }
    @FXML
    void openPositionPage(ActionEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("PositionPage.fxml");
    }

    @FXML
    void openProfilePage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ProfilePage.fxml");
    }

//    @FXML
//    void openSpotPage(ActionEvent event) {
//        System.out.println("WalletController - calling SceneController for scene switch");
//        SceneController.getInstance().switchScene("ProfilePage.fxml");
//    }

    @FXML
    void openSwapPage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("SwapPage.fxml");
    }

    @FXML
    void openTransferPage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("TransferPage.fxml");
    }

    @FXML
    void openWalletPage(MouseEvent event) {
        System.out.println("HomeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("WalletPage.fxml");
    }

}
