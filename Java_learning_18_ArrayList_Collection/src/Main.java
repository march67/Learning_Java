import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        // ArrayList => un tableau à taille dynamique
        // => les éléments peuvent être ajoutés et retirés après la phase de compilation
        // => stocke des types de données reference

        // ArrayList<[reference]> [nom de l'objet] = new ArrayList<[reference]>();
        ArrayList<String> aliments = new ArrayList<String>();

        // Ajout d'un élément dans le tableau
        aliments.add("pizza");
        aliments.add("riz");
        aliments.add("pâtes");

        aliments.set(0, "sushi"); // remplace l'élément à l'index 0 (premier argument)
        // par le String (deuxième argument)

        aliments.remove(1); // supprime l'élément à l'index 1 (argument)

        aliments.clear(); // nettoie l'ArrayList

        // pour un array
        // String[] voitures = new String[2]; => i<voitures.length(); et pour afficher
        // println(voiture[0][0] => retourne le string

        // pour un ArrayList
        // ici il faut utiliser size() => i < aliments.size();
        // pour retourner la valeur il faut utiliser la méthode get(i)
        for(int i = 0; i < aliments.size(); i++) {
            System.out.println(aliments.get(i)); // get(i) argument entier et retourne le String
        }

    }
}