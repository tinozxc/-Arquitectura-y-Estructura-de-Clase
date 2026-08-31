package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Overloading_vsOverriding;

public class Bird {


    public void fly() {
        System.out.println("Bird is flying");
    }

    //  ERROR: retorno diferente
    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");

    }
}