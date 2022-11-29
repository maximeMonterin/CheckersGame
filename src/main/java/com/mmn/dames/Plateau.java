package com.mmn.dames;

public class Plateau {
    //ATTRIBUTS
    private final int NB_CASES_NOIRES = 50;
    private final int NB_CASES_BLANCHES = 50;
    private final int NB_CASES_TOTALES = NB_CASES_BLANCHES + NB_CASES_NOIRES;

    //CONSTRUCTOR
    public Plateau() {}

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
