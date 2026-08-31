package Chapter3_Java.Day5_Core_APIs.Understanding_Java_Arrays;

public class CreatingAnArraywithReferenceVariables {

    public static void main(String[] args) {
        // ---- Arrays de tipos de referencia (String) ----
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs; // alias apunta al MISMO array

        System.out.println(bugs.equals(alias)); // true -> equals() en arrays compara REFERENCIA, no contenido
        System.out.println(bugs.toString());    // [Ljava.lang.String;@hash -> no legible
        System.out.println(java.util.Arrays.toString(bugs)); // [cricket, beetle, ladybug] -> forma legible

        // ---- Array no instanciado: null ----
        Names n1 = new Names();
        System.out.println(n1.names); // null -> solo se declaró, nunca se instanció con "new"

        // ---- Array instanciado: slots en null, pero el array existe ----
        Names2 n2 = new Names2();
        System.out.println(n2.names.length); // 2 -> tiene 2 espacios
        System.out.println(n2.names[0]);      // null -> cada slot está vacío, esperando un String

        // ---- Casting con arrays ----
        String[] strings = {"stringValue"};
        Object[] objects = strings;                 // OK sin cast: Object es más amplio que String
        String[] againStrings = (String[]) objects;  // requiere cast: vamos a un tipo más específico

        // againStrings[0] = new StringBuilder(); // NO COMPILA: String[] solo acepta String

        try {
            objects[0] = new StringBuilder(); // compila bien (Object[] "acepta" cualquier objeto)...
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException lanzada"); // ...pero falla en runtime
        }
    }

}

class Names {
    String names[]; // no instanciado -> null
}

class Names2 {
    String names[] = new String[2]; // instanciado, 2 slots en null
}