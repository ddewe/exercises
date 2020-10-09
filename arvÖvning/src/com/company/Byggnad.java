package com.company;

public class Byggnad {

    private String färg;//, gata, postnummer, ort, antalVåningar, antalKällarplan;

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg=färg;
    }

    public String getConsoleRow() {
        return "Färg: " + färg;
    }
}
