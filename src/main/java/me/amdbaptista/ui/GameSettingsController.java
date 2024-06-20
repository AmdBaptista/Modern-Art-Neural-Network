package me.amdbaptista.ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GameSettingsController {

    @FXML
    private Spinner<Integer> playerCountSpinner;

    @FXML
    private TextField startingGoldField;

    @FXML
    private CheckBox alteredDeckCheckBox;

    @FXML
    private Label startingGoldLabel;

    @FXML
    private Label alteredDeckLabel;

    private String gameType; // Assuming this is set somewhere else

    public void initialize() {
        // Initialize spinner with default value and constraints
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(3, 5, 3);
        playerCountSpinner.setValueFactory(valueFactory);

        // Hide elements not needed for normal game mode
        startingGoldLabel.setVisible(false);
        startingGoldField.setVisible(false);
        alteredDeckLabel.setVisible(false);
        alteredDeckCheckBox.setVisible(false);
        // Set default starting gold and altered deck values
        startingGoldField.setText("100");
        alteredDeckCheckBox.setSelected(false); // Default is false
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;

        // Adjust visibility and UI based on game type
        if ("normal".equals(gameType)) {
            // Hide elements not needed for normal game mode
            startingGoldLabel.setVisible(false);
            startingGoldField.setVisible(false);
            alteredDeckLabel.setVisible(false);
            alteredDeckCheckBox.setVisible(false);
        } else if ("god".equals(gameType)) {
            // Show all elements for god game mode
            startingGoldLabel.setVisible(true);
            startingGoldField.setVisible(true);
            alteredDeckLabel.setVisible(true);
            alteredDeckCheckBox.setVisible(true);
        }
    }

    @FXML
    private void saveSettings() {
        int playerCount = playerCountSpinner.getValue();
        String startingGold = startingGoldField.getText();
        boolean alteredDeck = alteredDeckCheckBox.isSelected();

        // Do something with the settings, like save them
        System.out.println("Player Count: " + playerCount);
        if ("god".equals(gameType)) {
            System.out.println("Starting Gold: " + startingGold);
            System.out.println("Altered Deck: " + alteredDeck);
        }
    }

    @FXML
    private void goBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/StartMenu.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Modern Art");
            stage.setScene(new Scene(root, 600, 400));

            stage.setWidth(600);
            stage.setHeight(400);
            stage.setResizable(false);
            
            stage.show();

            // Close the current stage
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
