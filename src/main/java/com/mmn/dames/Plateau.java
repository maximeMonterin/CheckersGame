package com.mmn.dames;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.io.*;

public class Plateau {
    //ATTRIBUTS
    private final int NB_CASES_NOIRES = 50;
    private final int NB_CASES_BLANCHES = 50;

    private final Case[][] matricePlateau = new Case[10][10];

    //CONSTRUCTOR
    public Plateau() {}

    public void loadPlateauStructure(GridPane pane) throws IOException {
        Image brownCaseImg = new Image(getClass().getResource("/com/mmn/dames/images/brown_case.png").toExternalForm(), 85, 85, false, false);
        Image skinCaseImg = new Image(getClass().getResource("/com/mmn/dames/images/skin_case.png").toExternalForm(), 85, 85, false, false);

        for(int ligne = 0; ligne < 10 ; ++ligne){
            Image currentImage;
            if (ligne % 2 == 0) {
                currentImage = brownCaseImg;
            } else {
                currentImage = skinCaseImg;
            }

            for(int colonne = 0 ; colonne < 10 ; ++colonne) {

                pane.add(new ImageView(currentImage), colonne, ligne);
                matricePlateau[ligne][colonne] = new Case(false, colonne, ligne);

                if (ligne != 4 && ligne != 5 && colonne % 2 == 0 && ligne % 2 == 0) {matricePlateau[ligne][colonne].setColor('M');}
                if (ligne != 4 && ligne != 5 && colonne % 2 != 0 && ligne % 2 != 0) {matricePlateau[ligne][colonne].setColor('M');}

                if (currentImage == skinCaseImg) {
                    currentImage = brownCaseImg;
                } else {
                    currentImage = skinCaseImg;
                }
            }
        }
    }

    public void loadPlateauPion(GridPane pane) throws IOException {
        Image blackPionImg = new Image(getClass().getResource("/com/mmn/dames/images/black_pion.png").toExternalForm(), 75, 75, false, false);
        Image whitePionImg = new Image(getClass().getResource("/com/mmn/dames/images/white_pion.png").toExternalForm(), 75, 75, false, false);

        for(int ligne = 0; ligne < 10 ; ++ligne){
            for(int colonne = 0; colonne < 10 ; ++colonne){
                if ((ligne <= 3) && matricePlateau[ligne][colonne].getColor() == 'M'){
                    pane.add(new ImageView(blackPionImg), colonne, ligne);
                    matricePlateau[ligne][colonne].setPion(new Pion(colonne, ligne, "Noir"));
                }
                if ((6 <= ligne && ligne <= 9) && matricePlateau[ligne][colonne].getColor() == 'M'){
                    pane.add(new ImageView(whitePionImg), colonne, ligne);
                    matricePlateau[ligne][colonne].setPion(new Pion(colonne, ligne, "Blanc"));
                }
            }
        }
    }

    //GETTERS
    public int getNB_CASES_NOIRES() {
        return NB_CASES_NOIRES;
    }

    public int getNB_CASES_BLANCHES() {
        return NB_CASES_BLANCHES;
    }

    public int getNB_CASES_TOTALES() {
        return NB_CASES_BLANCHES + NB_CASES_NOIRES;
    }
}
