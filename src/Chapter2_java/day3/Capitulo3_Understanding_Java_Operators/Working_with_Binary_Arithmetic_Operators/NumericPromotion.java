package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Working_with_Binary_Arithmetic_Operators;

public class NumericPromotion {

    public static void main(String[] args) {

        // Regla 1: distinto tipo -> se promociona al mayor
        int x1 = 1;
        long y1 = 33;
        long r1 = x1 * y1; // int se promociona a long -> resultado long

        // Regla 2: entero + decimal -> entero se promociona a decimal
        // OJO: los literales decimales son double por defecto (usar "f" para float)
        double x2 = 39.21;
        float y2 = 2.1f;  // sin la "f" no compila (double no cabe en float)
        double r2 = x2 + y2; // float se promociona a double -> resultado double

        // Regla 3: byte/short/char SIEMPRE se promocionan a int en operadores binarios
        short x3 = 10;
        short y3 = 3;
        int r3 = x3 / y3; // ambos short -> promocionados a int -> resultado int (NO short)

        // Regla 4 (combinación de todas): se aplican en cadena, de izq a derecha
        short x4 = 14;
        float y4 = 13;
        double z4 = 30;
        double r4 = x4 * y4 / z4;
        // x4: short -> int (regla 3)
        // int * float -> float (regla 1/2)
        // float / double -> double (regla 1)
        // resultado final: double
    }
}
