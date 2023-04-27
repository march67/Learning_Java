import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Layout Manager => définis la disposistion naturelle des composants
        // à l'intérieur d'un conteneur

        // 3 gestionnaires connus

        // BorderLayout => Un BorderLayout place les composants en cinq zones
        // : NORTH, SOUTH, WEST, EAST, CENTER.
        // tout espace supplémentaire est placé au centre de la zone

        // frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        // gestionnaire par défaut => new BorderLayout();
        // en argument on peut préciser des marges en hauteur et largeur
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        // pannel
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //---------------sous panneaux / sub panels --------------
        // pannel
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        // le panneau 5 va servir de conteneur il faut donc lui indiquer
        // un gestionnaire BorderLayout
        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        // ajout des sous panneaux / sub panels à l'intérieur d'un
        // conteneur panel
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.WEST);
        panel5.add(panel9, BorderLayout.EAST);
        panel5.add(panel10, BorderLayout.CENTER);

        // lors de l'ajout du panneau au cadre, on peut préciser en argument
        // la disposition du panneau
        // ajout des panneaux à l'intérieur d'un conteneur frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);



    }
}