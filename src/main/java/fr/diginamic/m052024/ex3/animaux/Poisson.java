package fr.diginamic.m052024.ex3.animaux;

/**
 * Classe représentant un Poisson.
 * Cette classe est un exemple d'une classe d'animal spécifique.
 * On pourrait définir des méthodes spécifiques à cette classe, mais elles ne sont pas implémentées ici car il s'agit d'un exemple.
 */
public class Poisson extends Animal {

    /**
     * Constructeur de la classe Poisson.
     *
     * @param id Identifiant unique de l'Poisson.
     * @param nom Nom de l'Poisson.
     * @param comportement Comportement de l'Poisson, par exemple "Herbivore" ou "Carnivore".
     */
    public Poisson(int id, String nom, String comportement) {
        super(id, nom, "Poisson", comportement);
    }

    /**
     * Redéfinition de la méthode toString.
     * Retourne une représentation textuelle de l'Poisson, sans inclure l'id car ce n'est pas nécessaire ici.
     *
     * @return Une chaîne de caractères représentant l'Poisson.
     */
    @Override
    public String toString() {
        return "Poisson {nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " + super.getComportement() + "\"}";
    }
}
