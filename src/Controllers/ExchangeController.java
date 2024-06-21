package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class ExchangeController {

    @FXML
    private Text HomeFiled;

    @FXML
    private Text exchangeFiled;

    @FXML
    private Text exchangeTitle;

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
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

    @FXML
    void openHistoryPage(MouseEvent event) {
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HistoryPage.fxml");
    }

    @FXML
    void openHomePage(MouseEvent event) {
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HomePage.fxml");
    }

    @FXML
    void openProfilePage(MouseEvent event) {
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ProfilePage.fxml");
    }

    @FXML
    void openSwapPage(MouseEvent event) {
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("SwapPage.fxml");
    }

    @FXML
    void openTransferPage(MouseEvent event) {
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("TransferPage.fxml");
    }

    @FXML
    void openWalletPage(MouseEvent event) {
        System.out.println("ExchangeController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("WalletPage.fxml");
    }

}
