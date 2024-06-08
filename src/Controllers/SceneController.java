package Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private static SceneController instance;

    private SceneController() {

    }

    // I basically wanted a way for a single stage to exist throughout the whole program,
    // So I made this method such that it only modifies the "stage" if it doesn't already exist
    public void setStage(Stage stage) {
        if (this.stage == null) {
            this.stage = stage;
        }
    }

    // This is a very project-specific method which only works with the directory design of this app
    // Meaning, whatever you enter, it'll look for it in the Graphics folder
    // Example: Enter "LoginPage.fxml" as sceneName if you want to open login
    public void switchScene(String sceneName) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Graphics/" + sceneName));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            System.out.println("SceneController - switched to " + sceneName);
        } catch (Exception e) {
            System.out.println("SceneController - couldn't switch scenes");
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static SceneController getInstance() {
        if (instance == null) {
            instance = new SceneController();
        }
        return instance;
    }
}
