package fr.diginamic.m052024.ex3.animaux;

/* this class is an example of animal class
we could define some methods specific to this class however we won't do it as it's an example
*/
public class Mammifere extends Animal {

    // constructeur
    public Mammifere(int id, String nom, String comportement) {
        super(id, nom, "Mammifere", comportement);
    }

    /* override toString
    without id as it's not useful
     */
    @Override
    public String toString() {
        return "Mammifere{nom : "
                + super.getNom()
                + ", type : " + super.getType()
                + ", comportement : " +super.getComportement() + "\"";
    }
}
