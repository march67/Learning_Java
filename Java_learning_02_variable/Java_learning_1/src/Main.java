// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // initialisation des variables
        int x = 123;

        // guillemet simple pour char
        char symbol = '@';

        // "S" en majuscule car il s'agit d'une référence
        String name = "David";


        // affichage d'une variable dans une chaîne de caractères
        /* System.out.println("Voici le résultat de ma variable :" + x );
        System.out.println(symbol);
        System.out.println(name); */


        // échange de deux variables
        String y = "eau";
        String z = "café";
        String stockage; // stockage temporaire pour permettre un échange de valeur

        stockage = y;
        y = z;
        z = stockage;

        System.out.println("variable y : " + y);
        System.out.println("variable z : " + z);



    }
}