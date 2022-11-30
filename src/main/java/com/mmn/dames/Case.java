package com.mmn.dames;

public class Case {
    //ATTRIBUTS
    //Permet de gérer les colllisions entre pions
    private boolean usage;
    private int posX;
    private int posY;
    private Pion pion = null;
    private char color;

    public Case(boolean usage, int posX, int posY) {
        this.usage = usage;
        this.posX = posX;
        this.posY = posY;
    }

    public Case(boolean usage, int posX, int posY, Pion pion) {
        this.usage = usage;
        this.posX = posX;
        this.posY = posY;
        this.pion = pion;
    }

    public boolean isUsage() {
        return usage;
    }

    public void setUsage(boolean usage) {
        this.usage = usage;
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

    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;
    }

    public char getColor() {
        return color;
    }
    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String str = "";
        if(pion != null){ str = "Case{" +
                "usage=" + usage +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                ", pion=" + pion.toString() +
                '}';}
        else{ str = "Case{" +
                "usage=" + usage +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                '}';}

        return str;
    }
}
