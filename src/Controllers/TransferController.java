package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.awt.*;

public class TransferController {
    @FXML
    private RadioButton EURO;

    @FXML
    private RadioButton GBP;

    @FXML
    private Text HomeFiled;

    @FXML
    private Text LogOutFiled;

    @FXML
    private RadioButton TOMAN;

    @FXML
    private RadioButton USD;

    @FXML
    private RadioButton YEN;

    @FXML
    private TextField amountFiled;


    @FXML
    private TilePane currencies;
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
    private Text transferTitle;

    @FXML
    private Text transferTitle1;

    @FXML
    private Text transferTitle11;

    @FXML
    private Text transferTitle111;

    @FXML
    private Text usernameFiled;

    @FXML
    private Text walletFiled;

    @FXML
    private TextField walletIdFiled;

    @FXML
    void TransferMoneyToWallet(MouseEvent event) {
        //check wallet id
        //check which currency is chosen
        //check the amount
        //transfer to wallet
    }
    @FXML
    void LogInPage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("LoginPage.fxml");
    }

    @FXML
    void openExchangePage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ExchangePage.fxml");
    }

    @FXML
    void openHistoryPage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HistoryPage.fxml");
    }

    @FXML
    void openHomePage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("HomePage.fxml");
    }

    @FXML
    void openProfilePage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("ProfilePage.fxml");
    }

    @FXML
    void openSwapPage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("SwapPage.fxml");
    }

    @FXML
    void openWalletPage(MouseEvent event) {
        System.out.println("TransferController - calling SceneController for scene switch");
        SceneController.getInstance().switchScene("WalletPage.fxml");
    }

}
