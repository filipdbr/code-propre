package fr.diginamic.m052024.ex2;

public class LivretA extends CompteBancaire {

	// attributs
	/** Map de variables */

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	// constructeur
	/**
	 * Constructeur
	 * @param solde le solde intial du compte
	 * @param tauxRemuneration le taux de remuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	// méthodes

	/**
	 * Mise en œuvre pratique de la méthode :
	 * si la différence entre le solde du compte et le montant
	 * est inférieure à zéro,
	 * la transaction est acceptée. Sinon rejeté.
	 * @param montant montant à débiter
	 */
	@Override
	public void debiterMontant(double montant) {
		if ((getSolde() - montant) >= 0) {
			setSolde(getSolde() - montant);
		} else {
			System.out.println("Transaction refusée");
		}
	}

	/** Appliquer la rémunération annuelle */
	public void appliquerRemuAnnuelle() {
		setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
	}

	// getters et setters

	/**
	 * getter pour le taux
	 * @return le taux de remuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * setter pour le taux
	 * @param tauxRemuneration le nouveau taux
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
