public class Main {
    public static void main(String[] args) {
        // instanciation de Garage
        Garage garage = new Garage();

        // instanciation de Voiture
        Voiture voiture1 = new Voiture("BMW");
        Voiture voiture2 = new Voiture("Tesla");

        // utilisation d'une méthode de garage qui prend en argument
        // une variable de type Voiture
        // l'instance de Voiture qu'on veut passer est voiture1
        /* l'instance de Garage qui va réceptionner une instance d'une autre
        classe est garage */
        garage.park(voiture1); // l'implémentation de la méthode park(Voiture uneVoiture)
        garage.park(voiture2); // utilise une méthode de Voiture en passant par la variable
        // locale uneVoiture de type Voiture
    }
}
