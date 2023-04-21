public abstract class Vehicule {
    // normalement la classe Vehicule n'est jamais instanciée car il s'agit d'un
    // terme trop "vague" qui n'a aucune utilité dans certains contextes
    // on veut donc empêcher son instanciation à l'aide de l'abstraction
    // c'est une superclass qui ne va servir qu'à ça

    // public class Vehicule => public abstract Vehicule
    // augmentation de la sécurité

    abstract void demarrer(); // pas d'accolade sinon = corps et erreur d'abstraction
}
