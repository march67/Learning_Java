// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // expression = opérandes et opérateurs
        // opérandes = valeurs, variables, nombres, quantité
        // opérateurs = [ + ; - ; * ; / ; % ]

        int nombreAmis = 10;

        nombreAmis = nombreAmis / 3;

        System.out.println(nombreAmis);

        nombreAmis = nombreAmis % 3; // modulo 3, affiche le reste
        // ici 2

        System.out.println(nombreAmis);

        // opérateur d'incrémentation et de décrémentation
        nombreAmis++;
        nombreAmis--;

        nombreAmis = 10;
        nombreAmis = nombreAmis / 3; // résultat = 3, le programme
        // va tronquer pour obtenir l'entier

    }
}