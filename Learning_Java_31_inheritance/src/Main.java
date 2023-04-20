
public class Main {
    public static void main(String[] args) {
        // héritage / inheritance => processus où une classe acquiert les
        // attributs et les méthodes d'une autre classe

        Voiture voiture1 = new Voiture(); // instanciation de Voiture
        voiture1.demarrer(); // retourne "Ce véhicule roule"
        // la méthode demarrer() n'existe pas dans Voiture mais elle est
        // héritée de Vehicule à l'aide du mot clé "extends [nom classe]"

        Bicyclette bicyclette1 = new Bicyclette();
        bicyclette1.arreter(); // retourne Ce véhicule est à l'arrêt

        // les variables sont héritées de Voiture
        System.out.println(bicyclette1.vitesse);
        System.out.println(voiture1.vitesse);

        // les variables sont des variables de classes propre à l'instance
        System.out.println(bicyclette1.nombrePedale);
        System.out.println(voiture1.nombrePorte);
    }
}