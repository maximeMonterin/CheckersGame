package com.mmn.dames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Dames {
    public Scene loadGame() throws IOException {
        GridPane pane = new GridPane();
        pane.setId("pane");
        pane.setAlignment(Pos.CENTER);

        Plateau plateau = new Plateau();
        plateau.loadPlateauStructure(pane);

        Scene scene = new Scene(pane, 900, 900);

        return scene;
    }
}