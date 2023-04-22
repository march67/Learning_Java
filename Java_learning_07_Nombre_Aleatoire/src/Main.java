import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random nombreAleatoire = new Random();

        int y = nombreAleatoire.nextInt(6)+1; // génère un nombre aléatoire allant de 1 à 6
        int x = nombreAleatoire.nextInt(6); // génère un nombre aléatoire allant de 0 à 5
        System.out.println(x);

        double z = nombreAleatoire.nextDouble(); // affiche une valeur entre 0 et 1 (ex : 0.6561552567485)
        System.out.println(z);

        boolean b = nombreAleatoire.nextBoolean(); // affiche "true" ou "false"
        System.out.println(b);


    }
}