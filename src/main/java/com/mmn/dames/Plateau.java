package com.mmn.dames;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.*;

public class Plateau {
    //ATTRIBUTS
    private final int NB_CASES_NOIRES = 50;
    private final int NB_CASES_BLANCHES = 50;
    private final int NB_CASES_TOTALES = NB_CASES_BLANCHES + NB_CASES_NOIRES;

    //CONSTRUCTOR
    public Plateau() {}
    public Pane loadPlateau(Pane pane) throws IOException {

        File filePlateau = new File("C:\\Users\\under\\IdeaProjects\\Dames\\plateau.txt");
        Image brownCase = new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\brown_case.png");
        Image skinCase = new Image("C:\\Users\\under\\IdeaProjects\\Dames\\images\\skin_case.png");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePlateau), "UTF-8"));
        String line = reader.readLine();

        while(line != null){
            HBox linePlateau = new HBox();
            for(int i = 0 ; i < line.length() ; ++i){
                if(Character.getNumericValue(line.charAt(i)) == 0){linePlateau.getChildren().add(new ImageView(brownCase));}
                else{linePlateau.getChildren().add(new ImageView(skinCase));}
            }
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
