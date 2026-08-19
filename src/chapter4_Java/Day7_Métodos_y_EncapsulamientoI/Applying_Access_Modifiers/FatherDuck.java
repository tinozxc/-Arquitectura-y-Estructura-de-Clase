package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Applying_Access_Modifiers;

public class FatherDuck {

    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // OK: mismo clase
    }

    void makeNoise() {
        quack(); // OK: mismo clase
    }
}
