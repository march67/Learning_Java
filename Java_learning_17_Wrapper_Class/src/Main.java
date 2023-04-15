
public class Main {
    public static void main(String[] args) {

        // wrapper class => fournit un moyen d'utiliser des types de données primitives en tant que
        // types de données reference qui contiennent des méthodes utiles
        // les references peuvent être utilsés avec des collections (exemple : ArrayList)

        // primitive    // wrapper
        // --------     // -------
        // boolean      // Boolean
        // char         // Character
        // int          // Integer
        // double       // Double

        // autoboxing  => la conversion automatique que le compilateur Java effectue entre les types de données primitive
        // et leurs objets correspondants à leurs Wrapper classes


        // unboxing => l'inverse de l'autoboxing, conversion automatique d'une classe Wrapper en primitive

        Boolean a = true; // processus d'autoboxing, la valeur true est automatiquement lié à sa classe Wrapper
        Character b = '@'; // processus d'autoboxing, la valeur @ est automatiquement lié à sa classe Wrapper
        Integer c = 123;
        Double d = 3.14;
        String e = "David";

        if(a==true) {
            System.out.println("Cette valeur est vraie"); // processus d'unboxing, la valeur true fonctionne tel que son
            // type primitive
        }

        // avantages des types reference => contient des méthodes utiles
        // => manipule plusieurs valeurs

        // désavantages => l'accès à des valeurs dans les Wrapper Class nécessite plus d'étapes à réaliser comparer à
        // son type primitive

    }
}