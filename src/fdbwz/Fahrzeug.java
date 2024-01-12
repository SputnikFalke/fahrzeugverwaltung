package fdbwz;

import java.util.Date;

public class Fahrzeug {

    private String marke;
    private String modell;
    private int hubraum;

    enum TreibstoffArt
    {
        Benzin, Diesel, Elektrisch
    }

    private TreibstoffArt treibstoffArt;
    private double aktuellerkilometerstand;
    private int leistung;
    private Date Erstzulassung;
    private String color;
    private double leergewicht;

    public Fahrzeug() {
    }

    public Fahrzeug(String marke, String modell, int hubraum, TreibstoffArt treibstoffArt, double aktuellerkilometerstand, int leistung, Date erstzulassung, String color, double leergewicht) {
        this.marke = marke;
        this.modell = modell;
        this.hubraum = hubraum;
        this.treibstoffArt = treibstoffArt;
        this.aktuellerkilometerstand = aktuellerkilometerstand;
        this.leistung = leistung;
        Erstzulassung = erstzulassung;
        this.color = color;
        this.leergewicht = leergewicht;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public TreibstoffArt getTreibstoffArt() {
        return treibstoffArt;
    }

    public void setTreibstoffArt(TreibstoffArt treibstoffArt) {
        this.treibstoffArt = treibstoffArt;
    }

    public double getAktuellerkilometerstand() {
        return aktuellerkilometerstand;
    }

    public void setAktuellerkilometerstand(double aktuellerkilometerstand) {
        this.aktuellerkilometerstand = aktuellerkilometerstand;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public Date getErstzulassung() {
        return Erstzulassung;
    }

    public void setErstzulassung(Date erstzulassung) {
        Erstzulassung = erstzulassung;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLeergewicht() {
        return leergewicht;
    }

    public void setLeergewicht(double leergewicht) {
        this.leergewicht = leergewicht;
    }

    /*
    public void ChipiChipi(){
        System.out.println("Chipi chipi chapa chapa\n" +
                "Dubi dubi daba daba\n" +
                "Mágico mi dubi dubi\n" +
                "Bum, bum, bum, bum\n" +
                "Chipi chipi chapa chapa\n" +
                "Dubi dubi daba daba\n" +
                "Mágico mi dubi dubi\n" +
                "Bum");
    }*/


}
