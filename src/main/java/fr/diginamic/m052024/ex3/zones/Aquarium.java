package fr.diginamic.m052024.ex3.zones;

import java.util.List;

/**
 * Classe représentant un Aquarium, qui est une zone spécifique.
 * Un aquarium a une liste de comportements et des animaux avec des types et noms spécifiques.
 */
public class Aquarium extends Zone {

	/**
	 * Constructeur de la classe Aquarium.
	 *
	 * @param types Liste des types d'animaux dans l'aquarium.
	 * @param noms Liste des noms d'animaux dans l'aquarium.
	 * @param comportements Liste des comportements des animaux dans l'aquarium.
	 *
	 * Exemples d'attributs:
	 *  - types: ["Poisson", "Requin", "Méduse"]
	 *  - noms: ["Nemo", "Bruce", "Jelly"]
	 *  - comportements: ["Agressif", "Pacifique", "Timide"] (par exemple pour différents animaux)
	 */
	public Aquarium(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	/**
	 * Calcule la quantité de nourriture nécessaire par jour pour l'aquarium.
	 * Il est estimé que chaque animal consomme 0,2 kg de nourriture par jour.
	 *
	 * @return Quantité de nourriture en kg par jour pour l'aquarium.
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 0.2;
	}
}
