package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Understanding_Compiler_Enhancements;

public class ContructorNoCompilaEjemplos {

    /*

    // ===================== Ejemplo 2: Código que NO compila =====================

public class Mammal {
    // Mammal SOLO tiene un constructor con un argumento (int age).
    // Por lo tanto, Mammal NO tiene constructor sin argumentos.
    public Mammal(int age) {
    }
}

// X ERROR DE COMPILACIÓN
public class Elephant extends Mammal {
    // DOES NOT COMPILE
    // Elephant no define ningún constructor, así que Java intenta
    // insertar uno automático:
    //     public Elephant() { super(); }
    // Pero Mammal NO tiene un constructor sin argumentos (Mammal()),
    // solo tiene Mammal(int age).
    // Por lo tanto, ese super() automático falla y el código no compila.
}

java
// ===================== Ejemplo 3: Sigue sin compilar =====================

public class Mammal {
    public Mammal(int age) {
    }
}

public class Elephant extends Mammal {
    public Elephant() {
        // DOES NOT COMPILE
        // Aunque ahora SÍ definimos un constructor explícito en Elephant,
        // seguimos sin llamar a super(int) manualmente.
        // Java intenta insertar super() (sin argumentos) automáticamente
        // como primera línea, pero Mammal no tiene ese constructor.
    }
}

     */

}
