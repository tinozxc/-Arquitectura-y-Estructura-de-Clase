package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Using_Additional_Binary_Operators;

public class CompoundAsignmentOperators {
    public static void main(String[] args) {

        //Operadores de Asignación Compuestos
        //
        //Además del = simple, existen operadores compuestos (+=, -=, *=, etc.).
        //
        //Son una forma abreviada que combina una operación aritmética/lógica con
        // la asignación:
        int x = 2, z = 3;
        x = x * z;   // Asignación simple
        x *= z;      // Asignación compuesta (equivalente)

        /*
        //castea automaticamente
        long xc= 10;
        int yc = 5;
        yc = yc * xc;   // NO COMPILA (resultado es long, no cabe en int)


         */

        long xc = 10;
        int yc = 5;
        yc *= xc;      // SÍ COMPILA
// Internamente: castea x a long, multiplica, y castea el resultado de vuelta a int

        //Dato extra: una asignación es también una expresión que retorna el valor asignado.

        long xd = 5;
        long y = (x = 3);
        System.out.println(xd); // 3
        System.out.println(y); // 3

    }
}
