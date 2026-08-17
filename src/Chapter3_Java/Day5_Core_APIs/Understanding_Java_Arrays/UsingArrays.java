package Chapter3_Java.Day5_Core_APIs.Understanding_Java_Arrays;

public class UsingArrays {

    public static void main(String[] args) {
        // ---- Acceso básico ----
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3 -> cantidad de elementos
        System.out.println(mammals[0]);      // monkey -> índice 0
        System.out.println(mammals[1]);      // chimp
        System.out.println(mammals[2]);      // donkey

        // ---- length cuenta SLOTS, no importa si están null ----
        String[] birds = new String[6];
        System.out.println(birds.length); // 6 -> aunque los 6 elementos sean null

        // ---- Loop típico para llenar un array ----
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5; // índices válidos: 0 a 9
        }
        System.out.println(numbers[0] + " " + numbers[9]); // 5 14

        // ---- Errores comunes: ArrayIndexOutOfBoundsException ----
        try {
            numbers[10] = 3; // índice 10 no existe (válidos: 0-9)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 1: índice 10 fuera de rango");
        }

        try {
            numbers[numbers.length] = 5; // length=10, pero el último índice válido es 9
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2: length es 1 más que el último índice válido");
        }

        try {
            for (int i = 0; i <= numbers.length; i++) { // <= en vez de < -> se pasa de largo
                numbers[i] = i + 5;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 3: el <= permite llegar hasta el índice 10, que no existe");
        }
    }

}
