package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Passing_Data_Among_Methods;

/**
 * CLASE DE DEMOSTRACION DE PASS-BY-VALUE EN JAVA
 *
 * Java SIEMPRE usa pass-by-value (pasa por valor)
 * - Para primitivos: se pasa una COPIA del valor
 * - Para objetos: se pasa una COPIA de la REFERENCIA
 */
public class PassByValueDemo {

    // ============================================
    // 1. PRIMITIVOS - PASO POR VALOR
    // ============================================
    public static void main(String[] args) {
        System.out.println("=== 1. PRIMITIVOS (PASO POR VALOR) ===\n");

        int num = 4;
        System.out.println("Antes de llamar: num = " + num);  // 4

        newNumber(num);
        System.out.println("Despues de llamar: num = " + num); // 4 (NO CAMBIA)

        System.out.println("\nExplicacion: Se pasa una COPIA del valor");
        System.out.println("El metodo modifica su copia, no la original\n");

        // ============================================
        // 2. STRING (INMUTABLE) - PASO POR VALOR
        // ============================================
        System.out.println("=== 2. STRING (INMUTABLE) ===\n");

        String name = "Webby";
        System.out.println("Antes: name = " + name);  // Webby

        speak(name);
        System.out.println("Despues: name = " + name); // Webby (NO CAMBIA)

        System.out.println("\nExplicacion: String es inmutable");
        System.out.println("La reasignacion crea un nuevo String, no afecta al original\n");

        // ============================================
        // 3. STRINGBUILDER (MUTABLE) - PASO POR VALOR
        // ============================================
        System.out.println("=== 3. STRINGBUILDER (MUTABLE) ===\n");

        StringBuilder sb = new StringBuilder();
        System.out.println("Antes: sb = '" + sb + "'");  // ""

        appendText(sb);
        System.out.println("Despues: sb = '" + sb + "'"); // "Webby" (SI CAMBIA)

        System.out.println("\nExplicacion: Se pasa COPIA de la REFERENCIA");
        System.out.println("Ambas referencias apuntan al MISMO objeto");
        System.out.println("Los cambios en el objeto son visibles para ambos\n");

        // ============================================
        // 4. REASIGNACION vs METODO EN OBJETO
        // ============================================
        System.out.println("=== 4. REASIGNACION vs METODO EN OBJETO ===\n");

        StringBuilder sb2 = new StringBuilder("Hola");
        System.out.println("Original: sb2 = '" + sb2 + "'");  // Hola

        // CASO 1: Reasignar la referencia (NO afecta al original)
        reassign(sb2);
        System.out.println("Despues de reassign(): sb2 = '" + sb2 + "'"); // Hola (NO CAMBIA)

        // CASO 2: Llamar a metodo en el objeto (SI afecta)
        appendText(sb2);
        System.out.println("Despues de appendText(): sb2 = '" + sb2 + "'"); // HolaWebby (SI CAMBIA)

        System.out.println("\nExplicacion:");
        System.out.println("  * REASIGNAR el parametro: NO afecta al original");
        System.out.println("  * LLAMAR METODOS del objeto: SI afecta al original");
        System.out.println();

        // ============================================
        // 5. SWAP DEMO (NO FUNCIONA EN JAVA)
        // ============================================
        System.out.println("=== 5. SWAP - NO FUNCIONA EN JAVA ===\n");

        int a = 1;
        int b = 2;
        System.out.println("Antes del swap: a = " + a + ", b = " + b);  // 1, 2

        swap(a, b);
        System.out.println("Despues del swap: a = " + a + ", b = " + b); // 1, 2 (NO CAMBIA)

        System.out.println("\nExplicacion: Java NO puede intercambiar valores asi");
        System.out.println("Se pasan copias, el metodo intercambia las copias\n");

        // ============================================
        // 6. VALORES RETORNADOS (IGNORADOS)
        // ============================================
        System.out.println("=== 6. VALORES RETORNADOS (IGNORADOS) ===\n");

        int number = 1;
        String letters = "abc";
        System.out.println("Inicial: number = " + number + ", letters = " + letters);

        // CASO 1: Valor retornado IGNORADO
        number(number);
        System.out.println("Despues de number(number) IGNORADO: number = " + number); // 1

        // CASO 2: Valor retornado ASIGNADO
        letters = letters(letters);
        System.out.println("Despues de letters(letters) ASIGNADO: letters = " + letters); // abcd

        System.out.println("\nExplicacion:");
        System.out.println("  * Si ignoras el valor retornado, se pierde");
        System.out.println("  * El metodo modifica su copia, no la variable original");
        System.out.println("  * Solo el valor retornado puede cambiar la variable");
        System.out.println();

        // ============================================
        // 7. DIAGRAMA CONCEPTUAL
        // ============================================
        System.out.println("=== 7. DIAGRAMA CONCEPTUAL ===\n");
        System.out.println("  +--------------------------------------------------+");
        System.out.println("  |             JAVA = PASS-BY-VALUE                |");
        System.out.println("  +--------------------------------------------------+");
        System.out.println("  |                                                  |");
        System.out.println("  |  PRIMITIVOS           OBJETOS                   |");
        System.out.println("  |  +-------------+     +----------------------+   |");
        System.out.println("  |  | Se copia el |     | Se copia la          |   |");
        System.out.println("  |  | VALOR       |     | REFERENCIA           |   |");
        System.out.println("  |  +-------------+     +----------------------+   |");
        System.out.println("  |         |                       |               |");
        System.out.println("  |         v                       v               |");
        System.out.println("  |  El metodo NO afecta    El metodo SI afecta    |");
        System.out.println("  |  a la variable          al objeto (si usa      |");
        System.out.println("  |  original               metodos del objeto)    |");
        System.out.println("  |                                                  |");
        System.out.println("  +--------------------------------------------------+");
        System.out.println();

        // ============================================
        // 8. RESUMEN PUNTOS CLAVE
        // ============================================
        System.out.println("=== 8. PUNTOS CLAVE ===");
        System.out.println("  1. Java SIEMPRE usa pass-by-value");
        System.out.println("  2. Para PRIMITIVOS: se pasa COPIA del valor");
        System.out.println("  3. Para OBJETOS: se pasa COPIA de la REFERENCIA");
        System.out.println("  4. REASIGNAR el parametro: NO afecta al original");
        System.out.println("  5. LLAMAR METODOS del objeto: SI afecta al original");
        System.out.println("  6. String es INMUTABLE, los cambios no afectan");
        System.out.println("  7. StringBuilder es MUTABLE, los cambios SI afectan");
        System.out.println("  8. Los valores retornados pueden ignorarse");
        System.out.println("====================================================");
    }

    // ============================================
    // METODOS DE EJEMPLO
    // ============================================

    // METODO 1: Primitivo (NO afecta al original)
    public static void newNumber(int num) {
        num = 8;  // Solo cambia la copia local
        System.out.println("  Dentro de newNumber(): num = " + num);
    }

    // METODO 2: String (NO afecta al original)
    public static void speak(String name) {
        name = "Sparky";  // Crea nuevo String, no afecta al original
        System.out.println("  Dentro de speak(): name = " + name);
    }

    // METODO 3: StringBuilder (SI afecta al original)
    public static void appendText(StringBuilder s) {
        s.append("Webby");  // Modifica el objeto
        System.out.println("  Dentro de appendText(): s = '" + s + "'");
    }

    // METODO 4: Reasignar referencia (NO afecta al original)
    public static void reassign(StringBuilder s) {
        s = new StringBuilder("Mundo");  // Reasigna la copia
        System.out.println("  Dentro de reassign(): s = '" + s + "'");
    }

    // METODO 5: Swap (NO funciona en Java)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("  Dentro de swap(): a = " + a + ", b = " + b);
    }

    // METODO 6: Retorna valor (puede ignorarse)
    public static int number(int number) {
        number++;
        System.out.println("  Dentro de number(): number = " + number);
        return number;
    }

    // METODO 7: Retorna String (puede ignorarse)
    public static String letters(String letters) {
        letters += "d";
        System.out.println("  Dentro de letters(): letters = " + letters);
        return letters;
    }
}
