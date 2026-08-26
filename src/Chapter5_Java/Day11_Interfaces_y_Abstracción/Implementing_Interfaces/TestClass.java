package Chapter5_Java.Day11_Interfaces_y_Abstracción.Implementing_Interfaces;

public class TestClass {

    public static void main(String[] args) {
        WalksOnTwoLegs example = new WalksOnTwoLegs();
  //falla razon no se puede instancear una interface directamente
    }
}
/*
public final interface WalksOnEightLegs { // DOES NOT COMPILE
}

 */
