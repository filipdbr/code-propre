package fr.diginamic.m052024.ex3.animaux;

/**
 * Classe représentant un Mammifère.
 * Cette classe est un exemple d'une classe d'animal spécifique.
 * On pourrait définir des méthodes spécifiques à cette classe, mais elles ne sont pas implémentées ici car il s'agit d'un exemple.
 */
public class Mammifere extends Animal {

    /**
     * Constructeur de la classe Mammifere.
     *
     * @param id Identifiant unique du mammifère.
     * @param nom Nom du mammifère.
     * @param comportement Comportement du mammifère, par exemple "Herbivore" ou "Carnivore".
     */
    public Mammifere(int id, String nom, String comportement) {
        super(id, nom, "Mammifere", comportement);
    }

    /**
     * Redéfinition de la méthode toString.
     * Retourne une représentation textuelle du mammifère, sans inclure l'id car ce n'est pas nécessaire ici.
     *
     * @return Une chaîne de caractères représentant le mammifère.
     */
    @Override
    public String toString() {
        return "Mammifere{nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " + super.getComportement() + "\"}";
    }
}
