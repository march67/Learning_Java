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
        scanner.nextLine();

        System.out.println("Saisie de la nourriture favorite de l'utilisateur : ");
        String nourriture = scanner.nextLine();

        System.out.println("Le nom de l'utilisateur est : " + name);
        System.out.println("L'âge de l'utilisateur est : " + age);
        System.out.println("La nourriture favorite de l'utilisateur est : " + nourriture);
        // attention lors de la saisie de l'utilisateur, la touche "Enter" est utilisé ce qui va donc saisir " \n "
        // la troisième demande de saisie (nourriture) est ignoré à cause des états suivant :
        // scanner.nextLine() : TA\n
        // scanner.nextInt() // autre méthode appelée : 24\n
        // scanner.nextLine() : \n  // commence avec l'échapement et arrête donc la saisie dès le début
        // astuce : il faut utilise un scanner.nextLine() juste après le dernier scanner.mtd() sans lui affecter à une variable

        // et donc :
        // scanner.nextInt() : 24\n
        // scanner.nextLine() : \n
        // scanner.nextLine() : pizza\n

    }
}