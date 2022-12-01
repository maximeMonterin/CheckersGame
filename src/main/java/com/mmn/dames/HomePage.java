package com.mmn.dames;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomePage extends Application {

    private static int CLICK_CPT;

    public static int getClickCpt() {
        return CLICK_CPT;
    }

    public static void setCLickCpt(int value) {
        CLICK_CPT = value;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        CLICK_CPT = 0;
        VBox root = new HomePageController(stage);

        root.setId("root");
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(getClass().getResource("styleHomePage.css").toExternalForm());

        stage.setResizable(false);
        stage.setTitle("Dames");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResource("images/black_pion.png").toExternalForm()));
        stage.show();
    }
}
