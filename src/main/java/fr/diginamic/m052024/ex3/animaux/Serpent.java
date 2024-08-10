package fr.diginamic.m052024.ex3.animaux;

/**
 * Classe représentant un Serpent.
 * Cette classe est un exemple d'une classe d'animal spécifique.
 * On pourrait définir des méthodes spécifiques à cette classe, mais elles ne sont pas implémentées ici car il s'agit d'un exemple.
 */
public class Serpent extends Animal {

    /**
     * Constructeur de la classe Serpent.
     *
     * @param id Identifiant unique du serpent.
     * @param prenom Prénom du serpent
     * @param nom Nom de l'Serpent.
     * @param comportement Comportement du serpent, par défault le "Carnivore".
     */
    public Serpent(int id, String prenom, String nom, String comportement) {
        super(id, prenom, nom, "Serpent", "Carnivore");
    }

    /**
     * Redéfinition de la méthode toString.
     * Retourne une représentation textuelle de l'Serpent, sans inclure l'id car ce n'est pas nécessaire ici.
     *
     * @return Une chaîne de caractères représentant l'Serpent.
     */
    @Override
    public String toString() {
        return "Serpent { prénom : " +
                super.getPrenom() +
                ", nom : " + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " + super.getComportement() + "}";
    }

}
