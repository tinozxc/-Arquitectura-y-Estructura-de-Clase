package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Static_and_Methods;

public class Koala1 {
    public static int count = 0; // static variable es global

    public static void main(String[] args) { // static method no no se necesita instacia
        System.out.println(count);
    }
}
