package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.hiding_variables;

public class Rodent {

    protected int tailLength = 4;  // Variable en la clase padre

    public void getRodentDetails() {
        // Este metodo pertenece a Rodent
        // Usa la variable de Rodent (tailLength = 4)
        System.out.println("[parentTail=" + tailLength + "]");
    }


}
