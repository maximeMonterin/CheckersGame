package com.mmn.dames;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController extends VBox {
    private Stage primaryStage;

    @FXML
    private ImageView logo;


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
    private void initialize() {
        this.logo.setImage(new Image(getClass().getResource("images/logo-dame.png").toExternalForm(), 400, 200, false, false));
    }

    @FXML
    private void onPlayButtonClick() throws IOException {
        Scene scene = new Dames().loadGame();
        scene.getStylesheets().add(getClass().getResource("styleDamesPage.css").toExternalForm());
        this.primaryStage.setScene(scene);
    }

    @FXML
    private void onQuitButtonClick() {
        this.primaryStage.close();
    }
}