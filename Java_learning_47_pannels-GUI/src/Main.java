import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JPanel => composant GUI (graphical user interface) qui fonctionne en tant
        // que conteneur (container) pour contenir d'autres composants

        // Icon / icône
        ImageIcon icon = new ImageIcon("");
        // l'icône sera ajouté au libelle "label"
        // je décide de le laisser vide car j'ai des images trop grandes

        // label / libelle
        JLabel label = new JLabel();
        label.setText("Bonjour"); // voir J_L_45
        label.setIcon(icon); // voir J_L_46
        // le libelle "label" sera ajouté à un panneau
        // après avoir changer le layout pour le mettre par défaut
        // .setLayout(new BorderLayout());
        label.setVerticalAlignment(JLabel.TOP); // voir J_L_46
        label.setHorizontalAlignment(JLabel.RIGHT); // voir J_L_46

        JLabel label2 = new JLabel();
        label2.setText("Bonjour, 2ème libelle");
        // avec un layout manager "null"
        // .setLayout(null);
        label2.setBounds(100, 100, 150,100);


        // panel / panneau
        JPanel panelRouge = new JPanel();
        panelRouge.setBackground(Color.red);
        panelRouge.setBounds(0,0,250,250); // voir J_L_46
        panelRouge.setLayout(null);

        JPanel panelBleu = new JPanel();
        panelBleu.setBackground(Color.blue);
        panelBleu.setBounds(250,0,250,250); // voir J_L_46
        // pour éviter l'utilisateur d'un layout manager
        panelBleu.setLayout(null);
        // puis utiliser la méthode setBounds()
        panelBleu.add(label2);

        JPanel panelVert = new JPanel();
        panelVert.setBackground(Color.green);
        panelVert.setBounds(0,250,500,250); // voir J_L_46
        panelVert.setLayout(new BorderLayout()); // modification du layout pour
        // utiliser le layout par défaut
        // on peut désormais modifier proprement la position du label
        // à voir en haut dans la section libelle !
        panelVert.add(label); // le libelle (avec l'icône) est ajouté à l'intérieur


        // frame / cadre
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // voir J_L_45
        frame.setLayout(null); // voir J_L_46
        frame.setSize(750,750); // voir J_L_46
        frame.setVisible(true); // voir J_L_45
        frame.add(panelRouge); // ajout du composant JPanel
        frame.add(panelBleu); // ajout du panneau bleu
        frame.add(panelVert); // ajout du panneau vert



    }
}