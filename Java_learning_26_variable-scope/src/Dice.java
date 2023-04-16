import java.util.Random;

public class Dice {

    /* EN UTILISANT SEULEMENT DES VARIABLES LOCALES */
    //constructeur de Dice
    Dice() {

        Random aleatoire = new Random(); // instancie Random
        int nombre = 0; // initialisation d'un entier (obligatoirement initialiser sinon risque de
        // sécurité, si seulement déclaration alors erreur et empêche la compilation)

        coup(aleatoire, nombre); // appelle la méthode coup dès l'instanciation
        // puisque les variables sont locales, on doit les transmettre par l'utilisation d'argument
    }

    void coup(Random objet, int nombre) {
        nombre = objet.nextInt(6)+1; // nombre aléatoire de 1 à 6
        System.out.println(nombre);
    }
}
