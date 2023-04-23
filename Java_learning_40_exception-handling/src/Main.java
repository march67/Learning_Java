import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // exception => événement qui se déroule pendant l'exécution d'un
        // programme qui interrompt le "flux normal" des instructions
        // "flux normal" => ordre d'exécution des instructions

        Scanner scanner = new Scanner(System.in);
        // mise en place d'un bloc try pour éviter l'interruption du
        // programme en cas d'erreur
        try {
            System.out.println("Saisissez une valeur entière à diviser : ");
            int nombre = scanner.nextInt();

            System.out.println("Saisisez une valeur entière en tant que" +
                    "diviseur : ");
            int diviseur = scanner.nextInt();

            int resultat = nombre / diviseur;
            System.out.println("Le résultat est : " + resultat);
            // en cas de diviseur par 0 retourne le résultat suivante :
            // Exception in thread "main" java.lang.ArithmeticException
            // le nom de l'erreur va servir à l'exception handling
        }
        // le bloc catch récupère les erreurs en cas de problème
        // l'argument dans la méthode peut contenir un type d'exception
        // ici ArithmeticException [nom de l'exception souvent nommé "e"]
        catch(ArithmeticException e) {
            System.out.println("Vous ne pouvez pas diviser par zero !");
        }
        // autre erreur possible, ici en cas de mauvaise saisie
        catch(InputMismatchException e) {
            System.out.println("Vous ne pouvez pas saisir autre chose " +
                    "qu'une valeur !");
        }
        // permet de catch toutes les erreurs mais c'est une bonne pratique
        // de gérer chaque type d'exception selon le cas spécifique !
        catch(Exception e) {
            System.out.println("Une erreur s'ait produite !");
        }
        // bloc final qui va s'exécuter qu'importe qu'une exception est
        // générée ou non
        finally {
            System.out.println("Ce message va toujours s'afficher !");
            scanner.close();
        }

    }
}