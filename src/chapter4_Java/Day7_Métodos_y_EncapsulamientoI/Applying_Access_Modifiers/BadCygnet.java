package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Applying_Access_Modifiers;

public class BadCygnet {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        // duck.quack();                    // NO COMPILA: default, otro paquete
        // System.out.println(duck.noise);  // NO COMPILA: default, otro paquete
    }

}
