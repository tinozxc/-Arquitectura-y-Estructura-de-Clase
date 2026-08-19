package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Static;

public class StaticVariables {

    // ---- static normal: puede cambiar con el tiempo ----
    private static int counter = 0; // inicialización en la misma línea de declaración

    // ---- static final: constante, no puede cambiar nunca ----
    private static final int NUM_BUCKETS = 45; // convención: MAYÚSCULAS_CON_GUION_BAJO

    public static void main(String[] args) {
        counter++; // OK: no es final, puede modificarse libremente
        System.out.println(counter); // 1

        // NUM_BUCKETS = 5; // NO COMPILA: es final, la referencia/valor no puede reasignarse
    }


}
