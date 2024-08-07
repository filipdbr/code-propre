package fr.diginamic.m052024.ex3.animaux;

public class Mammifere extends Animal {

    public Mammifere(String nom, String comportement) {
        super(nom, "Mammifere", comportement);
    }

    @Override
    public String toString() {
        return "Mammifere{nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " +super.getComportement() + "\"";
    }
}
