package com.api.dbdistcalc.station;

import com.opencsv.bean.CsvBindByName;

public class Station {

    @CsvBindByName
    private Integer EVA_NR;

    @CsvBindByName
    private String DS100;

    @CsvBindByName
    private String IFOPT;

    @CsvBindByName
    private String NAME;

    @CsvBindByName
    private String Verkehr;

    @CsvBindByName(locale = "de-DE")
    private Double Laenge;

    @CsvBindByName(locale = "de-DE")
    private Double Breite;

    @CsvBindByName
    private String Betreiber_Name;

    @CsvBindByName
    private Integer Betreiber_Nr;

    @CsvBindByName
    private String Status;

    public Station(){

    }

    public Station(Integer EVA_NR, String DS100, String IFOPT, String NAME, String verkehr, Double laenge, Double breite, String betreiber_Name, Integer betreiber_Nr, String status) {
        this.EVA_NR = EVA_NR;
        this.DS100 = DS100;
        this.IFOPT = IFOPT;
        this.NAME = NAME;
        Verkehr = verkehr;
        Laenge = laenge;
        Breite = breite;
        Betreiber_Name = betreiber_Name;
        Betreiber_Nr = betreiber_Nr;
        Status = status;
    }

    public Integer getEVA_NR() {
        return EVA_NR;
    }

    public void setEVA_NR(Integer EVA_NR) {
        this.EVA_NR = EVA_NR;
    }

    public String getDS100() {
        return DS100;
    }

    public void setDS100(String DS100) {
        this.DS100 = DS100;
    }

    public String getIFOPT() {
        return IFOPT;
    }

    public void setIFOPT(String IFOPT) {
        this.IFOPT = IFOPT;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getVerkehr() {
        return Verkehr;
    }

    public void setVerkehr(String verkehr) {
        Verkehr = verkehr;
    }

    public Double getLaenge() {
        return Laenge;
    }

    public void setLaenge(Double laenge) {
        Laenge = laenge;
    }

    public Double getBreite() {
        return Breite;
    }

    public void setBreite(Double breite) {
        Breite = breite;
    }

    public String getBetreiber_Name() {
        return Betreiber_Name;
    }

    public void setBetreiber_Name(String betreiber_Name) {
        Betreiber_Name = betreiber_Name;
    }

    public Integer getBetreiber_Nr() {
        return Betreiber_Nr;
    }

    public void setBetreiber_Nr(Integer betreiber_Nr) {
        Betreiber_Nr = betreiber_Nr;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Station{" +
                "EVA_NR=" + EVA_NR +
                ", DS100='" + DS100 + '\'' +
                ", IFOPT='" + IFOPT + '\'' +
                ", NAME='" + NAME + '\'' +
                ", Verkehr='" + Verkehr + '\'' +
                ", Laenge=" + Laenge +
                ", Breite=" + Breite +
                ", Betreiber_Name='" + Betreiber_Name + '\'' +
                ", Betreiber_Nr=" + Betreiber_Nr +
                ", Status='" + Status + '\'' +
                '}';
    }
}
