package com.mmn.dames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Dames extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Pane pane = new HBox();

        Image brownCase = new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\brown_case.png");
        Image skinCase = new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\skin_case.png");
        pane.getChildren().add(new ImageView(brownCase)); pane.getChildren().add(new ImageView(skinCase));

        Scene scene = new Scene(pane, 2000, 1000);
        scene.setFill(Color.web("1d3557"));
        stage.setTitle("Dames");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}