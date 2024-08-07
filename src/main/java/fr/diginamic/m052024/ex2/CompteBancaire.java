package fr.diginamic.m052024.ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	// attributs
	/** Map de variables */

	/** solde : le solde initial du compte */
	private double solde;

	/** Constructeur */

	/**
	 * Constructeur d'un compte bancaire
	 * @param solde - le solde initial du compte
	 */
	protected CompteBancaire(double solde) {
		this.solde = solde;
	}

	/** Méthodes */

	/** Ajoute un montant au solde
	 * @param montant augmant le solde avec le montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Débite un montant du solde
	 * @param montant montant à débiter
	 */
	public abstract void debiterMontant(double montant);
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
}
