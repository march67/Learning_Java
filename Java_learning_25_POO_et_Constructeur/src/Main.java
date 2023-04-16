
public class Main {
    public static void main(String[] args) {

        // objet => une instance d'une classe qui peut contenir des attributs et des méthodes
        // example : (téléphone, bureau, ordinateur, tasse de café)
        // attributs => caractéristique d'un objet
        // méthodes => les différentes actions que l'objet peut effectuer


        // instanciation de la classe Voiture, l'objet est nommé "voiture2"
        Voiture voiture2 = new Voiture("rouge", "Corvette", "Chevrolet", 2023, 450.75 );

        System.out.println(voiture2.modele); // récupère l'attribut "modele" de l'objet "voiture2"
        System.out.println(voiture2.couleur); // récupère l'attribut "couleur" de l'objet "voiture2"

        voiture2.indiquePrix(); // retourne 450.75
    }
}