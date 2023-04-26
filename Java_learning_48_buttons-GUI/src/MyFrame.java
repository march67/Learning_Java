import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    // implements ActionListener => pour l'écouteur d'événement
    // puis Override public void actionPerformed(ActionEvent e) {}

    private JButton button;
    private JLabel label;
    MyFrame() {
        // icône
        ImageIcon icon = new ImageIcon("");
        ImageIcon iconLabel = new ImageIcon("");

        // label
        label = new JLabel();
        label.setIcon(iconLabel);
        label.setBounds(0, 0, 150, 150);
        label.setVisible(false); // ActionPerformed va le rendre visible
        label.setText("Je suis un label");

        // buttons
        button = new JButton();
        button.setBounds(50, 100, 300, 110);
        button.addActionListener(this); // pour que actionPerformed
        // fonctionne
        button.setText("Je suis un boutton"); // fixe un nom
        button.setFocusable(false); // enlève un affichage ennuyeux
        // autour du texte
        button.setIcon(icon); // ajout d'un icône au boutton
        button.setHorizontalTextPosition(JButton.CENTER); // fixe la position
        // du texte relative au boutton
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.black);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        // frame
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    // action à réaliser lorsque le boutton s'active
    @Override
    public void actionPerformed(ActionEvent e) {
        // si la source de l'événement est "button" alors :
        if (e.getSource() == button ) {
            System.out.println("Le boutton s'active");
            label.setVisible(true);
        }
    }
}
