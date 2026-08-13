package Capitulo3_Understanding_Java_Operators.Understanding_java_statments;

public class TernaryOperator {

    public static void main(String[] args) {

        // ===== OPERADOR TERNARIO: ? : =====
        // Es el único operador que toma 3 operandos:
        // booleanExpression ? expression1 : expression2
        // El primero DEBE ser boolean; el 2do y 3ro pueden ser cualquier expresión con valor

        int y = 10;

        // ===== EQUIVALENCIA: if-then-else vs ternario =====

        // Versión if-then-else:
        final int xIfElse;
        if (y > 5) {
            xIfElse = 2 * y;
        } else {
            xIfElse = 3 * y;
        }

        // Versión ternaria (equivalente, más compacta):
        int xTernario = (y > 5) ? (2 * y) : (3 * y);
        // Se recomienda usar paréntesis para mayor legibilidad (no obligatorio)

        // ===== TIPOS DE DATOS EN LAS RAMAS =====
        // Las expresiones 2 y 3 NO necesitan ser del mismo tipo,
        // pero esto importa si se asigna el resultado a una variable

        System.out.println((y > 5) ? 21 : "Zebra");
        // COMPILA: println() acepta cualquier tipo, los convierte a String

        // int animal = (y < 91) ? 9 : "Horse";
        // NO COMPILA: el compilador exige que el resultado sea compatible con int,
        // y "Horse" (String) no lo es

        // ===== EVALUACIÓN PEREZOSA (solo se evalúa UNA rama) =====
        // Desde Java 7, solo se ejecuta la expresión de la rama elegida.
        // Cuidado si una rama tiene un efecto secundario (como ++)

        int y1 = 1;
        int z1 = 1;
        final int x1 = y1 < 10 ? y1++ : z1++;
        System.out.println(y1 + "," + z1);
        // Salida: 2,1
        // La condición (y1 < 10) es true -> se ejecuta y1++ -> z1 nunca se toca

        int y2 = 1;
        int z2 = 1;
        final int x2 = y2 >= 10 ? y2++ : z2++;
        System.out.println(y2 + "," + z2);
        // Salida: 1,2
        // La condición (y2 >= 10) es false -> se ejecuta z2++ -> y2 nunca se toca
    }

}
