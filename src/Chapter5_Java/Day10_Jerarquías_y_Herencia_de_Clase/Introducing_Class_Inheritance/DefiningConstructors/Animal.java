package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.DefiningConstructors;

// ===================== Ejemplo 1: super() y this() =====================

public class Animal {
    private int age;

    public Animal(int age) {
        // Llamada explícita al constructor de la clase padre (Object).
        // Esta línea es opcional aquí, porque Java la agregaría
        // automáticamente si no la escribiéramos, PERO al escribirla
        // manualmente, DEBE ser la primera línea del constructor.
        super();
        this.age = age;
    }
}