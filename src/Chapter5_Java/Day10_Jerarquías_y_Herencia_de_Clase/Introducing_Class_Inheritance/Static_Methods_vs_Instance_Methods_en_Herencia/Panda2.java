package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Static_Methods_vs_Instance_Methods_en_Herencia;

public class Panda2 {

    // ERROR, static NO puede sobrescribir instance
    public void sneeze() {  // NO COMPILA falla
        System.out.println("Panda bear sneezes quietly");
    }

    // ERROR. instance NO puede sobrescribir static en el metodo
    public static void hibernate() {  // NO COMPILA falla
        System.out.println("Panda bear is going to sleep");
    }

}
