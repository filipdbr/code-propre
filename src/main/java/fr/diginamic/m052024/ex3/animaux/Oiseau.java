package fr.diginamic.m052024.ex3.animaux;

/* this class is an example of animal class
we could define some methods specific to this class however we won't do it as it's an example
*/
public class Oiseau extends Animal {

    // constructeur
    public Oiseau(int id, String nom, String comportement) {
        super(id, nom, "Oiseau", comportement);
    }

    /* override toString
    without id as it's not useful
    */
    @Override
    public String toString() {
        return "Oiseau {nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " +super.getComportement() + "\"";
    }
}
