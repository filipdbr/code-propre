package fr.diginamic.m052024.ex2;

/** Représente un compte bancaire de type compte courante (type=CC)
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
	
	/** Getter pour le solde
	 * @return pouur le solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * setter pour le solde
	 * @param solde le nouveau solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
