import java.io.File;
public class Main {
    public static void main(String[] args) {
        // file => représentation abstraite de noms de fichiers et de répertoires
        File fichier1 = new File("Java_learning.txt");

        // exists() vérifie que le fichier1 existe avant l'exécution de la déclaration
        // de la boucle if
        if(fichier1.exists()) {
            System.out.println("Le fichier existe !");
            System.out.println(fichier1.getAbsolutePath()); // retourne le chemin
            // absolu
        }
        else {
            System.out.println("Le fichier n'existe pas !");
        }

        // si le fichier ne se trouve pas dans le répertoire du projet mais à un
        // autre emplacement sur l'ordinateur, il faut donner le chemin
        File fichier2 = new File("C:\\Users\\David TA\\Desktop\\Module6.docx");
        if(fichier2.exists()) {
            System.out.println("Le fichier2 existe !"); // fonctionne
            System.out.println(fichier2.getPath()); // retourne le chemin du fichier
        }
        else {
            System.out.println("Le fichier2 n'existe pas !");
        }

        // autres méthodes file.isFile(), file.delete(), etc.
    }
}