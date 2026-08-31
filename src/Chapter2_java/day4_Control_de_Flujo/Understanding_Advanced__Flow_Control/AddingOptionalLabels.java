package Chapter2_java.day4_Control_de_Flujo.Understanding_Advanced__Flow_Control;

public class AddingOptionalLabels {

    public static void main(String[] args) {

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        //Una etiqueta es un indicador opcional que apunta al inicio de una
        //sentencia y que permite que el flujo de la aplicación salte a ella o
        // se salga de ella. Se trata de una sola palabra
        //precedida de dos puntos (:).

        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                if (mySimpleArray[i] > 5) {
                    continue OUTER_LOOP;
                }
                System.out.print(mySimpleArray[i] + "\t");
            }
        }
        System.out.println();
        // Salida: 5    2    1    3    3    5
    }
}
