package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Understanding_java_statments;

public class CompileTimeConstantValues {

    public static void main(String[] args) {

        // ================= SWITCH BÁSICO CON BREAK =================
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
        // Salida: "Weekday"
        // El "break" termina el switch y regresa el control al flujo normal.
        // El "default" NO necesita estar al final; el orden de case/default es libre,
        // A MENOS que se quiera controlar el fall-through (caída entre casos).


        // ================= SWITCH SIN BREAK (fall-through) =================
        int dayOfWeek2 = 5;
        switch (dayOfWeek2) {
            case 0:
                System.out.println("Sunday");
                // sin break -> cae al siguiente bloque
            default:
                System.out.println("Weekday");
                // sin break -> cae al siguiente bloque
            case 6:
                System.out.println("Saturday");
                break;
        }
        // Con dayOfWeek2 = 5 (no coincide con 0 ni 6):
        // Salta directo al "default" y sigue ejecutando hasta encontrar un break.
        // Salida:
        // Weekday
        // Saturday

        // Si dayOfWeek2 fuera 6:
        // Coincide con "case 6" directamente, IGNORA el default (aunque esté antes).
        // Salida: Saturday
        // (el default SOLO se ejecuta si NINGÚN case coincide, sin importar su posición)

        // Si dayOfWeek2 fuera 0:
        // Coincide con "case 0", y como no tiene break, sigue cayendo por TODO lo demás.
        // Salida:
        // Sunday
        // Weekday
        // Saturday

        // *** Los exámenes AMAN poner trampas con switch sin break ***
        // Siempre revisa si puede "caer" (fall-through) a múltiples bloques.


        // ================= PROBANDO getSortOrder =================
       // SwitchExample ejemplo = new SwitchExample();
      //  int resultado = ejemplo.getSortOrder("JR", "Smith");
      //  System.out.println("Resultado id: " + resultado); // 0, porque "JR" coincide con "suffix"
    }


    // ================= TIPOS VÁLIDOS EN "case" =================
    // Solo se permite: literal, constante enum, o variable "final"
    // inicializada con un literal EN LA MISMA línea de su declaración.
    private int getSortOrder(String firstName, final String lastName) {

        String middleName = "Patricia"; // NO es final -> NO sirve como case
        final String suffix = "JR";     // SÍ es final + literal -> SÍ sirve como case
        int id = 0;

        switch (firstName) {

            case "Test":              // OK: literal String
                return 52;

            // case middleName:       // NO COMPILARÍA: middleName no es "final"
            //     id = 5;
            //     break;

            case suffix:               // OK: suffix es final Y se inicializó con literal
                id = 0;
                break;

            // case lastName:         // NO COMPILARÍA: aunque lastName es "final" (parámetro),
            //     id = 8;            // no fue inicializado con un literal en su propia declaración
            //     break;

            // case 5:                // NO COMPILARÍA: tipo int, pero el switch es de tipo String
            //     id = 7;
            //     break;

            // case 'J':              // NO COMPILARÍA: tipo char, no coincide con String
            //     id = 10;
            //     break;

            // case java.time.DayOfWeek.SUNDAY: // NO COMPILARÍA: es un enum, no coincide con String
            //     id = 15;
            //     break;
        }
        return id;
    }

}
