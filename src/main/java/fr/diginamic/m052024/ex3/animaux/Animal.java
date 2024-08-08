package fr.diginamic.m052024.ex3.animaux;

/**
 * J'ai décidé de créer une classe abstraite d'animaux
 * */
public abstract class Animal {

    // attributs
    /** Map de variables */

    /**
     * id d'animal, la clé principale
     */
    protected static int id;

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
    public Animal(int id, String nom, String type, String comportement) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    // méthodes

    /**
     * getter pour l'id
     * @return l'id d'animal
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter pour le nom d'animal
     * @return le nom d'animal
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = nom;
    }

    /**
     * getter pour le type d'animal
     * @return le type d'animal
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter pour le comportement
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    /**
     * implementation de toString
     * @return
     */
    @Override
    public String toString() {
        return "Animal [nom = " + nom + ", comportement = " + comportement + "]";
    }
}
