package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Passing_Data_Among_Methods;

public class ReturningValues {

    public static void main(String[] args) {
        int number = 1; // 1
        String letters = "abc"; // abc
        number(number); // 1  no se guarda el valor por eso se mantiene
        letters = letters(letters); // abcd
        System.out.println(number + letters); // 1abcd
    }
    public static int number(int number) {
        number++;  // aqui se suma , mas no se guarda el valor dado
        return number;
    }
    public static String letters(String letters) {
        letters += "d";  // en cambio aqui si se suma esa letra y se guarda
        return letters;
    }

}
