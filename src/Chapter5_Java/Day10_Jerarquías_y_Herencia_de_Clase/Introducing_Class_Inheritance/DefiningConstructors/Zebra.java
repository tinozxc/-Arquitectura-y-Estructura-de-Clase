package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.DefiningConstructors;

public class Zebra extends Animal {

    // Constructor con un parámetro: llama al constructor de Animal
    // que recibe un "age", usando super(age)
    public Zebra(int age) {
        super(age); // Debe ser la PRIMERA línea del constructor
    }

    // Constructor sin parámetros: en vez de llamar a super(),
    // llama a OTRO constructor de la MISMA clase (Zebra) usando this(4)
    public Zebra() {
        this(4); // Llama a Zebra(int age) con el valor 4
    }
}
