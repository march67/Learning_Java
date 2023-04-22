public class Voiture {
    // private => uniquement accessible à l'intérieur de la classe
    // il faut appeler les getters et setters si on veut accéder aux attributs
    // privés par son instance
    private String make;
    private String model;
    private int year;

    Voiture(String make, String model, int year) {
        setMake(make); // l'argument utilise la variable locale
        setModel(model);
        setYear(year);
    }

    // constructeur qui utilise la méthode copy(Voiture voiture)
    Voiture(Voiture voiture) {
        copy(voiture);
    }


    // getters, récupère les valeurs
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // setters, affecte les valeurs
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Voiture voiture) {
        setMake(voiture.getMake());
        setModel(voiture.getModel());
        setYear(voiture.getYear());
    }

}
