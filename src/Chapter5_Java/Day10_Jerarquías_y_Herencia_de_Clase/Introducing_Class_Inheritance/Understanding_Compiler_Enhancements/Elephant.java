package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Understanding_Compiler_Enhancements;

public class Elephant extends  Mammal {

    public Elephant() {
        //  Ahora SÍ compila, porque llamamos EXPLÍCITAMENTE
        // al constructor de Mammal que recibe un int,
        // pasando un valor fijo (10) como argumento.

        super(10);
    }

    public static void main(String[] args) {
        Elephant e = new Elephant(); // Funciona correctamente
        System.out.println("Elephant creado correctamente.");
    }

}
