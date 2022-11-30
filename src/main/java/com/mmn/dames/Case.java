package com.mmn.dames;

public class Case {
    //ATTRIBUTS
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
        return "Case{" +
                "usage=" + usage +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                '}';
    }
}
