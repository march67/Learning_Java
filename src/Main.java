import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // [Class] [nom de l'objet] = new [Class] [argument];
        Scanner scanner = new Scanner(System.in);

        // Affiche une demande à l'utilisateur
        System.out.println("Saisie de l'utilisateur : ");
        String name = scanner.nextLine(); // la console est en pause en attente d'une saisie de l'utilisateur

        System.out.println("Le nom de l'utilisateur est : " + name); // affiche la saisie de l'utilsateur
    }
}