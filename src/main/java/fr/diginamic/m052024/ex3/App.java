package fr.diginamic.m052024.ex3;

import fr.diginamic.m052024.ex3.animaux.Animal;
import fr.diginamic.m052024.ex3.animaux.Mammifere;
import fr.diginamic.m052024.ex3.animaux.Oiseau;

public class App {

	/* todo:
	    1. Create zones and animals
	    2. Do some testing 
	 */

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		/*
		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
		zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
		 */

		Zoo berlin = new Zoo("Berlin Zoo");
		System.out.println(berlin);

	}

}