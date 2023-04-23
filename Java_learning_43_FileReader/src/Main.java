import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // FileReader => lit le contenu d'un fichier en tant que flux de
        // caractères. Un par un read() retourne un entier qui contient la
        // valeur en octet, quand read() retourne -1, il n'y a plus de données
        // à lire.
        try {
            FileReader reader = new FileReader("C:\\Users\\David TA\\" +
                    "Desktop\\Module6.docx");
            int donnee = reader.read();
            while (donnee != -1) {
                System.out.print((char)donnee);
                donnee = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}