public class Main {
    public static void main(String[] args) {

        // polymorphism => capacité d'un objet à s'identifier à plus
        // d'un type, exemple ici : voiture1 s'identifie en tant que Voiture
        // mais aussi en tant que Vehicule

        Voiture voiture1 = new Voiture();
        Bicyclette bicyclette1 = new Bicyclette();
        Bateau bateau1 = new Bateau();

        // Voiture[] course = {voiture1, bicyclette1, bateau1}
        // ne fonctionne pas car on veut créer un tableau de données de type
        // Voiture mais bicyclette1 et bateau1 ne sont pas des voitures
        // ,en revanche le point commun entre ces trois instances c'est
        // qu'ils ont tous pour super class Vehicule donc :
        Vehicule[] course = {voiture1, bicyclette1, bateau1};
        // ici le mécanisme du polymorphisme est utilisée

        // intération de chaque élément du tableau course
        // for( [type de donnée] [nom de substitution de l'élément] :
        // [nom du tableau] ) {}
        // mécanisme de polymorphisme, la méthode "demarrer()" est appelée
        // mais son implémentation va être différente selon le contexte
        for(Vehicule vehicule : course) {
            vehicule.demarrer();
        }
        // retourne
        //La voiture démarre
        //La bicyclette démarre
        //Le bateau démarre

    }
}