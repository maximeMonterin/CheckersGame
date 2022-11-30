package com.mmn.dames;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController extends VBox {
    private Stage primaryStage;

    public HomePageController(Stage primaryStage) {
        this.primaryStage = primaryStage;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/mmn/dames/homepage-button.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @FXML
    protected void onHelloButtonClick() throws IOException {
        Scene scene = new Dames().loadGame();
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        this.primaryStage.setScene(scene);
    }

    @FXML
    protected void onQuitButtonClick() {
        this.primaryStage.close();
    }
}