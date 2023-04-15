
public class Main {
    public static void main(String[] args) {
        // méthode => exécute un bloc de code à chaque fois que la méthode est appelée

        String nom = "David";
        int age = 24;

        bonjour(nom, age); // appelle de la méthode avec deux arguments, le premier est un String
        // le deuxième est un entier

        int x = 3;
        int y = 4;
        int z = somme(x,y);
        System.out.println(z); // affiche 7
        System.out.println(somme(x,y)); // affiche 7
    }

    // déclaration d'une méthode != initialisation => processus de donner une valeur initiale
    // ce n'est pas le cas pour une méthode, ce sont pas des variables ou des constantes
    // qui ont besoin d'une valeur initiale

    // [modificateur d'accès] [type de retour] [nom de la méthode] ( [paramètre1, ...] ) { exécution du bloc de code... }
    // (String caracteres) est un paramètre et est != de l'argument
    // pour qu'une méthode puisse être appelé il faut que méthode appelé correspond à une méthode existante avec
    // le même nom et des paramètres correspondants en terme de nombre, de type, et d'ordre
    static void bonjour(String caracteres, int entier) {
        System.out.println("bonjour " + caracteres);
        System.out.println("tu es âgé de : " + entier);
    }

    // méthode de type de retour int
    // il faut que la méthode retourne obligatoirement un int
    static int somme(int a, int b) {
        int sum = a + b; // sum est une variable locale, de même pour a et b
        return sum;

        // return a + b;
        // même résultat et plus rapide
    }
}