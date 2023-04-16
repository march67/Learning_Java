
public class Main {
    public static void main(String[] args) {
        // méthode surchargée ou overloaded method => méthodes qui partage le même nom
        // => mais ont des paramètres différents
        // la signature de la méthode est différente, elle est composée du
        // nom de la méthode + ses paramètres

        // autre (cours) : le point-virgule " ; " est appelé "opérateur de séquence"
        //                                                ou "opérateur de terminaison de commande"
        // => utilisé pour séparer les instructions individuelles

        // autre (cours) : la virgule " , " est utilisé pour séparer les éléments dans une liste
        // ou un tableau, ou pour passer des arguments à une méthodes, pas de nom particulier

        // lors de l'appel de la méthode "ajout", pas besoin de passer par un objet
        // car il s'agit d'une méthode static
        // comparer à par exemple scanner.nextLine() où il est obligatoire de passer
        // par une son instance, note : "." (point) est appelé "opérateur de sélection de membre"
        //                                                  ou "opérateur de point"
        // il sert à accéder aux membres (méthodes, variables, constructeurs, constantes
        // , classes internes) d'une instance
        int x = ajout(2, 4);
        System.out.println("méthode surchargée 1 : " + x);

        int y = ajout(2, 4, 10);
        System.out.println("méthode surchargée 2 : " + y);

        // pour utiliser la méthode avec des paramètres double
        // il faut utiliser des arguments double
        // mais aussi affecter la valeur retournée à un type de donnée correspondant
        // donc double [nom de la variable] = [retourne une donnée double]
        double o = ajout(2.5, 4.9, 3.7);
        System.out.println("méthode surchargée 5 : " + o);
    }

    // méthode 1, "ajout", deux paramètres int
    static int ajout(int a, int b) {
        System.out.println("C'est la méthode surchargée numéro 1 ");
        return a + b;
    }

    static int ajout(int a, int b, int c) {
        System.out.println("C'est la méthode surchargée numéro 2 ");
        return a + b + c;
    }

    static int ajout(int a, int b, int c, int d) {
        System.out.println("C'est la méthode surchargée numéro 3 ");
        return a + b + c + d;
    }

    static double ajout(double a, double b) {
        System.out.println("C'est la méthode surchargée numéro 4 ");
        return a + b;
    }

    static double ajout(double a, double b, double c){
        System.out.println("C'est la méthode surchargée numéro 5 ");
        return a + b + c;
    }
}