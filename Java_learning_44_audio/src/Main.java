import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // charge le fichier qui se situe dans le répertoire du projet
        File fichier = new File("Fine Dining - TrackTribe.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(fichier);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream); // ouvre le fichier audio
        Scanner scanner = new Scanner(System.in); // rôle d'empêcher la fin du prog
        String reponse = ""; // valeur vide pour qu'elle soit utilisable par "while"

        while(!reponse.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.println("Saisissez votre réponse");
            reponse = scanner.next(); // permet de continuer le programme
            reponse = reponse.toUpperCase(); // facilite l'utilisation du switch

            // switch([nom variable])
            // récupère la valeur de la variable et la compare à chaque "case"
            switch(reponse) {
                case ("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                break;
                default: System.out.println("Ce n'est pas une réponse valide");
            }

        }

    }
}