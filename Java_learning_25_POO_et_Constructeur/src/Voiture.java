public class Voiture {
    String faire = "Chevrolet";
    String modele = "Corvette";
    int annee = 2020;
    String couleur = "bleu";
    double prix = 50000.00;

    void conduire() {
        System.out.println("Vous conduisez la voiture");
    }

    void freiner() {
        System.out.println("Vous frenez");
    }

    void indiquePrix() {
        System.out.println(this.prix);
    }

    // constructeur => méthode spécial qui est appelé lorsque l'objet
    // est instancié (crée)

    // constructeur avec des paramètres
    Voiture(String couleur, String modele, String faire, int annee,
            double prix) {
        this.faire = faire; // mot clé "this . " pointeur vers la classe actuelle
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;

    }

}
