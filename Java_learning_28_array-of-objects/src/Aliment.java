public class Aliment {
    String nom;
    Aliment(String nom) {
        this.nom = nom; // utiliser le pointeur "this" car ambiguïté entre
        // la variable locale (paramètre) et la variable globale / variable
        // d'instance (membre de Aliment)
    }
}
