package Chapter3_Java_Day_5_6.Day5_Core_APIs.Using_The_StringBuilderClass;

public class StringBuilderMethods {

    public static void main(String[] args) {
        // ---- Creación ----
        StringBuilder sb1 = new StringBuilder();         // vacío
        StringBuilder sb2 = new StringBuilder("animal"); // con valor inicial
        StringBuilder sb3 = new StringBuilder(10);        // capacidad inicial de 10 (no tamaño)

        // ---- charAt, indexOf, length, substring (igual que en String) ----
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // desde índice 0 hasta antes del 4
        int len = sb.length();  // 7 -> cantidad de caracteres
        char ch = sb.charAt(6); // 's' -> índice 6
        System.out.println(sub + " " + len + " " + ch); // anim 7 s

        // ---- append: acepta muchos tipos, no solo String ----
        StringBuilder chain = new StringBuilder().append(1).append('c');
        chain.append("-").append(true);
        System.out.println(chain); // 1c-true

        // ---- insert: cuidado, los índices cambian con cada inserción ----
        StringBuilder ins = new StringBuilder("animals");
        ins.insert(7, "-"); // animals-
        ins.insert(0, "-"); // -animals-
        ins.insert(4, "-"); // -ani-mals-
        System.out.println(ins);

        // ---- delete y deleteCharAt ----
        StringBuilder del = new StringBuilder("abcdef");
        del.delete(1, 3); // adef -> borra desde índice 1 hasta antes del 3
        System.out.println(del);
        // del.deleteCharAt(5); // lanzaría excepción: solo hay 4 caracteres ahora

        // ---- reverse ----
        StringBuilder rev = new StringBuilder("ABC");
        rev.reverse();
        System.out.println(rev); // CBA

        // ---- toString: convierte a String normal ----
        String s = rev.toString();
        System.out.println(s.equals("CBA")); // true
    }

}
