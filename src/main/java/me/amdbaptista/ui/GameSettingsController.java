package me.amdbaptista.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class GameSettingsController {

    @FXML
    private Spinner<Integer> playerCountSpinner;
    
    @FXML
    private TextField startingGoldField;
    
    @FXML
    private CheckBox alteredDeckCheckBox;
    
    @FXML
    private Button startFirstRoundButton;

    @FXML
    private void initialize() {
        // Initialize spinner for player count
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 4);
        playerCountSpinner.setValueFactory(valueFactory);

        // Set default starting gold
        startingGoldField.setText("100");

        // Set default for altered deck
        alteredDeckCheckBox.setSelected(false);

        startFirstRoundButton.setOnAction(event -> {
            // Handle starting the first round here
            System.out.println("Game settings confirmed!");
            System.out.println("Player Count: " + playerCountSpinner.getValue());
            System.out.println("Starting Gold: " + startingGoldField.getText());
            System.out.println("Altered Deck: " + alteredDeckCheckBox.isSelected());
        });
    }
}
