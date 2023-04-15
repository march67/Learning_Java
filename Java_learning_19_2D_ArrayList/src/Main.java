import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 2D ArrayList => une liste dynamique de listes
        // il est possible de changer la taille de la liste pendant la compilation

        ArrayList<ArrayList<String>> globaleListe = new ArrayList();

        ArrayList<String> courseListe = new ArrayList<String>();
        courseListe.add("pâtes");
        courseListe.add("chips");
        courseListe.add("frites");

        ArrayList<String> vegetables = new ArrayList<String>();
        vegetables.add("tomates");
        vegetables.add("poivrons");
        vegetables.add("broccoli");

        ArrayList<String> boissons = new ArrayList<String>();
        boissons.add("café");
        boissons.add("thé");

        System.out.println(courseListe.get(0));

        globaleListe.add(courseListe);
        globaleListe.add(vegetables);
        globaleListe.add(boissons);

        System.out.println(globaleListe); // affiche l'ensemble des listes
        System.out.println(globaleListe.get(0).get(2)); // affiche l'élément à l'index 2 de la première liste
        // retourne "frites"

        // modifier le retour pour supprimer les crochets
        // il faut utiliser les méthodes de String
        // pour cela il faut convertir l'ArrayList 2D en String
        String liste = globaleListe.toString();

        liste = liste.replace("[", ""); // remplace les [ par rien
        // et enregistre la nouvelle valeur de la chaîne de caractères
        liste = liste.replace("]", ""); // remplace les ] par rien
        // et enregistre la nouvelle valeur de la chaîne de caractères

        System.out.println(liste); // affiche le résultat de la chaîne de caractères dont les crochets sont supprimés
    }
}