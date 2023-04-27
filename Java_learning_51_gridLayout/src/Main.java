import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Layout Manager / Gestionnaire de dispositionnement => définis une disposition
        // naturelle pour les composants à l'intérieur d'un conteneur

        // GridLayout => place les composants à l'intérieur d'une grille de celulles
        // chaque commposant prend tout l'espace disponible à l'intérieur d'une
        // celulle, et chaque celulle est de même taille

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // peut passer en argument le nombre de lignes et de colonnes
        // puis peut passer des arguments pour l'espacement horizontal et vertical
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);
    }
}