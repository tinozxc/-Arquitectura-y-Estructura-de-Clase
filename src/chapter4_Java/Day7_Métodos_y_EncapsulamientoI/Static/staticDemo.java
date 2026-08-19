package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Static;

import java.util.*;
import static java.util.Arrays.asList;  // Static import
// import static java.util.Arrays;      // ERROR: No se puede importar clase con static import

/**
 * CLASE DE DEMOSTRACION DE INITIALIZERS ESTATICOS Y STATIC IMPORTS
 */
public class staticDemo {

    // ============================================
    // 1. VARIABLES ESTATICAS
    // ============================================
    private static int one;                    // Variable static normal
    private static final int two;              // final sin inicializar
    private static final int three = 3;        // final inicializada
    // private static final int four;          // ERROR: no inicializada

    // ============================================
    // 2. STATIC INITIALIZER (BLOQUE ESTATICO)
    // ============================================
    static {
        one = 1;        // OK: variable no final
        two = 2;        // OK: primera y unica asignacion
        // three = 3;   // ERROR: ya fue inicializada en la declaracion
        // two = 4;     // ERROR: segunda asignacion a final
    }

    // ============================================
    // 3. STATIC INITIALIZER CON CALCULOS
    // ============================================
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;  // 3600
        System.out.println("Static initializer ejecutado");
    }

    // ============================================
    // 4. STATIC INITIALIZER CON COLLECTION
    // ============================================
    private static final List<String> NOMBRES;

    static {
        NOMBRES = new ArrayList<>();
        NOMBRES.add("Juan");
        NOMBRES.add("Maria");
        NOMBRES.add("Pedro");
    }

    // ============================================
    // 5. STATIC IMPORT DEMO
    // ============================================
    public static void main(String[] args) {
        System.out.println("=== STATIC INITIALIZERS ===");
        System.out.println("one: " + one);                          // 1
        System.out.println("two: " + two);                          // 2
        System.out.println("three: " + three);                      // 3
        System.out.println("NUM_SECONDS_PER_HOUR: " + NUM_SECONDS_PER_HOUR);  // 3600
        System.out.println("NOMBRES: " + NOMBRES);                  // [Juan, Maria, Pedro]

        System.out.println("\n=== STATIC IMPORTS ===");

        // ============================================
        // 6. USANDO STATIC IMPORT
        // ============================================
        // Sin static import: Arrays.asList("uno", "dos")
        // Con static import: asList("uno", "dos")
        List<String> lista = asList("uno", "dos", "tres");
        System.out.println("Lista con static import: " + lista);

        // ============================================
        // 7. COMPARATIVA: CON y SIN STATIC IMPORT
        // ============================================
        System.out.println("\nCOMPARATIVA:");

        // SIN static import (forma tradicional)
        List<String> listaNormal = Arrays.asList("A", "B", "C");
        System.out.println("  SIN static import: " + listaNormal);

        // CON static import (mas corto)
        List<String> listaStatic = asList("X", "Y", "Z");
        System.out.println("  CON static import: " + listaStatic);

        System.out.println("\n=== DEMOSTRACION DE ERRORES ===");
        demostrarErrores();
    }

    // ============================================
    // 8. DEMOSTRACION DE ERRORES COMUNES
    // ============================================
    public static void demostrarErrores() {
        System.out.println("\nERRORES COMUNES CON STATIC IMPORTS:");

        // ERROR 1: import static con clase (no metodo)
        System.out.println("  1. import static java.util.Arrays; // ERROR");
        System.out.println("     -> Static import es solo para miembros estaticos");

        // ERROR 2: orden incorrecto
        System.out.println("  2. static import java.util.Arrays.*; // ERROR");
        System.out.println("     -> El orden correcto es 'import static'");

        // ERROR 3: usar nombre de clase sin importarla
        System.out.println("  3. Arrays.asList('one'); // ERROR");
        System.out.println("     -> Si importas solo el metodo, no puedes usar Arrays.");

        System.out.println("\nEJEMPLOS CORRECTOS:");
        System.out.println("  import static java.util.Arrays.asList;");
        System.out.println("  asList('one', 'two'); // OK");
        System.out.println();

        System.out.println("  import static java.util.Arrays.*;");
        System.out.println("  asList('one', 'two'); // OK");
        System.out.println("  sort(array); // OK");
    }
}

// ============================================
// 9. CLASE ADICIONAL PARA DEMOSTRAR CONFLICTOS
// ============================================
class Statics {
    public static final String TYPE = "A";
}

class StaticsB {
    public static final String TYPE = "B";
}

// ============================================
// 10. EJEMPLO DE CONFLICTO (DESCOMENTAR PARA VER ERROR)
// ============================================
/*
import static Statics.TYPE;
import static StaticsB.TYPE;  // ERROR: conflicto de nombres

public class ConflictoStaticImport {
    public static void main(String[] args) {
        // System.out.println(TYPE); // Cual TYPE? Conflicto!
        System.out.println(Statics.TYPE);   // Solucion: usar nombre de clase
        System.out.println(StaticsB.TYPE);  // Solucion: usar nombre de clase
    }
}
*/
