package fr.diginamic.m052024.ex3.zones;
import java.util.List;

public class SavaneAfricaine extends Zone {

	// constructeur
	public SavaneAfricaine(List<String> types, List<String> noms, List<String> comportements) {
		super(types, noms, comportements);
	}

	// apparently 10 kg of food per animal per day
	public double calculerKgsNourritureParJour() {
		return getNoms().size() * 10;
	}
}