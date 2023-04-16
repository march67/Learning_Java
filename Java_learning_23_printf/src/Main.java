
public class Main {
    public static void main(String[] args) {
        // printf => une méthode optionnelle de contrôle, format, affichage de text à la console
        // windows
        // => deux arguments = format String + (objet / variable / valeur)
        //    % [flags] [precision] [width] [conversion-character]

        // le "%d" va être remplacé par la valeur int du deuxième argument sous format String
        System.out.printf("C'est un format string %d", 123);

        // variables de test
        boolean monBooleen = true;
        char monChar = '@';
        String monString = "David";
        int monInt = 50;
        double monDouble = 15000.7;

        // "%[?]" => conversion de caractère / [conversion-character]
        System.out.printf("%b", monBooleen); // boléen
        System.out.printf("%c", monChar); // character
        System.out.printf("%s", monString); // string
        System.out.printf("%d", monInt); // integer
        System.out.printf("%f", monDouble); // float ou double

        // [width] (right justify)
        // affiche un nombre de caractères minimum en sortie
        System.out.printf("%6s", monString); // David a 5 caractère, en utilisant la valeur
        // 6 en width, le programme ajoute un espace pour afficher le minimum de caractères

        System.out.println(); // améliore la lisibilité

        System.out.printf("Limitation du nombre de chiffre du dobule : %.2f", monDouble);
        // affiche en format string 15,70 aulieu de 15,700000 grâce à "% .[chiffre] f"

        System.out.println(); // améliore la lisibilité

        // [flags]
        // ajout un effet sur la sortie selon le flag ajouté au spécificateur de format
        // - : left-justify
        // + : output un signe plus ( + ) ou un signe moins ( - ) pour la valeur numérique
        // 0 : la valeur numérique est rembourrée de zéros
        // , : virgule séparateur de groupe si les nombres > 1000


        // left-justify à l'aide du right justify et l'ajout du flag ( - )
        System.out.printf("J'ai tant d'argent : %-20f", monDouble);

        System.out.println(); // améliore la lisibilité
        System.out.printf("J'ai tant d'argent : %+f", monDouble);

        System.out.println(); // améliore la lisibilité
        System.out.printf("J'ai tant d'argent : %020f", monDouble);

        System.out.println(); // améliore la lisibilité
        System.out.printf("J'ai tant d'argent : %,f", monDouble);


    }
}