package fr.diginamic.m052024.ex3.zones;
import java.util.List;

public class ZoneCarnivore extends Zone {

	// constructeur
	public ZoneCarnivore(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	// apparently 10 kg of food per animal per day
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 10;
	}
}