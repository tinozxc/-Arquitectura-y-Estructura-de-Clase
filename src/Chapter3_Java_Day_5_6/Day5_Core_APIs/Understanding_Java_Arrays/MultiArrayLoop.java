package Chapter3_Java_Day_5_6.Day5_Core_APIs.Understanding_Java_Arrays;

public class MultiArrayLoop {

    public static void main(String[] args) {
        int[][] twoD = new int[3][2]; // 3 filas x 2 columnas, todo en 0 (default de int)

        // ---- Versión con for tradicional ----
        for (int i = 0; i < twoD.length; i++) {        // recorre las filas
            for (int j = 0; j < twoD[i].length; j++) {   // recorre las columnas de esa fila
                System.out.print(twoD[i][j] + " ");        // imprime cada elemento
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        System.out.println("---");

        // ---- Versión con enhanced for (más legible) ----
        for (int[] inner : twoD) {   // cada "inner" es una fila (un int[])
            for (int num : inner) {   // cada "num" es un elemento dentro de esa fila
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
