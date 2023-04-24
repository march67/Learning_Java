import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JFrame => une fenêtre GUI (graphical user interface) auquel on peut
        // ajouter des composants

        /* solution 1 pour créer un JFrame
        JFrame frame = new JFrame(); // créer un cadre
        ImageIcon image = new ImageIcon("img.jpg"); // récupère
        // une image dans le répertoire du projet

        frame.setIconImage(image.getImage()); // utilise l'image récupérée

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // arrête le
        // programme lors de la fermeture du cadre

        frame.setVisible(true); // fait apparaître le cadre
        frame.setSize(960,540); // fixe une taille de cadre
        frame.setResizable(false); // empêche la modification de la taille
        frame.setTitle("Learning Java"); // fixe un titre

        // chaîne de méthodes ou "method chaining"
        // getContentPane() retourne une reference de type Container
        // c'est une méthode de la classe JFrame
        // setBackground() méthode appelée sur l'instance de type Container
        // appartient à la classe Component
        frame.getContentPane().setBackground(new Color(20,40,60));
        // change la couleur de fond */

        // solution 2 avec la sub class de JFrame
        MyFrame myFrame = new MyFrame();

    }
}