import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        // solution 2 pour créer un JFrame
        // remplacer "Edit => find & replace" le nom de la variable par "this"
        ImageIcon image = new ImageIcon("img.jpg");
        this.setIconImage(image.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(960,540);
        this.setResizable(false);
        this.setTitle("Learning Java");
        this.getContentPane().setBackground(new Color(20,40,60));
    }
}
