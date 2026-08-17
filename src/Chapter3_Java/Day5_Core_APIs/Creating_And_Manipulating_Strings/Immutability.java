package Chapter3_Java.Day5_Core_APIs.Creating_And_Manipulating_Strings;

public class Immutability {

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2"); // s2 = "12"
        s2.concat("3");             // se crea un nuevo String "123", pero no se guarda en ninguna variable -> se pierde
        System.out.println(s2);     // 12
    }
}

// Mutable: tiene setter, por lo que la referencia "s" puede reasignarse a otro valor
class Mutable {
    private String s;
    public void setS(String newS) { s = newS; }
    public String getS() { return s; }
}

// Immutable: solo tiene getter, el campo es final y la clase también es final
// (no se puede heredar y agregar mutabilidad)
final class Immutable {
    private final String s = "name";
    public String getS() { return s; }
}


