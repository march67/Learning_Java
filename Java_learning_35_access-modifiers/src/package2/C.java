package package2;
import package1.*;
public class C {
    // il est possible de modifier le modificateur d'accès de la classe
    // public class C => class C => A ne pourra donc plus instancier C car le
    // constructeur n'est plus accessible à l'extérieur du package2

    public String publicMessage = "C'est le modificateur d'accès public";
    protected String protectedMessage = "C'est le modificateur d'accès protected";
    String defautMessage = "C'est le modificateur d'accès par défaut";
}
