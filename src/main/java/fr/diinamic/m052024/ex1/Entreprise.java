package fr.diinamic.m052024.ex1;

import java.util.Date;

/**
 * Représente une entreprise avec des informations de base comme le siret,
 * le nom, l'adresse et la date de création.
 */

public class Entreprise {

	/** Map de variables */

	/** Numéro SIRET de l'entreprise */
	public int siret;

	/** Nom de l'entreprise */
	public String nom;

	/** Adresse de l'entreprise */
	public String adresse;

	/** Date de création de l'entreprise */
	public Date dateCreation;

	/** Capital maximum autorisé pour l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/** Méthodes */

	/**
	 * Affiche le statut de l'entreprise.
	 */
	public void afficherStatut() {
		// Méthode à implémenter
	}

	// + getters, setters et toString

}
