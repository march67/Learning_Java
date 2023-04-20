public class Chien extends Animal {
    // sub-class de Animal

    // il s'agit de la méthode redéfinie (overriden)
    // utiliser le mot clé "@Override", il n'est pas obligatoire mais il
    // s'agit d'une bonne pratique car il permet d'indiquer clairement
    // qu'il s'agit d'une redéfinition (override)
    @Override
    void parler() {
        System.out.println("Le chien aboie");
    }
}
