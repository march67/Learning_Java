import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initialisation de deux variables double
        double x = 3.14;
        double y = -10;

        // récupère la plus grande valeur parmis les deux double et l'affecte à une troisième variable
        double max = Math.max(x, y);

        // récupère la plus petite valeur
        double min = Math.min(x, y);

        // récupère la valeur absolue
        double absolu = Math.abs(y);

        // récupère la racine carrée
        double racineCarre = Math.sqrt(x);

        // récupère la valeur arrondie
        double valeurArrondie = Math.round(x);

        // récupère la valeur arrondie au plus haut
        double valeurArrondieHaut = Math.ceil(x);

        // récupère la valeur arrondie au plus bas
        double valeurArrondieBas = Math.floor(x);

        // affiche les résultats
        System.out.println("Max : " + max); // 3.14
        System.out.println("Min : " + min); // -10.0
        System.out.println("Valeur Absolue : " + absolu); // 10
        System.out.println("Racine carré de x : " + racineCarre );
        System.out.println("Valeur arrondie de x : " + valeurArrondie); // 3.0
        System.out.println("Valeur arrondie haute de x : " + valeurArrondieHaut); // 4.0
        System.out.println("Valeur arrondie basse de x : " + valeurArrondieBas); // 3.0

        // calcul d'un hypoténus
        double coteA;
        double coteB;
        double hypotenus;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Saisir côté A : ");
        coteA = scanner.nextDouble();
        System.out.println("Saisir côté B : ");
        coteB = scanner.nextDouble();

        // pour calculer l'hypoténus d'un triangle à angle droit
        // c = sqrt( sqr(a) + sqr(b) )
        hypotenus = Math.sqrt( (coteA * coteA) + (coteB * coteB) );
        System.out.println(hypotenus); // affiche 11.1803...
        scanner.close(); // bonne pratique de fermer le scanneur



    }
}