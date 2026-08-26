package Chapter2_java_Day_3_4.day3.Capitulo3_Understanding_Java_Operators.Using_Additional_Binary_Operators;

public class CastingPrimitiveValues {

    public static void main(String[] args) {

        //Casting y overflow/Underflow

        int x = (int)1.0;
        short y = (short)1921222;   // se guarda como 20678 (overflow)
        int z = (int)9L;
        long t = 192301398193810323L; // sufijo L para long

        // underflow = valor demasiado grande

        System.out.print(2147483647 + 1); // -2147483648 (overflow: se pasa del máximo int)

        //caso short + short
        /*
        short x = 10;
        short y = 3;
        short z = x * y; // NO COMPILA (se promociona a int, no se puede asignar a short)


         */
        // solucion casting

        short xc = 10;
        short yc = 3;
        short zc = (short)(x * y); // OK, forzamos el cast
    }
}
