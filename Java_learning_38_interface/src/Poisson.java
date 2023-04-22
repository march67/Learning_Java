public class Poisson implements Proie, Predator{
    // implémente plusieurs interfaces
    // implements [nom interface1, nominterface2, ...]
    @Override
    public void fuir() {
        System.out.println("Le poisson fuit un poisson plus grand");
    }
    @Override
    public void chasser() {
        System.out.println("Le poisson chasse un poisson plus petit");
    }
}
