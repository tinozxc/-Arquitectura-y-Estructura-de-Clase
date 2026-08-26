package Chapter3_Java_Day_5_6.Day5_Core_APIs.Creating_And_Manipulating_Strings;

/**
 * Reglas del operador "+" (importantes para el examen OCA):
 *   1. Si AMBOS operandos son numéricos -> "+" significa suma numérica.
 *   2. Si AL MENOS UNO de los operandos es un String -> "+" significa concatenación.
 *   3. La expresión se evalúa de IZQUIERDA A DERECHA.
 *
 * Además: el operador "+=" en Strings es un atajo.
 *   s += "2";   equivale a   s = s + "2";
 */
public class Concatenation {

    public static void main(String[] args) {

        // ============================================================
        // EJEMPLO 1: Regla 1 -> ambos operandos son numéricos
        // ============================================================
        // 1 + 2 -> suma normal -> 3
        System.out.println(1 + 2); // 3

        // ============================================================
        // EJEMPLO 2: Regla 2 -> ambos operandos son String
        // ============================================================
        // "a" + "b" -> concatenación simple -> "ab"
        // Las comillas solo existen en el código, no se imprimen.
        System.out.println("a" + "b"); // ab

        // ============================================================
        // EJEMPLO 3: Combina las reglas 2 y 3 (izquierda a derecha)
        // ============================================================
        // Paso 1: "a" + "b" -> "ab"      (regla 2)
        // Paso 2: "ab" + 3  -> "ab3"     (regla 2, porque hay un String)
        System.out.println("a" + "b" + 3); // ab3

        // ============================================================
        // EJEMPLO 4: Combina las reglas 1, 2 y 3
        // ============================================================
        // Paso 1: 1 + 2   -> 3          (regla 1, ambos numéricos)
        // Paso 2: 3 + "c" -> "3c"       (regla 2, uno es String)
        System.out.println(1 + 2 + "c"); // 3c

        // ============================================================
        // EJEMPLO 5: El "truco" clásico del examen con variables
        // ============================================================
        int three = 3;
        String four = "4";

        // Paso 1: 1 + 2      -> 3        (regla 1: ambos int)
        // Paso 2: 3 + three  -> 6        (regla 1: three es int)
        // Paso 3: 6 + four   -> "64"     (regla 2: four es String)
        System.out.println(1 + 2 + three + four); // 64

        // ============================================================
        // EJEMPLO 6: El operador += con Strings
        // ============================================================
        String s = "1";      // s contiene "1"
        s += "2";             // equivale a: s = s + "2"; -> s contiene "12"
        s += 3;                // equivale a: s = s + 3;   -> s contiene "123"
        System.out.println(s); // 123
    }
}
