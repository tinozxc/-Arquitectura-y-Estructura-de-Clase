package Chapter2_java_Day_3_4.day4_Control_de_Flujo.Understanding_Advanced__Flow_Control;

public class Nested_Loops {

    public static void main(String[] args) {

        // ----- Ejemplo 1: loop dentro de otro loop (array bidimensional) -----
        // Un array bidimensional es un array que contiene otros arrays como miembros.
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int[] mySimpleArray : myComplexArray) {       // loop externo: recorre cada fila
            for (int i = 0; i < mySimpleArray.length; i++) { // loop interno: recorre cada columna
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
        // Salida:
        // 5    2    1    3
        // 3    9    8    9
        // 5    7    12   7

        System.out.println();

        // ----- Ejemplo 2: while que contiene un do-while (nested loop) -----
        int x = 10;
        while (x > 0) {
            do {
                x -= 2;  // 8  6  3
            } while (x > 5);
            x--;  // 8 6
            System.out.print(x + "\t");  // 7 5 3 2 0
        }
        System.out.println();
        // Salida: 3    0
    }

}
