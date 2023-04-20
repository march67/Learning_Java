
public class Main {
    public static void main(String[] args) {

        // super => mot clé qui réfère à la super-class (parent-class) d'une
        // instance, utilité similaire au mot-clé "this"

        Hero hero1 = new Hero("David", 24, "Riche");

        // Sans l'utilisation de toString()
        System.out.println(hero1.nom);
        System.out.println(hero1.age);
        System.out.println(hero1.abilite);

        // Avec l'utilisation de toString() appelée implicitement
        System.out.println(hero1); // = System.out.println(hero1.toString());
    }
}