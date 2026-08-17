package Chapter3_Java.Day5_Core_APIs.Creating_And_Manipulating_Strings;

public class ImportStringMethods {


    public static void main(String[] args) {
        String s = "animals"; // índices: a0 n1 i2 m3 a4 l5 s6

        System.out.println(s.length());              // 7 -> cuenta normal, no desde 0
        System.out.println(s.charAt(0));              // a -> índice 0
        System.out.println(s.charAt(6));               // s -> índice 6
        // s.charAt(7);                                 -> StringIndexOutOfBoundsException

        System.out.println(s.indexOf('a'));            // 0  -> primera 'a'
        System.out.println(s.indexOf("al"));            // 4  -> primer "al"
        System.out.println(s.indexOf('a', 4));           // 4  -> busca desde el índice 4
        System.out.println(s.indexOf("al", 5));           // -1 -> no encuentra, empieza tarde

        System.out.println(s.substring(3));                 // mals -> desde 3 hasta el final
        System.out.println(s.substring(3, 4));                // m    -> desde 3 hasta antes de 4
        System.out.println(s.substring(3, 7));                  // mals -> desde 3 hasta antes de 7 (=final)
        System.out.println(s.substring(3, 3));                   // ""   -> vacío, mismo índice
        // s.substring(3, 2);                                     -> excepción, índice final menor
        // s.substring(3, 8);                                      -> excepción, no existe índice 8

        System.out.println(s.toUpperCase());                       // ANIMALS
        System.out.println("Abc123".toLowerCase());                 // abc123

        System.out.println("abc".equals("ABC"));                     // false -> distingue mayúsculas
        System.out.println("ABC".equals("ABC"));                     // true
        System.out.println("abc".equalsIgnoreCase("ABC"));           // true -> ignora mayúsculas

        System.out.println("abc".startsWith("a"));                   // true
        System.out.println("abc".endsWith("c"));                     // true

        System.out.println("abc".contains("b"));                     // true -> busca en cualquier posición

        System.out.println("abcabc".replace('a', 'A'));               // AbcAbc
        System.out.println("abcabc".replace("a", "A"));                // AbcAbc

        System.out.println("\t a b c\n".trim());                        // "a b c" -> quita espacios/tab/newline de los extremos
    }

}
