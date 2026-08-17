package Chapter3_Java.Day5_Core_APIs.Understanding_Equality;

public class EqualityDemo {
    public static void main(String[] args) {
        // ---- Literales: van al string pool ----
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true -> mismo objeto en el pool

        // ---- Uno computado en tiempo de ejecución: NO va al pool ----
        String z = " Hello World".trim();
        System.out.println(x == z);       // false -> objetos distintos (aunque el valor sea igual)
        System.out.println(x.equals(z));  // true  -> mismo contenido

        // ---- new String(): fuerza un objeto fuera del pool ----
        String a = new String("Hello World");
        String b = "Hello World";
        System.out.println(a == b); // false -> a NO usa el pool

        // ---- StringBuilder NO sobreescribe equals() ----
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb1.equals(sb2)); // false -> compara referencias, no contenido
    }
}

class Tiger {
    String name;
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;

        System.out.println(t1 == t1);       // true  -> mismo objeto
        System.out.println(t1 == t2);       // false -> objetos distintos
        System.out.println(t1.equals(t2));  // false -> Tiger no sobreescribe equals()
        System.out.println(t1 == t3);       // true  -> t3 apunta al mismo objeto que t1
    }
}
