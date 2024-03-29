package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {
    //Application entry point
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root =
                FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Application.fxml")));
        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Application"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }
}
