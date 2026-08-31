package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Applying_Access_Modifiers;

public class BadDuckling {

    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        // duck.quack();                    // NO COMPILA: quack() es private de FatherDuck
        // System.out.println(duck.noise);  // NO COMPILA: noise es private de FatherDuck
    }

}
