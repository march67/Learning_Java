public class Voiture extends Vehicule {
    // erreur, la classe Voiture doit soit être abstraite soit implémenter toutes les
    // méthodes abstraites déclarées dans la superclass !
    // => une superclass abstraite oblige ses subclasses à implémenter toutes ses
    // méthodes

    @Override
    void demarrer() {
        System.out.println("Le conducteur conduit la voiture");
    }
}
