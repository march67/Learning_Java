import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // boucle imbriqué
        // nested loop => une boucle à l'intérieur d'une boucle

        Scanner scanner = new Scanner(System.in);
        int lignes;
        int colonnes;
        String symbole = "";

        System.out.println("Saisissez un nombre de lignes :");
        lignes = scanner.nextInt();

        System.out.println("Saisissez un nombre de colonnes :");
        colonnes = scanner.nextInt();

        System.out.println("Saisissez un symbol : ");
        symbole = scanner.next();

        // début de la boucle imbriqué
        for(int i = 1; i<=lignes; i++) {
            System.out.println();
            for(int j =  1; j<=colonnes; j++) {
                System.out.print(symbole);
            }
        }

    }
}