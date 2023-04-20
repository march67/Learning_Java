
public class Main {
    public static void main(String[] args) {

        // redéfinition de méthode // method overriding => déclaration d'une
        // méthode dans une sub-class (ou child-class) qui est donc présent
        // dans la super-class (parent-class)
        // cela permet à ce que la sub-class puisse modifier la méthode pour
        // mettre en place sa propre implémentation

        Animal animal1 = new Animal();

        Chien chien1 = new Chien();
        chien1.parler(); // retourne "L'animal parle", méthode de Animal
        // avant redéfinition (override)
        // après redéfinition (override), retourne "Le chien aboie"

        animal1.parler(); // retourne "L'animal parle", méthode de Animal




    }
}