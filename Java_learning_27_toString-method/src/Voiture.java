public class Voiture {

    String faire = "Ford";
    String modele = "Mustang";
    String couleur = "rouge";

    int annee = 2023;

    //Override / Redéfinition de la méthode toString() héritée par défaut
    public String toString() {

        /* autre solution
        String monString = faire + "\n" + modele + "\n" + couleur + "\n" + annee;
        return monString; */

        // même résultat
        return faire + "\n" + modele + "\n" + couleur + "\n" + annee;
        // pas besoin d'utiliser le mot clé "this" car il n'y a pas d'ambiguïté
        // entre les noms des variables locales et les variables d'instances
        // rappel : "this" est utlisé pour faire référence à l'objet courant
    }
}
