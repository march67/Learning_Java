package package1;
import package2.*;
public class A {
    protected String protectedMessage = "C'est le modificateur d'accès protected";
    // il est accessible à l'extérieur du package2
    public static void main(String[] args) {
        C c1 = new C();
        System.out.println(c1.defautMessage); // indique que la variable n'est pas
        // accessible depuis un package extérieur

        System.out.println(c1.publicMessage); // possible car la variable est publique
        // elle est donc accessible à l'extérieur du package2 (ici package1)

        B b1 = new B();
        System.out.println(b1.privateMessage); // impossible car il s'agit d'une
        // variable privée, seulement la classe elle même peut y accéder (B)
    }
}
