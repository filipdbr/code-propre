package fr.diginamic.m052024.ex3.zones;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstraite représentant une Zone.
 * Gère les types, noms des animaux, ainsi qu'une liste de comportements dans la zone.
 */
public abstract class Zone {

    // attributs
    private int id;
    private List<String> types;
    private List<String> noms;
    private List<String> comportements;

    /**
     * Constructeur de la classe Zone.
     *
     * @param types Liste des types d'animaux.
     * @param noms Liste des noms d'animaux.
     * @param comportements Liste des comportements des animaux dans la zone.
     */
    public Zone(List<String> types, List<String> noms, List<String> comportements) {
        this.types = new ArrayList<>(types);
        this.noms = new ArrayList<>(noms);
        this.comportements = new ArrayList<>(comportements);
    }

    /**
     * Ajoute un animal à la zone.
     *
     * @param typeAnimal Type de l'animal.
     * @param nomAnimal Nom de l'animal.
     * @param comportement Comportement de l'animal.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    // getters et setters

    /**
     * Retourne l'identifiant de la zone.
     *
     * @return l'identifiant de la zone.
     */
    public int getId() {
        return id;
    }

    /**
     * Modifie l'identifiant de la zone.
     *
     * @param id Nouvel identifiant de la zone.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retourne la liste des types d'animaux.
     *
     * @return Liste des types d'animaux.
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * Modifie la liste des types d'animaux.
     *
     * @param types Nouvelle liste des types d'animaux.
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * Retourne la liste des noms d'animaux.
     *
     * @return Liste des noms d'animaux.
     */
    public List<String> getNoms() {
        return noms;
    }

    /**
     * Modifie la liste des noms d'animaux.
     *
     * @param noms Nouvelle liste des noms d'animaux.
     */
    public void setNoms(List<String> noms) {
        this.noms = noms;
    }

    /**
     * Retourne la liste des comportements des animaux dans la zone.
     *
     * @return Liste des comportements des animaux.
     */
    public List<String> getComportements() {
        return comportements;
    }

    /**
     * Modifie la liste des comportements des animaux dans la zone.
     *
     * @param comportements Nouvelle liste des comportements des animaux.
     */
    public void setComportements(List<String> comportements) {
        this.comportements = comportements;
    }

    // autres méthodes

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour la zone.
     *
     * @return Quantité de nourriture en kg par jour.
     */
    public abstract double calculerKgsNourritureParJour();

    /**
     * Compte le nombre d'animaux dans la zone.
     *
     * @return Nombre d'animaux dans la zone.
     */
    public int compterAnimaux() {
        return noms.size();
    }

    /**
     * Retourne une représentation en chaîne de caractères de la zone.
     *
     * @return Chaîne de caractères représentant la zone.
     */
    @Override
    public String toString() {
        return "Zone{" +
                "types=" + types +
                ", noms=" + noms +
                ", comportements=" + comportements +
                '}';
    }
}
