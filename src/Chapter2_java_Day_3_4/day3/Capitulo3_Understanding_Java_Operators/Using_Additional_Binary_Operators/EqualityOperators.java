package Chapter2_java_Day_3_4.day3.Capitulo3_Understanding_Java_Operators.Using_Additional_Binary_Operators;

import java.io.File;

public class EqualityOperators {

    public static void main(String[] args) {

        //Comparan dos operandos y retornan boolean. Solo se usan en 3 escenarios:

        //caso1. Dos tipos numéricos primitivos (se promocionan si son distintos):
        System.out.println(5 == 5.00); // true (5 se promociona a double)

        //No se pueden mezclar tipos entre estas categorías:

        /*  bolean caso
        boolean x = true == 3;           // NO COMPILA (boolean vs numérico)
        boolean y = false != "Giraffe";  // NO COMPILA (boolean vs objeto)
        boolean z = 3 == "Kangaroo";     // NO COMPILA (numérico vs objeto)


         */

        //! Cuidado: mezcla de = (asignación) con ==:

        boolean y = false;
        boolean x = (y = true); // ¡Es asignación, no comparación!
        System.out.println(x);  // true
         // (y = true) asigna true a "y" Y retorna true como valor de la expresión
         // Si fuera (y == true), el resultado sería false


        //IGUALDAD DE OBJETOS

        /*
        Con objetos, == compara las referencias, no el contenido. Dos referencias
         son iguales solo si apuntan al mismo objeto (o ambas son null).
         */

        File xc = new File("myFile.txt");
        File yc = new File("myFile.txt");
        File z = xc;

        System.out.println(xc == yc); // false (son dos objetos distintos, aunque con igual contenido)
        System.out.println(xc == z); // true  (z apunta al MISMO objeto que x)

        // SOLO aplica a la misma referencia
    }

}
