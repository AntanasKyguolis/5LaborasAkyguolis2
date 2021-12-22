package com.company.Studentas;

import java.util.Comparator;

public class StudentasImpl implements com.company.Studentas.Studentas, Comparable<StudentasImpl> {
    private int pazymejimoNr;
    private String pavardeVardas, gimimoData, grupe;
    private double vidurkis;

    public StudentasImpl(int pazymejimoNr, String pavardeVardas, String gimimoData, String grupe, double vidurkis) {
        this.pazymejimoNr = pazymejimoNr;
        this.pavardeVardas = pavardeVardas;
        this.gimimoData = gimimoData;
        this.grupe = grupe;
        this.vidurkis = vidurkis;
    }

    @Override
    public int getPazymejimoNr() {
        return pazymejimoNr;
    }

    @Override
    public String getPavardeVardas() {
        return pavardeVardas;
    }

    @Override
    public void setPavardeVardas(String pavardeVardas) {
        this.pavardeVardas = pavardeVardas;
    }

    @Override
    public String getGimimoData() {
        return gimimoData;
    }

    @Override
    public String getGrupe() {
        return grupe;
    }

    @Override
    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    @Override
    public double getVidurkis() {
        return vidurkis;
    }

    @Override
    public void setVidurkis(double vidurkis) {
        this.vidurkis = vidurkis;
    }

    @Override
    public String toString() {
        return "StudentasImpl{" +
                "pazymejimo Nr.= " + pazymejimoNr +
                ", Pavarde Vardas = '" + pavardeVardas + '\'' +
                ", gimimo data = '" + gimimoData + '\'' +
                ", grupe = '" + grupe + '\'' +
                ", vidurkis = " + vidurkis +
                '}';
    }

    @Override
    public int compareTo(StudentasImpl o) {
        return Comparator
                .comparingDouble(StudentasImpl::getVidurkis)
                .reversed()
                .compare(this, o);
    }
}