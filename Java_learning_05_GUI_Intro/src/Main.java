import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        // ouvre une boîte de dialogue
        String nom = JOptionPane.showInputDialog("Saisissez votre nom");

        // affiche dans une fenêtre le résultat de la chaîne de caractères + variable "nom"
        JOptionPane.showMessageDialog(null, "Résultat du nom : " + nom);

        // conversion de la chaîne de caractères de la saisie en integer
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Saisissez votre âge : "));

        JOptionPane.showMessageDialog(null, "L'âge saisie est : " + age);

        // taille en double
        double taille = Double.parseDouble(
                JOptionPane.showInputDialog("Saisissez votre taille en mètre : "));

        JOptionPane.showMessageDialog(null, "La taille saisie est : " + taille + "m");


    }
}