package fr.diginamic.m052024.ex3.animaux;

public class Oiseau extends Animal {

    public Oiseau(String nom, String comportement) {
        super(nom, "Oiseau", comportement);
    }

    @Override
    public String toString() {
        return "Oiseau {nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " +super.getComportement() + "\"";
    }
}
