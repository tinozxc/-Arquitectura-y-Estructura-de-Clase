package Chapter3_Java.Day5_Core_APIs.Creating_And_Manipulating_Strings;

public class StringPool {

    public static void main(String[] args) {
        String a = "Fluffy";              // va al string pool
        String b = "Fluffy";              // reutiliza el mismo objeto del pool
        String c = new String("Fluffy");  // fuerza un objeto nuevo, fuera del pool

        System.out.println(a == b); // true  -> misma referencia (pool)
        System.out.println(a == c); // false -> objetos distintos en memoria

        String d = c.intern();      // trae/devuelve la referencia del pool
        System.out.println(a == d); // true
    }

}
