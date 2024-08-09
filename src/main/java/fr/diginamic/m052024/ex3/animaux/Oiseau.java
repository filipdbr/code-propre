package fr.diginamic.m052024.ex3.animaux;

/**
 * Classe représentant un Oiseau.
 * Cette classe est un exemple d'une classe d'animal spécifique.
 * On pourrait définir des méthodes spécifiques à cette classe, mais elles ne sont pas implémentées ici car il s'agit d'un exemple.
 */
public class Oiseau extends Animal {

    /**
     * Constructeur de la classe Oiseau.
     *
     * @param id Identifiant unique de l'oiseau.
     * @param nom Nom de l'oiseau.
     * @param comportement Comportement de l'oiseau, par exemple "Herbivore" ou "Carnivore".
     */
    public Oiseau(int id, String nom, String comportement) {
        super(id, nom, "Oiseau", comportement);
    }

    /**
     * Redéfinition de la méthode toString.
     * Retourne une représentation textuelle de l'oiseau, sans inclure l'id car ce n'est pas nécessaire ici.
     *
     * @return Une chaîne de caractères représentant l'oiseau.
     */
    @Override
    public String toString() {
        return "Oiseau {nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " + super.getComportement() + "\"}";
    }
}
