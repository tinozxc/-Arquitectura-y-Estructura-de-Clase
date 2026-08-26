package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Herencia;

import Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Animal;

// Lion extiende Animal explícitamente
public class Lion extends Animal {
    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }
}