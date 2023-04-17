
public class Main {
    public static void main(String[] args) {

        // static => modificateur, une copie simple d'une variable ou d'une méthode
        //        => est créee et partagée. La classe courrante "s'approprie" le membre static

        // Ami unAmi = new Ami("Fred");
        System.out.println(Ami.nombreAmi); // est accessible sans passer par l'instanciation
        // car il s'agit d'un membre static, // retourne 0

        Ami unAmi = new Ami("Fred"); // incrémente static int nombreAmi
        System.out.println(Ami.nombreAmi); // retourne 1

        Ami deuxAmi = new Ami("Jean");
        Ami troisAmi = new Ami("Mia");
        System.out.println(Ami.nombreAmi); // retourne 3
        // Bonne pratique lors d'un accès d'un membre static
        // => éviter d'y accéder par une instance de la classe
        // exemple : troisAmi.nombreAmi

        // appelle de la méthode static
        Ami.afficheAmi(); // on ne passe pas par une instance car il s'agit d'une méthode static

        // autre exemple de méthode static
        // Math.round(a); // on ne passe pas par une instance donc on peut en déduire qu'il
        // s'agit d'une méthode static

    }
}