import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter redacteur = new FileWriter("Poème.txt");
            redacteur.write("Les roses sont rouges \nLes violets sont bleus\n");
            redacteur.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}