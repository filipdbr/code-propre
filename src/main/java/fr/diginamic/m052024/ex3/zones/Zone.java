package fr.diginamic.m052024.ex3.zones;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

    // attribut
    private int id;
    private List<String> types;
    private List<String> noms;
    private List<String> comportements;

    public Zone(List<String> types, List<String> noms, List<String> comportements) {
        this.types = new ArrayList<>(types);
        this.noms = new ArrayList<>(noms);
        this.comportements = new ArrayList<>(comportements);
    }

    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    // getters et setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getNoms() {
        return noms;
    }

    public void setNoms(List<String> noms) {
        this.noms = noms;
    }

    public List<String> getComportements() {
        return comportements;
    }

    public void setComportements(List<String> comportements) {
        this.comportements = comportements;
    }

    // autres méthodes

    public abstract double calculerKgsNourritureParJour();

    public int compterAnimaux(){
        return noms.size();
    }

    @Override
    public String toString() {
        return "Zone{" +
                "types=" + types +
                ", noms=" + noms +
                ", comportements=" + comportements +
                '}';
    }
}
