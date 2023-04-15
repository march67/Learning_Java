
public class Main {
    public static void main(String[] args) {

        // tableau 2D => un tableau de tableaux
        String[][] voitures = new String[3][3];

        voitures[0][0] = "Camaro";
        voitures[0][1] = "Corvette";    // ligne 1, colonne 2
        voitures[0][2] = "Silverado";

        voitures[1][0] = "Mustang";
        voitures[1][1] = "Tesla";
        voitures[1][2] = "Ranger";  // ligne 2, colonne 3

        voitures[2][0] = "Ferrari"; // ligne 3, colonne 1
        voitures[2][1] = "F-150";
        voitures[2][2] = "Lambo";

        for(int i = 0; i<voitures.length; i++) {
            System.out.println(); // saut de ligne entre les différentes lignes

            // ici on met l'indice i avant le ".length" ce qui va permettre
            // de prendre la longueur de la ligne i
            for(int j = 0; j<voitures[i].length; j++) {
                System.out.print(voitures[i][j]+" "); // affiche la voiture correspondant
                // à la ligne [i]
                // et à la colonne [j]
            }
        }
    }
}