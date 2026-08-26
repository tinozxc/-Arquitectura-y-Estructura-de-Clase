package Chapter3_Java_Day_5_6.Day6_ArrayList_Fechas.Understanding_an_ArrayList;

public class UsingAMultidimensionalArray {

    public static void main(String[] args) {

        int[][] twoD = new int[3][2];   // array 3x2, lleno de 0s por defecto

        //for tradicional   usamo i para la columna e  j para la fila
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }

        /*
            Bucle externo (i): recorre el array "externo" — twoD.length es 3
            (cuántos sub-arrays hay).
            Bucle interno (j): recorre cada sub-array individual — twoD[i].length es 2
            (cuántos elementos tiene esa fila específica).
         */

        //for-each (enhanced for) , una forma mas corta y facil

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

    }
}
