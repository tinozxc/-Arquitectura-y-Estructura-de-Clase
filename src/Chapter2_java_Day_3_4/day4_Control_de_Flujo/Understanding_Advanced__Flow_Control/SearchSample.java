package Chapter2_java_Day_3_4.day4_Control_de_Flujo.Understanding_Advanced__Flow_Control;

public class SearchSample {

    public static void main(String[] args) {

        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;   // termina AMBOS loops de una vez, ya que encontramos el valor
                }
            }
                // por ende x = 1 , j = 1
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: "
                    + "(" + positionX + "," + positionY + ")");
        }
        // Salida: Value 2 encontrado  at: (1,1)
    }

}
