
public class Main {
    public static void main(String[] args) {

        // interface => un modèle qui peut être appliquer à une classe
        // similaire à l'héritage, mais spécifie ce que la class doit et peut
        // faire. Les classes peuvent appliquer plusieurs interfaces
        // , tandis que l'héritage est limité à 1 super class

        Lapin lapin1 = new Lapin();
        lapin1.fuir();

        Corbeau corbeau1 = new Corbeau();
        corbeau1.chasser();

        Poisson poisson1 = new Poisson();
        poisson1.fuir();
        poisson1.chasser();
    }
}