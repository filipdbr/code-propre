package fr.diginamic.m052024.ex2;

public class CompteCourante extends CompteBancaire {

    // attributs
    /** Map de variables */

    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    // constructeur

    /**
     * Constructeur
     * @param solde le solde intial du compte
     * @param decouvert le découvert inital du compte
     */
    public CompteCourante(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    // méthodes

    /**
     * Mise en œuvre pratique de la méthode :
     * si la différence entre le solde du compte et le montant
     * est inférieure à l'inverse du débit,
     * la transaction est acceptée. Sinon rejeté.
     * @param montant montant à débiter
     */
    @Override
    public void debiterMontant(double montant) {
        if ((getSolde() - montant) >= -decouvert) {
            setSolde(getSolde() - montant);
        } else {
            System.out.println("Transaction refusée");
        }
    }

    // getters et setters

    /**
     * getter pour le découvert
     * @return le découvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * setter pour le découvert
     * @param decouvert le nouveau découvert
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
