package com.mmn.dames;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomePage extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox(new HomePageController(stage));
        Image logo = new Image(getClass().getResource("images/logo-dame.png").toExternalForm(), 200, 100, false, false);
        root.getChildren().add(0, new ImageView(logo));

        root.setId("root");
        Scene scene = new Scene(root, 900, 900);
        scene.getStylesheets().addAll(getClass().getResource("styleHomePage.css").toExternalForm());

        stage.setResizable(false);
        stage.setTitle("Dames");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResource("images/black_pion.png").toExternalForm()));
        stage.show();
    }
}
