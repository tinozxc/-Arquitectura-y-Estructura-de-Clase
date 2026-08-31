package Chapter3_Java.Day5_Core_APIs.Understanding_Java_Arrays;

public class MultiArrayDemo {
    public static void main(String[] args) {
        // ---- Declaraciones equivalentes de array 2D ----
        int[][] vars1;   // 2D
        int vars2[][];   // 2D (mismo resultado)
        int[] vars3[];   // 2D (mezcla rara, sigue siendo 2D)

        // ---- OJO: en una misma línea, cada variable puede tener DISTINTA dimensión ----
        int[] vars4[], space[][]; // vars4 = 2D | space = 3D

        // ---- Array 2D con tamaño fijo ----
        String[][] rectangle = new String[3][2]; // 3 filas, 2 columnas cada una
        rectangle[0][1] = "set";
        System.out.println(rectangle[0][1]); // set
        System.out.println(rectangle[0][0]); // null -> resto vacío

        // ---- Array 2D asimétrico: cada fila con distinto tamaño ----
        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};
        System.out.println(differentSize[0].length); // 2
        System.out.println(differentSize[1].length); // 1
        System.out.println(differentSize[2].length); // 3

        // ---- Otra forma de crear asimetría: definir filas por separado ----
        int[][] argsArr = new int[4][]; // 4 filas, sin columnas definidas aún
        argsArr[0] = new int[5];
        argsArr[1] = new int[3];
        System.out.println(argsArr[0].length); // 5
        System.out.println(argsArr[1].length); // 3
        System.out.println(argsArr[2]);         // null -> nunca se inicializó
    }
}
