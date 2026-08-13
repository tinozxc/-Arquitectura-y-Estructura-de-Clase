package Capitulo3_Understanding_Java_Operators;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        // 1. Post-unarios: expression++, expression--
        int a = 5;
        int b = a++; // primero se usa el valor de "a" (5), luego se incrementa
        System.out.println("a++ -> b=" + b + ", a=" + a); // b=5, a=6

        // 2. Pre-unarios: ++expression, --expression
        int c = 5;
        int d = ++c; // primero se incrementa "c", luego se usa el valor
        System.out.println("++c -> d=" + d + ", c=" + c); // d=6, c=6

        // 3. Otros unarios: +, -, !
        boolean flag = false;
        System.out.println("!flag = " + !flag); // true
        System.out.println("-a = " + (-a));      // -6

        // 4. Multiplicación / División / Módulo: *, /, %
        int mult = 4 * 2;   // 8
        int div  = 9 / 2;   // 4 (división entera)
        int mod  = 9 % 2;   // 1 (resto)
        System.out.println("mult=" + mult + " div=" + div + " mod=" + mod);

        // 5. Suma / Resta: +, -
        int suma = 10 + 5 * 2; // primero se multiplica (mayor precedencia): 10 + 10 = 20
        System.out.println("suma=" + suma);

        // 6. Operadores de desplazamiento (shift): <<, >>, >>>
        int shiftIzq = 1 << 3;  // desplaza bits a la izquierda: 8
        int shiftDer = 8 >> 2;  // desplaza bits a la derecha: 2
        System.out.println("shiftIzq=" + shiftIzq + " shiftDer=" + shiftDer);

        // 7. Operadores relacionales: <, >, <=, >=, instanceof
        boolean mayor = (5 > 3); // true
        Object obj = "texto";
        boolean esInstancia = obj instanceof String; // true
        System.out.println("mayor=" + mayor + " esInstancia=" + esInstancia);

        // 8. Igual a / distinto de: ==, !=
        boolean iguales = (5 == 5); // true
        System.out.println("iguales=" + iguales);

        // 9. Operadores lógicos (bit a bit sobre booleanos): &, ^, |
        boolean and = true & false; // false
        boolean xor = true ^ false; // true
        boolean or  = true | false; // true
        System.out.println("and=" + and + " xor=" + xor + " or=" + or);

        // 10. Operadores lógicos de cortocircuito: &&, ||
        // Si la primera condición ya define el resultado, no evalúa la segunda
        boolean cortoAnd = (false && (5 / 0 == 0)); // no lanza error porque no evalúa la división
        System.out.println("cortoAnd=" + cortoAnd);

        // 11. Operador ternario: condicion ? valor1 : valor2
        int edad = 20;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("resultado=" + resultado);

        // 12. Operadores de asignación: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
        int x = 10;
        x += 5; // x = x + 5
        x *= 2; // x = x * 2
        System.out.println("x final=" + x); // 30
    }
}
