import java.util.Random;

public class Dice {
    Random aleatoire; // déclare une variable de type Random
    int nombre;

    //constructeur de Dice
    Dice() {
        aleatoire = new Random(); // utilise une variable globale de type Random et instancie la classe Random
        // la variable aleatoire contient désormais une référence à un objet de la classe Random

        coup(aleatoire, nombre); // utilise les deux variables globales
    }
    void coup(Random objet, int nombre) {
        nombre = objet.nextInt(6)+1; // nombre aléatoire de 1 à 6
        System.out.println(nombre);
    }
}
