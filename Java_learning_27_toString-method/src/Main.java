
public class Main {
    public static void main(String[] args) {

        // toString() => méthode spéciale que tous les objets hérite
        //            => retourne une chaîne de caractère qui représente
        //               l'objet de manière textuelle
        //            => peut être utilisé implicitement et explicitement

        Voiture uneVoiture = new Voiture();

        /*
        // affiche toutes les caractéristiques de la voiture
        System.out.println(uneVoiture.faire);
        System.out.println(uneVoiture.modele);
        System.out.println(uneVoiture.annee);
        System.out.println(uneVoiture.couleur); */

        // autre solution
        System.out.println(uneVoiture); // retourne Voiture@7b23ec81
        // la méthode "toString()" est appelé implicitement
        // donc même chose que faire System.out.println(uneVoiture.toString());

        // pour améliorer la solution, aller dans la classe de l'instance
        // override la méthode toString()
        // maintenant retourne avec des sauts de lignes grâce aux modifications
        // (redéfinition) / override

        // System.out.println(uneVoiture);
        // retourne :
        // Ford
        // Mustang
        // rouge
        // 2023


    }
}