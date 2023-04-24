package com.example.targetheartratecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TargetHeartRateCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TargetHeartRateCalculator.class.getResource("TargetHeartRateCalculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Target Heart Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}