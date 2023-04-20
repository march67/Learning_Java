public class Personne {
    String nom;
    int age;

    Personne(String name, int nombre) {
        nom = name;
        age = nombre;
    }


    public String toString() {
        return this.nom + "\n" + this.age + "\n"; // "\n" => new line
    }

}
