package fr.diginamic.m052024.ex3.zones;

import java.util.List;

/**
 * Classe représentant une Zone Carnivore, qui est une zone spécifique.
 * Une zone carnivore a une liste de comportements et des animaux avec des types et noms spécifiques.
 */
public class ZoneCarnivore extends Zone {

	/**
	 * Constructeur de la classe ZoneCarnivore.
	 *
	 * @param types Liste des types d'animaux dans la zone carnivore.
	 * @param noms Liste des noms d'animaux dans la zone carnivore.
	 * @param comportements Liste des comportements des animaux dans la zone carnivore.
	 *
	 * Exemples d'attributs:
	 *  - types: ["Tigre", "Lion", "Panthère"]
	 *  - noms: ["Sher Khan", "Mufasa", "Bagheera"]
	 *  - comportements: ["Agressif", "Carnivore", "Solitaire"]
	 */
	public ZoneCarnivore(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	/**
	 * Calcule la quantité de nourriture nécessaire par jour pour la zone carnivore.
	 * Il est estimé que chaque animal consomme 10 kg de nourriture par jour.
	 *
	 * @return Quantité de nourriture en kg par jour pour la zone carnivore.
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 10;
	}
}
