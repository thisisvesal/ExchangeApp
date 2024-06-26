import Controllers.SceneController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Initial load:
        try {
            // THE NEXT LINE IS IMPORTANT!!!!!
            SceneController.getInstance().setStage(primaryStage);

            Parent root = FXMLLoader.load(getClass().getResource("Graphics/LoginPage.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            // scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        } catch (Exception e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

}