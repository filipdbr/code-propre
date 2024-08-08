package fr.diginamic.m052024.ex3;

import fr.diginamic.m052024.ex3.animaux.Animal;
import fr.diginamic.m052024.ex3.zones.Zone;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe représentant un Zoo.
 */
public class Zoo {

	// attributs
	/** Nom du zoo */
	private String nom;
	/** Ensemble des animaux présents dans le zoo */
	private Set<Animal> animals;
	/** Ensemble des zones présentes dans le zoo */
	private Set<Zone> zones;

	// constructeur

	/**
	 * Constructeur de la classe Zoo.
	 * @param nom Nom du zoo.
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.animals = new HashSet<>();
		this.zones = new HashSet<>();
	}

	//méthodes

	/**
	 * Ajoute un animal au zoo
	 * @param animal un animal a ajouté
	 */
	public void addAnimal(Animal animal){
		this.animals.add(animal);
	}

	/**
	 * Affiche la liste d'animaux de zoo
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animals){
			System.out.println(animal);
		}
	}

	/** Getters et setters */

	/** Getter et setter de nom */

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter et setter de zones */

	public Set<Zone> getZones() {
		return zones;
	}

	public void setZones(Set<Zone> zones) {
		this.zones = zones;
	}

	/** Getter et setter d'animaux' */

	public Set<Animal> getAnimals() {
		return animals;
	}
	
	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}

	/** Ajoute une zone au zoo
	 * @param zone one nouvelle zone a ajouter
	 */
	public void addZone(Zone zone){
		this.zones.add(zone);
	}

	/**
	 * Retourne une représentation de l'objet Zoo sous forme de chaîne de caractères.
	 * @return Une chaîne de caractères représentant le zoo.
	 */
	@Override
	public String toString() {
		return "Zoo{" + "nom='" + nom + '}';
	}
}