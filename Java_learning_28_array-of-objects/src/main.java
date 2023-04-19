
public class main {
    public static void main(String[] args) {

        // array = tableau => structure de données statique, taille fixe, éléments de même type

        // arrayList = liste => structure de données dynamique, taille modifiable n'importe quand
        // éléments pouvant être de type différents
        // => une liste est une collection
        // en C# List<string> maListe = new List<string>();
        // en Java arrayList<String> maListe = new arrayList<string>();


        // collection = terme général, représente l'ensemble des structures de données
        // qui peut contenir un nombre variable d'éléments avec des opérations d'ajout
        // modification, suppression d'élément
        // => une collection : liste (arrayList), ensemble (set), dictionnaire, etc.

        // déclaration d'une tableau / array
        int[] nombre = new int[3]; // [typeArray][] [name] = new [typeArray][taille];
        char[] caracteres = new char[4];
        String[] strings = new String[5];

        // tableau d'objets / array of objects -- ici Aliment
        Aliment[] refrigerateur = new Aliment[3]; // array d'objets Aliment
        Aliment aliment1 = new Aliment("pizza");
        Aliment aliment2 = new Aliment("hamburger");
        Aliment aliment3 = new Aliment("hotdog");

        // ajout d'élément à un tableau / array (statique)
        refrigerateur[0] = aliment1;
        refrigerateur[1] = aliment2;
        refrigerateur[2] = aliment3;

        System.out.println(refrigerateur[0]); // retourne Aliment@7b23ec81
        // @7b23ec81 = addresse de là où l'objet est stocké dans la mémoire

        // pour accéder uniquement au membre voulu
        // il faut accéder au membre par son nom de déclaration dans la classe
        // on a pour Aliment, "String nom;"
        // on peut accéder au nom de l'aliment dans le réfrigérateur à l'index
        // 0 avec la ligne suivante
        System.out.println(refrigerateur[0].nom);
        System.out.println(refrigerateur[1].nom);
        System.out.println(refrigerateur[2].nom);

        // autre solution pour déclarer un tableau
        Aliment[] refrigerateur2 = {aliment1, aliment2, aliment3};
        System.out.println(refrigerateur2[0].nom);
        System.out.println(refrigerateur2[1].nom);
        System.out.println(refrigerateur2[2].nom);




    }
}