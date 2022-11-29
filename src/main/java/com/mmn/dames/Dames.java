package com.mmn.dames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Dames extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Pane pane = new VBox();
        Plateau plateau = new Plateau();

        Scene scene = new Scene(plateau.loadPlateauStructure(pane), 1000, 1000);

        stage.setTitle("Dames");
        stage.setScene(scene);
        stage.getIcons().add(new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\black_pion.png"));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}