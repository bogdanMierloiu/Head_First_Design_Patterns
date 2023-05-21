package com.bogdancode.swing_observer_app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXObserverExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Observer Example");

        BorderPane root = new BorderPane();
        Button button = new Button("Should I do it?");
        button.setOnAction(new AngelListener());
        button.setOnAction(new DevilListener());
        root.setCenter(button);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static class AngelListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    static class DevilListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Come on, do it!");
        }
    }
}
