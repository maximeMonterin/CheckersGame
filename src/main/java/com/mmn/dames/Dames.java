package com.mmn.dames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Dames extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane pane = new GridPane();
        Plateau plateau = new Plateau();
        plateau.loadPlateauStructure(pane);

        Scene scene = new Scene(pane, 1000, 1000);

        stage.setResizable(false);
        stage.setTitle("Dames");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResource("/com/mmn/dames/images/black_pion.png").toExternalForm()));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}