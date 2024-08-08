package fr.diginamic.m052024.ex3;

import fr.diginamic.m052024.ex3.animaux.Animal;
import fr.diginamic.m052024.ex3.zones.Zone;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

	// attributs
	private String nom;
	private Set<Animal> animals;
	private Set<Zone> zones;

	// constructeur
	public Zoo(String nom){
		this.nom = nom;
		this.animals = new HashSet<>();
		this.zones = new HashSet<>();
	}

	//méthodes
	public void addAnimal(Animal animal){
		this.animals.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal : animals){
			System.out.println(animal);
		}
	}

	/** Getter for nom
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	// provides access to this set
	public Set<Animal> getAnimals() {
		return animals;
	}

	// let me setting animals set
	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}

	public Set<Zone> getZones() {
		return zones;
	}

	public void setZones(Set<Zone> zones) {
		this.zones = zones;
	}

	@Override
	public String toString() {
		return "Zoo{" + "nom='" + nom + '}';
	}
}