
public class Main {
    public static void main(String[] args) {

        // chaîne de caractère simple
        String voiture = "BMW";

        // tableau => utilisé pour stocker plusieurs valeurs dans une
        // seule variable
        // tableau qui commence à l'indexe [0], allant jusqu'à [2] ici
        String[] tableauVoitures = {"BMW", "Tesla", "Audi"};

        tableauVoitures[2] = "Mustang";

        System.out.println(tableauVoitures[2]);

        // instanciation d'une tableau, en argument du constructeur
        // on passe le nombre d'éléments dans le tableau
        String[] voitures = new String[3];
        voitures[0] = "uneVoiture";
        voitures[1] = "deuxVoiture";
        voitures[2] = "troisVoiture";

        // affiche toutes les voitures du tableau
        // indexe < [arrayName].length
        // longueur du tableau
        // affichage à l'aide de l'indexe qui est incrémenté à chaque itération
        for(int i = 0; i<voitures.length; i++ ) {
            System.out.println(voitures[i]);
        }
    }
}