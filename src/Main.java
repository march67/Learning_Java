import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // [Class] [nom de l'objet] = new [Class] [argument];
        Scanner scanner = new Scanner(System.in);

        // Affiche une demande à l'utilisateur
        System.out.println("Saisie de l'utilisateur nom  : ");
        String name = scanner.nextLine(); // la console est en pause en attente d'une saisie de l'utilisateur
        // la valeur saisie est attribué à la variable "name"

        System.out.println("Saisie de l'utilisateur âge : ");
        int age = scanner.nextInt(); // nextInt() pour un entier

        System.out.println("Le nom de l'utilisateur est : " + name);
        System.out.println("L'âge de l'utilisateur est : " + age);
    }
}