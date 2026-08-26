package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Herencia;

// AUNQUE Lion no escribe "extends java.lang.Object" en ningún lado,
// Lion TAMBIÉN hereda de Object, porque:
//   Lion extends Animal
//   Animal extends java.lang.Object (implícito)
// Por lo tanto: Lion -> Animal -> Object

public class TestJerarquia {
    public static void main(String[] args) {
        Lion lion = new Lion();

        // Todas las clases heredan de Object, por eso Lion también tiene
        // métodos como toString(), equals(), hashCode(), etc., aunque
        // nunca los hayamos definido nosotros mismos.
        System.out.println(lion.toString()); // Método heredado de Object

        // Podemos comprobar la jerarquía de clases en tiempo de ejecución:
        Class<?> clase = lion.getClass();
        while (clase != null) {
            System.out.println(clase.getName());
            clase = clase.getSuperclass();
        }
        // Esto imprimirá:
        // Lion
        // Animal
        // java.lang.Object
    }
}
