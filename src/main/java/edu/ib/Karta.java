package edu.ib;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Karta {
    /*
    okresla wlasciwosci karty - kolor i range
     */
    private String kolor;
    private String ranga;
    private ImageView obrazek;
    private ImageView tylKarty;

    public Karta(String kolor, String ranga) {
        this.kolor = kolor;
        this.ranga = ranga;
//        this.tylKarty = ImageView("fxml/cards/cardback.png");
    }
    public String getKolor() {
        return kolor;
    }

    public String getRanga() {
        return ranga;
    }

    public boolean sameKarta (Karta innaKarta) {
        return ranga.equals(innaKarta.ranga) &&
                kolor.equals(innaKarta.kolor);
    }

    public void setObrazek(ImageView obrazek) {
        this.obrazek = obrazek;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "kolor='" + kolor + '\'' +
                ", ranga='" + ranga + '\'' +
                '}';
    }
}
