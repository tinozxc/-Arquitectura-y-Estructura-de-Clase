package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Applying_Access_Modifiers;

public class FatherDuck {

    private String noise = "quack"; // atributo privado acceder por get o set

    private void quack() {
        System.out.println(noise); // OK: mismo clase
    }

    void makeNoise() {
        quack(); // OK: mismo clase
    }
}
