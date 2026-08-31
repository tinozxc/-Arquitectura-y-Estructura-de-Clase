package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Overriding_vs_Hiding_Methods;

public class Marsupial {

    // Metodo static -- OCULTADO por el hijo
    public static boolean isBiped() {
        return false;
    }

    // Metodo de instancia que llama al metodo static
    public void getMarsupialDescription() {
        // Este metodo pertenece a Marsupial
        // Cuando llama a isBiped(), usa la version de Marsupial (false)
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

}
