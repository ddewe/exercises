package com.company;

public class Lägenhet extends Byggnad {

    private String lägenhetsnummer;//, antalHissar;

    public String getLägenhetsnummer() {
        return lägenhetsnummer;
    }

    public void setLägenhetsnummer(String lägenhetsnummer) {
        this.lägenhetsnummer=lägenhetsnummer;
    }

    public String getConsoleRow() {
        return "Färg: " + super.getFärg() + ", Lägenhetsnummer: " + lägenhetsnummer;
    }
}
