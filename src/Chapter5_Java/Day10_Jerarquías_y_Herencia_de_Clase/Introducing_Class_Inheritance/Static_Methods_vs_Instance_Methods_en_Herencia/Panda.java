package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Static_Methods_vs_Instance_Methods_en_Herencia;

public class Panda {

    public static void eat() {  // Mismo metodo static en hijo = oculta
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        Panda.eat();  // "Panda bear is chewing"
    }

}
