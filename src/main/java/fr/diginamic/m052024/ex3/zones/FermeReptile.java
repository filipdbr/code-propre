package fr.diginamic.m052024.ex3.zones;

import fr.diginamic.m052024.ex3.animaux.Animal;

import java.util.ArrayList;
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
	 * Constructeur par défaut de la classe FermeReptile.
	 * Initialise une zone carnivore vide.
	 */
	public FermeReptile() {
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
	 * Calcule la quantité de nourriture nécessaire par jour pour la ferme de reptiles.
	 * Il est estimé que chaque animal consomme 0,1 kg de nourriture par jour.
	 *
	 * @return Quantité de nourriture en kg par jour pour la ferme de reptiles.
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 0.1;
	}

	/**
	 * Implémentation de la méthode toString pour représenter la zone sous forme de chaîne de caractères.
	 *
	 * @return Une chaîne de caractères représentant la zone.
	 */
	@Override
	public String toString() {
		return "Zone{name = Reptiles, nombre d'animaux : " + getNoms().size() + "}";
	}
}
