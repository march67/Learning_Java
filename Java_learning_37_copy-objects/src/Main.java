
public class Main {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("Chevrolet","Camaro",2021);
        // Voiture voiture2 = new Voiture("Ford", "Mustang", 2022);
        // autre solution, constructeur copieur
        Voiture voiture2 = new Voiture(voiture1);

        // pour copier les valeurs de car2 à car1
        // ne pas faire voiture2 = voiture1, cela modifie uniquement l'adresse
        // ainsi les deux variables auront les mêmes valeurs mais pointeront
        // vers la même adresse (adresse de voiture1, donc plus d'accès à
        // voiture2)

        voiture2.copy(voiture1); // à présent les deux variables ont des adresses
        // différentes, mais les mêmes valeurs, on a donc bien copié les valeurs
        // de l'instance voiture2 aux valeurs de l'instance voiture1

        // affiche l'adresse mémoire des deux objets
        System.out.println(voiture1);
        System.out.println(voiture2);

        // affiche le make, le model et le year de voiture1
        System.out.println(voiture1.getMake());
        System.out.println(voiture1.getModel());
        System.out.println(voiture1.getYear());

        // affiche le make, le model et le year de voiture2
        System.out.println(voiture2.getMake());
        System.out.println(voiture2.getModel());
        System.out.println(voiture2.getYear());



    }
}