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
     * @param id Identifiant unique de poisson.
     * @param prenom Prénom de poisson.
     * @param nom Nom de poisson.
     * @param comportement Comportement de poisson, par exemple "Herbivore" ou "Carnivore".
     */
    public Poisson(int id, String prenom, String nom, String comportement) {
        super(id, prenom, nom, "Poisson", comportement);
    }

    /**
     * Redéfinition de la méthode toString.
     * Retourne une représentation textuelle de l'Poisson, sans inclure l'id car ce n'est pas nécessaire ici.
     *
     * @return Une chaîne de caractères représentant l'Poisson.
     */
    @Override
    public String toString() {
        return "Poisson { prénom : " +
                super.getPrenom() +
                ", nom : " + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " + super.getComportement() + "}";
    }

}
