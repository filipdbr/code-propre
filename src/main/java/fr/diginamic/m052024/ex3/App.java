package fr.diginamic.m052024.ex3;

import fr.diginamic.m052024.ex3.animaux.Animal;
import fr.diginamic.m052024.ex3.animaux.Mammifere;
import fr.diginamic.m052024.ex3.animaux.Poisson;
import fr.diginamic.m052024.ex3.animaux.Serpent;
import fr.diginamic.m052024.ex3.zones.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	/* todo:
	    1. I need to add names to animals
	    2. I need to add empty constructors to other zones classes (done in zone carnivore)
	    3. 
	 */

	public static void main(String[] args) {


		Zoo zooThoiry = new Zoo("Thoiry");

		// Creation of new animals
		Mammifere grace = new Mammifere(1, "Gazelle", "Herbivore");
		Mammifere eva = new Mammifere(2, "Zebre", "Herbivore");
		Mammifere king = new Mammifere(3, "Lion", "Carnivore");
		Mammifere peter = new Mammifere(4, "Panthère", "Carnivore");
		Poisson rufus = new Poisson(5, "Requin blanc", "Carnivore");
		Poisson goldie = new Poisson(6, "Truite dorée", "Herbivore");
		Serpent snake = new Serpent(7, "Boa constrictor", "Carnivore");
		Serpent python = new Serpent(8, "Python", "Carnivore");

		zooThoiry.addAnimal(grace);
		zooThoiry.addAnimal(eva);
		zooThoiry.addAnimal(king);
		zooThoiry.addAnimal(peter);
		zooThoiry.addAnimal(rufus);
		zooThoiry.addAnimal(goldie);
		zooThoiry.addAnimal(snake);
		zooThoiry.addAnimal(python);

		// show animals
		zooThoiry.afficherListeAnimaux();

		// creation of zone Carnivore
		Zone zoneCarni = new ZoneCarnivore();

		// attaching zone to this zoo
		zooThoiry.addZone(zoneCarni);

		// adding animals to the zoo
		zoneCarni.addAnimal(eva);
		zoneCarni.addAnimal(peter);

		// show animals in the zone
		System.out.println("Your animal : " + zoneCarni.getAnimal(1));

	}

}