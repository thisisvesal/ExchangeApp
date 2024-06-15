package Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SpotController {

    @FXML
    void openPositionPage(ActionEvent event) {
        SceneController.getInstance().switchScene("PositionPage.fxml");
        System.out.println("SWITCHING TO POSITION");
    }

    @FXML
    void openSpotPage(ActionEvent event) {
        // Do nothing
    }

}
