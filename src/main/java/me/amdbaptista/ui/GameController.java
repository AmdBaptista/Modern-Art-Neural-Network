package me.amdbaptista.ui;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class GameController {

    @FXML
    private Button startGameButton;

    @FXML
    private void initialize() {
        startGameButton.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/GameSettings.fxml"));
                Parent root = loader.load();
                Scene gameSettingsScene = new Scene(root);

                Stage primaryStage = (Stage) startGameButton.getScene().getWindow();
                primaryStage.setScene(gameSettingsScene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
