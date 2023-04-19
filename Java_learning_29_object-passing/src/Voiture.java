public class Voiture {
    String nom;
    Voiture(String nom) {
        this.nom = nom; // "this" car ambiguïté entre variable d'instance / globale
        // et variable locale (paramètre)
    }
}
