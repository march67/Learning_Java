import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JLabel = un GUI (graphical user interface) qui affiche une zone
        // pour une chaîne de caractère, une image, ou les deux

        JLabel label = new JLabel(); // création du libelle
        label.setText("Je suis un libelle !"); // fixe un texte de libelle

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(950,600);
        frame.setVisible(true);
        frame.add(label); // ajout du libelle avec la méthode add();

    }
}