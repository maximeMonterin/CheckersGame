package com.mmn.dames;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.*;
import java.util.List;

public class Plateau {
    //ATTRIBUTS
    private final int NB_CASES_NOIRES = 50;
    private final int NB_CASES_BLANCHES = 50;
    private final int NB_CASES_TOTALES = NB_CASES_BLANCHES + NB_CASES_NOIRES;

    private Case[][] matricePlateau = new Case[10][10];

    //CONSTRUCTOR
    public Plateau() {}

    public Pane loadPlateauStructure(Pane pane) throws IOException {
        Case caseMatrice;

        int cptLigne = 0;

        File filePlateau = new File("C:\\Users\\under\\IdeaProjects\\Dames\\plateau.txt");
        Image brownCaseImg = new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\brown_case.png");
        Image skinCaseImg = new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\skin_case.png");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePlateau), "UTF-8"));
        String line = reader.readLine();

        while(line != null){
            HBox linePlateau = new HBox();
            for(int i = 0 ; i < line.length() ; ++i){
                if(Character.getNumericValue(line.charAt(i)) == 0){
                    caseMatrice = new Case(false, i, cptLigne);
                    matricePlateau[cptLigne][i] = caseMatrice;
                    linePlateau.getChildren().add(new ImageView(brownCaseImg));
                }
                else{
                    caseMatrice = new Case(false, i, cptLigne);
                    matricePlateau[cptLigne][i] = caseMatrice;
                    linePlateau.getChildren().add(new ImageView(skinCaseImg));
                }
            }
            ++cptLigne;
            pane.getChildren().add(linePlateau);
            line = reader.readLine();
        }

        reader.close();

        return pane;
    }

    //GETTERS
    public int getNB_CASES_NOIRES() {
        return NB_CASES_NOIRES;
    }

    public int getNB_CASES_BLANCHES() {
        return NB_CASES_BLANCHES;
    }

    public int getNB_CASES_TOTALES() {
        return NB_CASES_TOTALES;
    }
}
