package me.amdbaptista.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/StartMenu.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Modern Art");
        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.setWidth(600);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
