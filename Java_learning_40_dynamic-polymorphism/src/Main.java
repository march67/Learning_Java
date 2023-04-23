import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // polymorphisme => capacité d'un objet à être traité
        // comme une instance de plusieurs types

        // dynamic / dynamisme => après la compilation (pendant l'exécution)
        // l'exécution du programme choisit la méthode à appeler en fonction
        // de l'instance réelle de la variable à l'exécution.

        // ex : une Corvette est : une corvette, une voiture, un vehicule, un
        // objet

        Scanner scanner = new Scanner(System.in); // instance permettant la saisie
        Animal animal1 = null; // = null pour permettre la condition boucle while
        // Animal est la super class de Dog et de Cat, le polymorphisme est
        // donc possible

        do {
            System.out.println("Quelle animal veux-tu ?");
            System.out.println("(1=dog), ou (2=cat)");
            int choix = scanner.nextInt(); // la saisie de l'utilisateur = choix

            if (choix == 1) {
                animal1 = new Dog(); // donnée de type Animal, peut contenir une
                // référence à une instance Animal mais aussi Chien
                animal1.parler(); // polymorphisme dynamique => utilise la méthode
                // de la classe correspondant à l'instance actuelle de la référence
            } else if (choix == 2) {
                animal1 = new Cat(); // donnée de type Animal contenant une référence
                // à une instance Cat
                animal1.parler();
            } else {
                System.out.println("Veuillez saisir soit 1, soit 2");
            }
        } while (animal1 == null);

        System.out.println(animal1); // si Cat = Cat@7e6cbb7a
        // si Dog = Dog@7e6cbb7a

    }
}