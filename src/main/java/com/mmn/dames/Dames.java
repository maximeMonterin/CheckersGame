package com.mmn.dames;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class Dames {
    public Scene loadGame() throws IOException {
        HomePage.setCLickCpt(0);
        GridPane pane = new GridPane();
        pane.setId("pane");
        pane.setAlignment(Pos.CENTER);

        Plateau plateau = new Plateau();
        plateau.loadPlateauStructure(pane);
        plateau.loadPlateauPion(pane);

        Case currCase = plateau.clickOnPlateau(pane, plateau.getMatricePlateau());
        if(HomePage.getClickCpt() % 2 == 0){
            plateau.pionMouvement(currCase, pane);
        }

        Scene scene = new Scene(pane, 900, 900);

        return scene;
    }
}