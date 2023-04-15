import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // opérateurs logiques : utilisés pour connecter
        // deux expressions ou plus
        //
        // && = (AND) les deux conditions doivent être vraies
        // || = (OR) une des deux conditions doit être vraie
        // ! = (NOT) inverse la valeur booléene de la condition

        int temperature = 25;

        // utilisation de && (AND)
        if(temperature>30) {
            System.out.println("il fait chaud");
        }
        else if(temperature>=20 && temperature<=30) {
            System.out.println("il fait bon");
        }
        else {
            System.out.println("il fait froid");
        }

        // utilisation de || (OR)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous jouez à un jeu ! Appuyer sur q ou z pour" +
                " quitter");
        String reponse = scanner.next();
        if(reponse.equals("q") || reponse.equals("z")) {
            System.out.println("Vous avez quitter le jeu !");
        }
        else {
            System.out.println("Vous êtes toujours en train de jouer !");
        }
        // avec la négation et && (AND)
        // if(!reponse.equals("c") && !reponse.equals("C") ) {
        // System.out.println("Vous avez quitter le jeu !");
        //}


    }
}