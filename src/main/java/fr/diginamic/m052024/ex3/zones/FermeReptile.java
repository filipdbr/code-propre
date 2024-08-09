package fr.diginamic.m052024.ex3.zones;

import java.util.List;

/**
 * Classe représentant une Ferme de Reptiles, qui est une zone spécifique.
 * Une ferme de reptiles a une liste de comportements et des animaux avec des types et noms spécifiques.
 */
public class FermeReptile extends Zone {

	/**
	 * Constructeur de la classe FermeReptile.
	 *
	 * @param types Liste des types d'animaux dans la ferme de reptiles.
	 * @param noms Liste des noms d'animaux dans la ferme de reptiles.
	 * @param comportements Liste des comportements des animaux dans la ferme de reptiles.
	 *
	 * Exemples d'attributs:
	 *  - types: ["Serpent", "Crocodile", "Lézard"]
	 *  - noms: ["Kaa", "Croco", "Gecko"]
	 *  - comportements: ["Carnivore", "Agressif", "Furtif"]
	 */
	public FermeReptile(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	/**
	 * Calcule la quantité de nourriture nécessaire par jour pour la ferme de reptiles.
	 * Il est estimé que chaque animal consomme 0,1 kg de nourriture par jour.
	 *
	 * @return Quantité de nourriture en kg par jour pour la ferme de reptiles.
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 0.1;
	}
}
