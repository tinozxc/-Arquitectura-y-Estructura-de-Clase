package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance;

public class Lion extends Animal {

    private void roar() {
        //  Esto SÍ compila, porque getAge() es público en Animal,
        // por lo tanto es accesible desde la subclase Lion.
        System.out.println("The " + getAge() + " year old lion says: Roar!");


        //  Esto NO compilaría, porque "age" es privado en Animal.
        // Un atributo privado solo es visible dentro de la clase donde fue declarado,
        // ni siquiera las subclases pueden acceder a él directamente.
        // System.out.println("The " + age + " year old lion says: Roar!"); // ERROR

    }

    // Método main de prueba para ver el resultado
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setAge(5);   // Usamos el setter heredado de Animal
        lion.roar();      // Llama al método roar() que usa getAge()
    }
}
