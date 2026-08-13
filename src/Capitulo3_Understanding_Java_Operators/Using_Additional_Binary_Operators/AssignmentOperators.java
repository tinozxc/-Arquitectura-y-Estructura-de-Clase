package Capitulo3_Understanding_Java_Operators.Using_Additional_Binary_Operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        //asignacion correcta de acuerdo al valor
        int x = 1;

        //Java promociona automáticamente de tipos pequeños a grandes,
        // pero da error si intentas asignar de un tipo grande a uno
        // pequeño sin casting explícito.

        /*
        int x = 1.0;                        // NO COMPILA (1.0 es double, no int)
        short y = 1921222;                  // NO COMPILA (excede el rango de short)
        int z = 9f;                         // NO COMPILA (9f es float, no int)
        long t = 192301398193810323;        // NO COMPILA (falta sufijo L, se interpreta como int)


         */
    }
}
