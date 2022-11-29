package com.mmn.dames;

public class Pion {
    private int posX;
    private int posY;
    private String couleur;

    public Pion(int posX, int posY, String couleur) {
        this.posX = posX;
        this.posY = posY;
        this.couleur = couleur;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
