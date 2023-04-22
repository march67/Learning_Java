
public class Main {
    public static void main(String[] args) {

        // structure if => exécute le code si la condition évaluée est vraie
        int age = 13;

        if(age==75) {
            System.out.println("tu es âgé de 75 ans");
        }
        else if(age>=18) {
            System.out.println("tu es un adulte");
        }
        else if(age>=12) {
            System.out.println("tu es un adolescent");
        }
        else{
            System.out.println("tu es un enfant");
        }
    }
}