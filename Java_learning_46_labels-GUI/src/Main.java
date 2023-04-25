import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JLabel = un GUI (graphical user interface) qui affiche une zone
        // pour une chaîne de caractère, une image, ou les deux

        ImageIcon image = new ImageIcon("img.jpg");

        // création d'une bordure verte (à ajouter à un composant)
        Border bordure = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel(); // création du libelle "label"
        label.setText("Je suis un libelle !"); // fixe un texte au libelle "label"

        JFrame frame = new JFrame();

        // ferme le programme lorsque le cadre est fermé
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(950,700); // fixe une taille
        frame.setVisible(true); // fait apparaître le cadre
        frame.add(label); // ajout du libelle avec la méthode add([nom libelle]);

        // getImage() => récupère le contenu image de l'instance ImageIcon
        // frame.setIconImage(image.getImage()); // permet de change l'image Icone
        label.setIcon(image); // fournis une image au libelle "label"

        // pour changer la position de l'image relative au libelle, deux méthodes
        // left / center / right
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP); // TOP,CENTER,BOTTOM
        label.setForeground(Color.green); // fixe la couleur de police

        // pour changer la position relative du libelle au cadre
        label.setVerticalAlignment(JLabel.CENTER); // axe vertical
        label.setHorizontalAlignment(JLabel.CENTER); // axe horizontal

        // fixe un style de police, type de police, taille
        label.setFont(new Font("MV Boli", Font.BOLD, 20));

        label.setIconTextGap(-25); // fixe l'écart entre le libelle et l'icône

        // fixe la couleur de fond du libelle à l'aide deux méthodes
        label.setBackground(Color.black); // il faut ensuite le rendre opaque
        label.setOpaque(true); // il faut fixe la taille du libelle
        label.setBorder(bordure); // utilisation de la bordure crée, cela met
        // en évidence la taille du libelle qui occupe tout l'espace disponible

        // pour modifier la taille du libelle
        // il faut modifier le Layout (disposition) qui est par défaut
        frame.setLayout(null);
        // puis à l'intérieur de ce frame, fixer une position et une taille
        // du composant qu'on veut ajouter
        // x = nb de pixels à droite à partir de la gauche
        // y = nb de pixels en bas à partir du haut
        // width (largeur) et height (hauteur) : dimension du libelle "label"
        label.setBounds(50, 150, 400, 650);


    }
}