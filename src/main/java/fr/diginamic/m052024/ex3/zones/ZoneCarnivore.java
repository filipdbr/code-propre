package fr.diginamic.m052024.ex3.zones;

import fr.diginamic.m052024.ex3.animaux.Animal;

import java.util.ArrayList;
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
	 * Constructeur par défaut de la classe ZoneCarnivore.
	 * Initialise une zone carnivore vide.
	 */
	public ZoneCarnivore() {
		super(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}


	/**
	 * Ajoute un animal à la zone carnivore et met à jour les listes de types, noms et comportements.
	 *
	 * @param animal L'animal à ajouter à la zone.
	 */
	@Override
	public void addAnimal(Animal animal) {
		super.addAnimal(animal);
		getTypes().add(animal.getType());
		getNoms().add(animal.getNom());
		getComportements().add(animal.getComportement());
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

	/**
	 * Implémentation de la méthode toString pour représenter la zone sous forme de chaîne de caractères.
	 *
	 * @return Une chaîne de caractères représentant la zone.
	 */
	@Override
	public String toString() {
		return "Zone{name = Carnivore, nombre d'animaux : " + getNoms().size() + "}";
	}

}
