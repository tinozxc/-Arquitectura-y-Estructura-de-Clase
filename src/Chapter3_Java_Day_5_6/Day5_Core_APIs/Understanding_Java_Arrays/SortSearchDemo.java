package Chapter3_Java_Day_5_6.Day5_Core_APIs.Understanding_Java_Arrays;

import java.util.Arrays;

// el sort se usa para ordenar un elemento ya sea de mayor o menor
public class SortSearchDemo {

    public static void main(String[] args) {
        // ---- sort() con int ----
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // 1 6 9
        }
        System.out.println();

        // ---- sort() con String: orden ALFABÉTICO, no numérico ----
        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String s : strings) { // enhanced for: no necesita índice
            System.out.print(s + " "); // 10 100 9  <- "1" ordena antes que "9"
        }
        System.out.println();

        // ---- binarySearch(): solo funciona bien en arrays YA ordenados ----
        int[] sorted = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(sorted, 2)); // 0
        System.out.println(Arrays.binarySearch(sorted, 4)); // 1
        System.out.println(Arrays.binarySearch(sorted, 1)); // -1
        System.out.println(Arrays.binarySearch(sorted, 3)); // -2
        System.out.println(Arrays.binarySearch(sorted, 9)); // -5

        // ---- binarySearch() en array NO ordenado: resultado impredecible ----
        int[] unsorted = {3, 2, 1};
        System.out.println(Arrays.binarySearch(unsorted, 2)); // resultado no garantizado
    }

}
