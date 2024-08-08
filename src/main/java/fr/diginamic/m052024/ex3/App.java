package fr.diginamic.m052024.ex3;

import fr.diginamic.m052024.ex3.animaux.Animal;
import fr.diginamic.m052024.ex3.animaux.Mammifere;
import fr.diginamic.m052024.ex3.animaux.Oiseau;

public class App {

	/* todo:
	    1. Create classes for zones eg. aquarium etc
	    2. Add javadoc to animals package

	   So far I've created a mother class of animals and then sublasses birds, mammals etc.
	   I can consider this part done
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

	}

}