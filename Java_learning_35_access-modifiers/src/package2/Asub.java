package package2;
import package1.*; // obligatoirement nécessaire d'importer pour pouvoir étendre
// la classe A qui se trouve dans package1
public class Asub extends A{
    public static void main(String[] args) {
        C c1 = new C();
        System.out.println(c1.defautMessage); // indique que la variable est
        // accessible car il s'agit d'une variable au sein du même package

        Asub asub1 = new Asub(); // hérite la variable protected se trouvant dans A

        System.out.println(asub1.protectedMessage); // protected accessible par la
        // subclass
    }
}
