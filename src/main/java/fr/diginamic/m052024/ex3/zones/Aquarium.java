package fr.diginamic.m052024.ex3.zones;

import fr.diginamic.m052024.ex3.animaux.Animal;

import java.util.ArrayList;
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
	 * Constructeur par défaut de la classe Aquarium.
	 * Initialise une zone carnivore vide.
	 */
	public Aquarium() {
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
	 * Calcule la quantité de nourriture nécessaire par jour pour l'aquarium.
	 * Il est estimé que chaque animal consomme 0,2 kg de nourriture par jour.
	 *
	 * @return Quantité de nourriture en kg par jour pour l'aquarium.
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 0.2;
	}

	/**
	 * Implémentation de la méthode toString pour représenter la zone sous forme de chaîne de caractères.
	 *
	 * @return Une chaîne de caractères représentant la zone.
	 */
	@Override
	public String toString() {
		return "Zone{name = Aquarium, nombre d'animaux : " + getNoms().size() + "}";
	}
}
