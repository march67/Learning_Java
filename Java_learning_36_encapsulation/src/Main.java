
public class Main {
    public static void main(String[] args) {
        // encapsulation => les propriétés sont cachées ou privées
        // elles peuvent être accédées uniquement par des méthodes
        // (getters & setters), il est de bonne pratique de rendre les attributs
        // privées s'il n'y a pas de raison de les rendre public ou protected

        Voiture voiture1 = new Voiture("Chevrolet", "Camero", 2023);
        // System.out.println(voiture1.make); // has private access in voiture1

        // en passant par les getters et setters pour récupérer les attributs
        // privés
        System.out.println(voiture1.getMake()); // retourne "Chevrolet"
        System.out.println(voiture1.getModel()); // retourne "Camero"

        voiture1.setYear(2022);
        System.out.println(voiture1.getYear()); // retourne 2022

    }
}