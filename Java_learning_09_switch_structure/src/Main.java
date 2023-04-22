public class Main {
    public static void main(String[] args) {
        // structure switch => structure qui permet de tester
        // l'égalité d'une variable par rapport à une liste
        // de valeurs

        // jour est comparé à toutes les valeurs de chaque case
        String jour = "Lundi";

        // valeur à comparer en arguement du switch
        switch(jour) {
            case "Vendredi" : System.out.println("C'est Vendredi !");
            break;
            case "Samedi" : System.out.println("C'est Samedi!");
            break;
            case "Dimanche" : System.out.println("C'est Dimanche!");
            break;
            case "Lundi" : System.out.println("C'est Lundi!");
            break;
            case "Mardi" : System.out.println("C'est Mardi!");
            break;
            case "Mercredi" : System.out.println("C'est Mercredi!");
            break;
            case "Jeudi" : System.out.println("C'est Jeudi!");
            break;

            // si aucun case ne correspond à la valeur comparée
            default: System.out.println("Ce n'est pas un jour de la semaine");
        }


    }
}