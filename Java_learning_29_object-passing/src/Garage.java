public class Garage {
    // passage d'objet, on met en paramètre de la méthode de Garage
    // une reference de "Voiture"
    void park(Voiture uneVoiture) {
        System.out.println("La " + uneVoiture.nom + " est garée");
    }
}
