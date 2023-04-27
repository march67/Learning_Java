import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Layout Manager / gestionnaire de dispositionnement => définis une
        // disposition naturelle des composants à l'intérieur d'un conteneur

        // FlowLayout => place les composants sur une ligne, la taille est
        // fixée selon la préférence (preferred size).
        // Si l'espace horizontal dans le conteneur est trop petit, le
        // FlowLayout class utilise la prochaine ligne disponible

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // frame.setLayout(new FlowLayout()); par défaut
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER)); équivalent du défaut
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING)); // top left corner
        // on peut préciser l'écart horizontal et vertical entre les composants
        // avec les arguments :
        frame.setLayout(new FlowLayout(FlowLayout.TRAILING,0,0));
        // top right corner

        // panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,200));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        // solution 1 pour créer un button
        JButton button1 = new JButton();
        button1.setText("1");
        panel.add(button1);

        // solution 2 pour créer un button
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        frame.setVisible(true);
        frame.add(panel);

    }
}