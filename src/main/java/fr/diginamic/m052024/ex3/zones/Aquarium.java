package fr.diginamic.m052024.ex3.zones;
import java.util.List;

public class Aquarium extends Zone {

	// constructeur
	public Aquarium(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	// apparently 0.2 kg of food per animal per day
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 0.2;
	}
}