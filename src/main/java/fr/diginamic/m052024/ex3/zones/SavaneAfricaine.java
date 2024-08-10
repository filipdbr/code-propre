package fr.diginamic.m052024.ex3.zones;

import fr.diginamic.m052024.ex3.animaux.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant la Savane Africaine, qui est une zone spécifique.
 * La savane africaine a une liste de comportements et des animaux avec des types et noms spécifiques.
 */
public class SavaneAfricaine extends Zone {

	/**
	 * Constructeur de la classe SavaneAfricaine.
	 *
	 * @param types Liste des types d'animaux dans la savane africaine.
	 * @param noms Liste des noms d'animaux dans la savane africaine.
	 * @param comportements Liste des comportements des animaux dans la savane africaine.
	 *
	 * Exemples d'attributs:
	 *  - types: ["Lion", "Éléphant", "Girafe"]
	 *  - noms: ["Simba", "Dumbo", "Geoffrey"]
	 *  - comportements: ["Carnivore", "Herbivore", "Pacifique"]
	 */
	public SavaneAfricaine(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	/**
	 * Constructeur par défaut de la classe SavaneAfricaine.
	 * Initialise une zone carnivore vide.
	 */
	public SavaneAfricaine() {
		super(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}

	/**
	 * Ajoute un animal à la zone carnivore et met à jour les listes de types, noms et comportements.
	 *
	 * @param animal L'animal à etre ajouter à la zone.
	 */
	@Override
	public void addAnimal(Animal animal) {
		super.addAnimal(animal);
		getTypes().add(animal.getType());
		getNoms().add(animal.getNom());
		getComportements().add(animal.getComportement());
	}

	/**
	 * Calcule la quantité de nourriture nécessaire par jour pour la savane africaine.
	 * Il est estimé que chaque animal consomme 10 kg de nourriture par jour.
	 *
	 * @return Quantité de nourriture en kg par jour pour la savane africaine.
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 10;
	}

	/**
	 * Implémentation de la méthode toString pour représenter la zone sous forme de chaîne de caractères.
	 *
	 * @return Une chaîne de caractères représentant la zone.
	 */
	@Override
	public String toString() {
		return "Zone{name = Savane Africaine, nombre d'animaux : " + getNoms().size() + "}";
	}
}
