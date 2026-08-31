package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Working_with_Binary_Arithmetic_Operators;

public class ArithmeticOperatos {
    public static void main(String[] args) {
        int x = 2 * 5 +3 * 4 - 8;  // usara los valores en orden de procedencia

        // ->  int x = 10 + 12 - 8;

        // podemos usar una parentecias para cambar el orden de la operacion
        // los del parentesis se resolveran primero
        // int x = 2 * (( 5 + 3 ) * 4 - 8);
        // int x = 2 * (8 * 4 - 8)
        // int x = 2 * (32 - 8);
        // int x = 2 * 24;
        // int x = 48;
        System.out.println( 9 / 3); // salida 3
        System.out.println( 9 % 3); // salida 0

        System.out.println( 10 / 3); // salida 3
        System.out.println( 10 % 3); // salida 1

        System.out.println( 11 / 3);  // salida 3
        System.out.println( 11 % 3); // salida 2

        System.out.println( 12 / 3); // salida 4
        System.out.println( 12 % 3); // salida 0

    }
}
