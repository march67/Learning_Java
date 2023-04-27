import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JLayeredPane / volet superposé => Conteneur Swing qui fournit une troisième
        // dimension pour le positionnement des composants
        // ex : profondeur, index Z (Z-index)

        // label / libelle
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.red);
        label.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        // pane / panneau
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        // en argument on peut passer à quel couche on veut ajouter le composant
        // couches dans l'ordre : default, palette, modal, popup, drag
        layeredPane.add(label, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
        // autre solution
        // layeredPane.add(label, Interger.valueOf(0));
        // layeredPane.add(label3, Interger.valueOf(1));


        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(layeredPane);
        frame.setVisible(true);

    }

}