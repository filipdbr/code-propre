package fr.diginamic.m052024.ex3;

import fr.diginamic.m052024.ex3.animaux.Animal;
import fr.diginamic.m052024.ex3.animaux.Mammifere;
import fr.diginamic.m052024.ex3.animaux.Poisson;
import fr.diginamic.m052024.ex3.animaux.Serpent;
import fr.diginamic.m052024.ex3.zones.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe principale pour gérer le zoo et les animaux.
 * Cette classe permet de créer des animaux, des zones, et de les ajouter au zoo.
 */
public class App {

	/**
	 * Méthode principale pour exécuter le programme.
	 *
	 * @param args Arguments de la ligne de commande (non utilisés ici).
	 */
	public static void main(String[] args) {

		// Création du zoo "Thoiry"
		Zoo zooThoiry = new Zoo("Thoiry");

		// Création de nouveaux animaux
		Mammifere m1 = new Mammifere(1, "Grace", "Gazelle", "Herbivore");
		Mammifere m2 = new Mammifere(2, "Eva", "Zebre", "Herbivore");
		Mammifere m3 = new Mammifere(3, "King", "Lion", "Carnivore");
		Mammifere m4 = new Mammifere(4, "Peter", "Panthère", "Carnivore");
		Poisson p1 = new Poisson(5, "Rufus", "Requin blanc", "Carnivore");
		Poisson p2 = new Poisson(6, "Goldie", "Truite dorée", "Herbivore");
		Serpent s1 = new Serpent(7, "Snake", "Boa constrictor", "Carnivore");
		Serpent s2 = new Serpent(8, "George", "Python", "Carnivore");

		// Ajout des animaux au zoo
		zooThoiry.addAnimal(m1);
		zooThoiry.addAnimal(m2);
		zooThoiry.addAnimal(m3);
		zooThoiry.addAnimal(m4);
		zooThoiry.addAnimal(p1);
		zooThoiry.addAnimal(p2);
		zooThoiry.addAnimal(s1);
		zooThoiry.addAnimal(s2);

		// Affichage de la liste des animaux du zoo
		zooThoiry.afficherListeAnimaux();

		// Création des zones Carnivore
		Zone zoneCarni = new ZoneCarnivore();
		Zone savaneAfricaine = new SavaneAfricaine();
		Zone aquarium = new Aquarium();
		Zone fermeReptile = new FermeReptile();

		// Ajout des zones au zoo
		zooThoiry.addZone(zoneCarni);
		zooThoiry.addZone(savaneAfricaine);
		zooThoiry.addZone(aquarium);
		zooThoiry.addZone(fermeReptile);

		// Ajout d'animaux à la zone Carnivore
		savaneAfricaine.addAnimal(m1);
		savaneAfricaine.addAnimal(m2);
		savaneAfricaine.addAnimal(m3);
		savaneAfricaine.addAnimal(m4);
		aquarium.addAnimal(p1);
		aquarium.addAnimal(p2);
		fermeReptile.addAnimal(s1);
		fermeReptile.addAnimal(s2);

		// Affichage d'un animal spécifique dans la zone (index 1)
		System.out.println("\nAnimal de votre choix : " + fermeReptile.getAnimal(1) + "\n");

		// Affichage de la liste des animaux dans la zone Carnivore
		savaneAfricaine.afficherListeAnimaux();

		// Affichage des zones dans le zoo
		System.out.println(zooThoiry.getZones());
	}
}
