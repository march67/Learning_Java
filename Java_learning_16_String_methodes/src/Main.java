import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // String est un type de donnée de reference
        // il peut stocker un ou plusieurs caractères
        // les type de données reference ont accès à des méthodes utiles

        String nom = "David";

        boolean resultat = nom.equals("David"); // Pour ignorer la casse :  nom.equalsIgnoreCase("David");
        System.out.println(resultat); // retourne true

        int longueurResultat = nom.length();
        System.out.println(longueurResultat); // retourne 5

        char charResultat = nom.charAt(0); // affiche le caractère à l'indexe indiqué en argument, commence à 0
        System.out.println(charResultat); // retourne D

        int indexResultats = nom.indexOf("d"); // retourne le premier index trouvé égale à l'argument
        System.out.println(indexResultats); // retourne 4

        boolean videResultat = nom.isEmpty(); // affiche true ou false selon si la variable est vide ou non
        System.out.println(videResultat); // retourne false

        String majusculeResultat = nom.toUpperCase(); // affiche le résultat tout en majuscule  // aussi toLowerCase()
        System.out.println(majusculeResultat);  // retourne DAVID

        String nomAvecEspace = " David  "; // un String avec des espaces
        String nomSansEspace = nomAvecEspace.trim(); // reprend le String précédent et enlève les espaces
        System.out.println(nomSansEspace); // retourn "David"

        String nomAvecRemplacement = nom.replace("D", "L"); // remplace tous les caractères indiqués en premier argument
        // par le caractère indiqué en deuxième argument
        System.out.println(nomAvecRemplacement); // retourne "Lavid"
    }
}