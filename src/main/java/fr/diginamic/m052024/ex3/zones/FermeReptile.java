package fr.diginamic.m052024.ex3.zones;
import java.util.List;

public class FermeReptile extends Zone {

	// constructeur
	public FermeReptile(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	// apparently 0.1 kg of food per animal per day
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 0.1;
	}
}