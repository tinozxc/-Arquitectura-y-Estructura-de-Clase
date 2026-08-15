package Chapter2_java.day4.Loops_While_Do_While_For_For_each.The_Basic_for_Statemen;

public class ForLoopVariations {

    public static void main(String[] args) {

        // ----- Ejemplo básico: imprime del 0 al 9 -----
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ----- Ejemplo 2: múltiples variables en el for -----
        // - x se declara ANTES del loop, por lo que sigue disponible después.
        // - z se declara pero nunca se usa (es válido).
        // - el update statement modifica dos variables: x++ , y++
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println(x); // Imprime: 0 1 2 3 4  luego 5

        // ----- Ejemplo 3 corregido: no se puede REDECLARAR una variable -----
        // int x = 0;
        // for (long y = 0, x = 4; ...)   // NO COMPILA (x ya estaba declarada)
        //
        // Solución: declarar x y y ANTES del loop, y solo ASIGNAR dentro del for
        int x2 = 0;
        long y2 = 10;
        for (y2 = 0, x2 = 4; x2 < 5 && y2 < 10; x2++, y2++) {
            System.out.print(x2 + " ");
        }
        System.out.println();

        // ----- Ejemplo 4: tipos incompatibles en el bloque de inicialización -----
        // for (long y = 0, int x = 4; ...)  // NO COMPILA
        // Todas las variables declaradas en el initialization block deben ser
        // del MISMO tipo (aquí y era long y x era int -> error)

        // ----- Ejemplo 5: usar la variable del loop fuera de su alcance -----
        // for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
        //     System.out.print(y + " ");
        // }
        // System.out.print(x); // NO COMPILA -> x solo existe dentro del for

        // ----- Ejemplo de infinite loop con for -----
        // for ( ; ; ) {
        //     System.out.println("Hello World");
        // }
        // Compila y corre sin problema: los 3 componentes del for son opcionales.
        // OJO: for( ; ) o for( ) SÍ darían error, los ; son obligatorios.
    }

}
