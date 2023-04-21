
public class Main {
    public static void main(String[] args) {

        // classe abstraite => une classe qui ne peut pas être instanciée
        // , mais qui peut avoir des subclass (child class),
        // les méthodes abstraites sont déclarées sans implémentation
        // mais sont obligées d'être implémentées dans les subclasses qui hérite
        // de la superclass

        // Vehicule vehicule1 = new Vehicule(); // on ne peut plus instancier
        Voiture voiture1 = new Voiture();
        voiture1.demarrer();


    }
}