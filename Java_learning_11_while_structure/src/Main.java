import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // boucle while => exécute un bloc de code tant que la condition est vraie
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // l'argument de while() est la condition de la boucle
        // tant que le String "name" est null
        while(name.isBlank()) {
            System.out.println("Saisissez votre nom : ");
            name = scanner.nextLine();

        }

        // do{
            // ... instructions
        // }while(name.isBlank())
        // structure alternative qui exécute au moins une fois les instructions

        System.out.println("Bonjour : " + name);

    }
}