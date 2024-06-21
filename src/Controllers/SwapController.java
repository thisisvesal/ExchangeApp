package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class SwapController {

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
    private Text swapTitle;

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
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

    @FXML
    void openExchangePage(MouseEvent event) {
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ExchangePage.fxml");
    }

    @FXML
    void openHistoryPage(MouseEvent event) {
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HistoryPage.fxml");
    }

    @FXML
    void openHomePage(MouseEvent event) {
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HomePage.fxml");
    }
    @FXML
    void openProfilePage(MouseEvent event) {
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ProfilePage.fxml");
    }

    @FXML
    void openTransferPage(MouseEvent event) {
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("TransferPage.fxml");
    }

    @FXML
    void openWalletPage(MouseEvent event) {
        System.out.println("SwapController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("WalletPage.fxml");
    }

}