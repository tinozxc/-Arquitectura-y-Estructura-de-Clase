package Capitulo3_Understanding_Java_Operators.Understanding_java_statments;

public class IfElseExample {

    public static void main(String[] args) {

        int hourOfDay = 10;
        int morningGreetingCount = 0;

        // ===== IF-THEN SIMPLE (sin bloque) =====
        if (hourOfDay < 11)
            System.out.println("Good Morning");
        // Solo esta línea depende del if. Ojo con la indentación engañosa:

        if (hourOfDay < 11)
            System.out.println("Good Morning");
        morningGreetingCount++;
        // ¡CUIDADO! Esta línea SIEMPRE se ejecuta, no depende del if,
        // aunque la indentación sugiera lo contrario (Java ignora tabs/espacios)

        // ===== IF-THEN CON BLOQUE (recomendado) =====
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++; // ahora sí depende del if, gracias a las llaves {}
        }

        // ===== VERSIÓN INEFICIENTE: dos IF separados =====
        // Evalúa hourOfDay dos veces (redundante y potencialmente costoso)
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if (hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        // ===== IF-THEN-ELSE: una sola evaluación, dos ramas =====
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        // ===== IF-ELSE IF-ELSE: múltiples ramas encadenadas =====
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
        // Se ejecuta la PRIMERA condición true encontrada; si ninguna lo es, se va al else

        // ===== ERROR DE ORDEN: código inalcanzable =====
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning"); // INALCANZABLE
            // Si hourOfDay < 11, entonces también es < 15,
            // por lo que la primera condición SIEMPRE lo captura antes.
            // Esta rama nunca se ejecutará.
        } else {
            System.out.println("Good Evening");
        }

        // ===== ERRORES DE COMPILACIÓN COMUNES =====
        int x = 1;

        // if (x) { }
        // NO COMPILA: en Java, un int no es un boolean (a diferencia de otros lenguajes)

        // if (x = 5) { }
        // NO COMPILA: x = 5 es una ASIGNACIÓN (resulta en int), no una comparación booleana
        // Lo correcto sería: if (x == 5) { }
    }
}
