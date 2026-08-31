package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Applying_Access_Modifiers;

public class GoodDuckling {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack();                    // OK: mismo paquete pond.duck
        System.out.println(duck.noise); // OK: mismo paquete sin problemas al llamarlo
    }

}
