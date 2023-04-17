public class Ami {

    String nom;
    static int nombreAmi;

    // si :
    // int nombreAmi; => le membre n'appartient qu'à l'instance
    // ainsi le nombre sera toujours égale à 1 pour cette instance

    Ami(String nomAmi) {
        this.nom = nom; // ajoute un ami
        nombreAmi ++; // incrémente le nombre d'ami
    }

    // méthode static
    static void afficheAmi() {
        System.out.println("Tu as " + nombreAmi + "amis");
    }
}
