package me.amdbaptista.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class GameController {

    @FXML
    private void handleStartNormalGame(ActionEvent event) {
        System.out.println("Normal Game button clicked");
        loadGameSettingsPage(event, "normal");
    }

    @FXML
    private void handleStartGodGame(ActionEvent event) {
        System.out.println("God Game button clicked");
        loadGameSettingsPage(event, "god");
    }

    private void loadGameSettingsPage(ActionEvent event, String gameType) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/GameSettings.fxml"));
            Parent root = loader.load();

            GameSettingsController controller = loader.getController();
            controller.setGameType(gameType);

            Stage stage = new Stage();
            stage.setTitle("Game Settings");

            // Set fixed width and height
            stage.setMinWidth(600);
            stage.setMinHeight(400);
            stage.setMaxWidth(600);
            stage.setMaxHeight(400);

            stage.setScene(new Scene(root, 600, 400));
            stage.setResizable(false);
            stage.show();

            // Close the current stage
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
