package com.mmn.dames;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import java.io.*;

public class Plateau {
    //ATTRIBUTS
    private final int NB_CASES_NOIRES = 50;
    private final int NB_CASES_BLANCHES = 50;

    private final Case[][] matricePlateau = new Case[10][10];

    //CONSTRUCTOR
    public Plateau() {}

    /*
     * loadPlateauStructure(GridPane pane) {}
     * Cette méthode permet de générer la structure du tableau
     * Elle ajoute dans la matrice représentant le plateau les cases avec différentes couleurs (M si un pion doit y etre mit, S sinon)
     * Elle ajoute également dans notre GridPane les images des cases de notre damier
     */
    public void loadPlateauStructure(GridPane pane) {
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
                else if (ligne != 4 && ligne != 5 && colonne % 2 != 0 && ligne % 2 != 0) {matricePlateau[ligne][colonne].setColor('M');}
                else {matricePlateau[ligne][colonne].setColor('S');}

                if (currentImage == skinCaseImg) {
                    currentImage = brownCaseImg;
                } else {
                    currentImage = skinCaseImg;
                }
            }
        }
    }

    /*
     * loadPlateauPion(GridPane pane) {}
     * Cette méthode permet de générer les pions sur notre damier
     * Elle ajoute dans les cases composantes de la matrice du plateau les pions qui doivent y être stockées
     * Elle ajoute également dans notre GridPane les images des pions et les affiche au bon endroit
     */
    public void loadPlateauPion(GridPane pane) {
        Image blackPionImg = new Image(getClass().getResource("/com/mmn/dames/images/black_pion.png").toExternalForm(), 75, 75, false, false);
        Image whitePionImg = new Image(getClass().getResource("/com/mmn/dames/images/white_pion.png").toExternalForm(), 75, 75, false, false);

        for(int ligne = 0; ligne < 10 ; ++ligne){
            for(int colonne = 0; colonne < 10 ; ++colonne){
                if ((ligne <= 3) && matricePlateau[ligne][colonne].getColor() == 'M'){
                    pane.add(new ImageView(blackPionImg), colonne, ligne);
                    matricePlateau[ligne][colonne].setPion(new Pion(colonne, ligne, "Noir"));
                    matricePlateau[ligne][colonne].setUsage(true);
                }
                if ((6 <= ligne && ligne <= 9) && matricePlateau[ligne][colonne].getColor() == 'M'){
                    pane.add(new ImageView(whitePionImg), colonne, ligne);
                    matricePlateau[ligne][colonne].setPion(new Pion(colonne, ligne, "Blanc"));
                    matricePlateau[ligne][colonne].setUsage(true);
                }
            }
        }
    }

    public void clickOnCase(GridPane pane) {
        pane.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double caseYEvent = event.getY() / 100;
                double caseXEvent = event.getX() / 100;

                int caseY = 0;
                int caseX = (int) caseXEvent;

                //Ajustement des coordonées du clique pour obtenir la case correspondante en Y
                if(caseYEvent < 1.09){caseY = 0;}
                if(caseYEvent > 1.09 && caseYEvent < 1.95){caseY = 1;}
                if(caseYEvent > 1.95 && caseYEvent < 2.8){caseY = 2;}
                if(caseYEvent > 2.8 && caseYEvent < 3.6){caseY = 3;}
                if(caseYEvent > 3.6 && caseYEvent < 4.5){caseY = 4;}
                if(caseYEvent > 4.5 && caseYEvent < 5.3){caseY = 5;}
                if(caseYEvent > 5.3 && caseYEvent < 6.2){caseY = 6;}
                if(caseYEvent > 6.2 && caseYEvent < 7){caseY = 7;}
                if(caseYEvent > 7 && caseYEvent < 7.9){caseY = 8;}
                if(caseYEvent > 7.9){caseY = 9;}

                //Ajustement des coordonées du clique pour obtenir la case correspondante en X
                if(caseXEvent < 1.09){caseX = 0;}
                if(caseXEvent > 1.09 && caseXEvent < 1.95){caseX = 1;}
                if(caseXEvent > 1.95 && caseXEvent < 2.8){caseX = 2;}
                if(caseXEvent > 2.8 && caseXEvent < 3.6){caseX = 3;}
                if(caseXEvent > 3.6 && caseXEvent < 4.5){caseX = 4;}
                if(caseXEvent > 4.5 && caseXEvent < 5.3){caseX = 5;}
                if(caseXEvent > 5.3 && caseXEvent < 6.2){caseX = 6;}
                if(caseXEvent > 6.2 && caseXEvent < 7){caseX = 7;}
                if(caseXEvent > 7 && caseXEvent < 7.9){caseX = 8;}
                if(caseXEvent > 7.9){caseX = 9;}

                System.out.println("Vous avez cliqué sur " + caseY + " " + caseX);
            }
        });
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
