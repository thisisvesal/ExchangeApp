package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PositionController {

    @FXML
    void openPositionPage(ActionEvent event) {
        // Do nothing
    }

    @FXML
    void openSpotPage(ActionEvent event) {
        SceneController.getInstance().switchScene("SpotPage.fxml");
    }

}
