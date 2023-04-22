public class Lapin implements Proie{
    // mot clé "implements [nom interface]
    // la classe qui implémente une interface est obligé d'implémenter ses méthodes
    @Override
    public void fuir() {
        System.out.println("Le lapin est en fuite");
    }
}
