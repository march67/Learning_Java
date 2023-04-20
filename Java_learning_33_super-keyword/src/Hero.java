public class Hero extends Personne {
    // hérite des variables "nom" et "age"
    String abilite; // variable de classe de "Hero"

    Hero(String nom, int age, String abilite) {
        super(nom,age); // permet de référer à la variable de la classe parent
        // /!\ il faut que la classe parent possède un constructeur avec le
        // même nombre de paramètres et dans le même ordre (type de variables)
        // que l'appel super([args])

        this.abilite = abilite; // permet de référer à la variable de classe
    }

    public String toString() {
        return super.toString() + this.abilite; // appel la méthode de base de la
        // classe parent puis modification de l'implémentation
    }
}
