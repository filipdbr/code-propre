package fr.diginamic.m052024.ex3.animaux;

/**
 * Classe abstraite représentant un Animal.
 * Cette classe sert de base pour différents types d'animaux avec des attributs communs.
 */
public abstract class Animal {

    // attributs
    /**
     * Identifiant unique pour chaque animal, utilisé comme clé principale.
     */
    protected static int id;

    /**
     * Nom de l'animal, par exemple "Simba".
     */
    protected String nom;

    /**
     * Type de l'animal, par exemple un mammifère, un oiseau ou un reptile.
     */
    protected String type;

    /**
     * Comportement de l'animal, par exemple herbivore ou carnivore.
     */
    protected String comportement;

    // constructeur
    /**
     * Constructeur de la classe Animal.
     *
     * @param id Identifiant unique de l'animal.
     * @param nom Nom de l'animal.
     * @param type Type de l'animal.
     * @param comportement Comportement de l'animal.
     */
    public Animal(int id, String nom, String type, String comportement) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }
    // méthodes

    /**
     * Getter pour l'identifiant de l'animal.
     *
     * @return l'identifiant de l'animal.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter pour l'identifiant de l'animal.
     *
     * @param id Nouveau identifiant de l'animal.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter pour le nom de l'animal.
     *
     * @return le nom de l'animal.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom de l'animal.
     *
     * @param nom Nouveau nom de l'animal.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour le type de l'animal.
     *
     * @return le type de l'animal.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter pour le type de l'animal.
     *
     * @param type Nouveau type de l'animal.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter pour le comportement de l'animal.
     *
     * @return le comportement de l'animal.
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter pour le comportement de l'animal.
     *
     * @param comportement Nouveau comportement de l'animal.
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    /**
     * Implémentation de la méthode toString pour représenter l'animal sous forme de chaîne de caractères.
     *
     * @return Une chaîne de caractères représentant l'animal.
     */
    @Override
    public String toString() {
        return "Animal [nom=" + nom + ", comportement=" + comportement + "]";
    }
}
