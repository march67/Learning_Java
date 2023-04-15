import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // for-each => technique transverse pour itérer par tous les éléments du tableau / collection
        // avantages : moins d'étapes, plus facilement lisible
        // désavantage : moins flexible

        // initialisation d'un tableau / array
        String[] animaux = {"chat", "chien", "rat", "oiseau"};

        // début de la boucle for-each
        // pour chaque index du tableau animaux
        // exécute le bloc d'instruction
        // utilise la variable i pour représenter l'index
        for(String i : animaux) {
            System.out.println(i);
        }

        // initialisation d'une liste dynamique, collection
        ArrayList<String> animaux2 = new ArrayList<String>();

        animaux2.add("chien");
        animaux2.add("chat");
        animaux2.add("rat");
        animaux2.add("oiseau");

        for(String i : animaux2) {
            System.out.println(i);
        }
        // même résultat
        //
    }
}