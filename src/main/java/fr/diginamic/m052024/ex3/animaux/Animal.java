package fr.diginamic.m052024.ex3.animaux;

/**
 * J'ai décidé de créer une classe abstraite d'animaux
 * */
public abstract class Animal {

    // attributs
    /** Map de variables */

    /**
     * nom d'animal par example "Simba"
     */
    protected String nom;

    /**
     * Type par example une mammifère, un oiseau ou un reptile
     */
    protected String type;

    /**
     * comportement par example herbivore ou carnivore
     */
    protected String comportement;

    // constructeur
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    // méthodes

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComportement() {
        return comportement;
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return "Animal [nom = " + nom + ", comportement = " + comportement + "]";
    }
}
