public class Vehicule {
    // Classe qui va être héritée par Bicyclette et Voiture

    // Vehicule est appelé super-class ou parent-class de Bicyclette et
    // Voiture
    double vitesse;

    void demarrer() {
        System.out.println("Ce véhicule roule");
    }

    void arreter() {
        System.out.println("Ce véhicule est à l'arrêt");
    }
}
