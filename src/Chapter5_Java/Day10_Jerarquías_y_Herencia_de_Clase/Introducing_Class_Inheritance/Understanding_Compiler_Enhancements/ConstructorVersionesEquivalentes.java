package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Understanding_Compiler_Enhancements;

public class ConstructorVersionesEquivalentes {

    /*

    // ===================== Ejemplo 1: Tres versiones EQUIVALENTES =====================

// Versión 1: Sin ningún constructor definido
public class Donkey {
}

// Versión 2: Constructor vacío sin argumentos, sin llamada explícita a super()
public class Donkey {
    public Donkey() {
    }
}

// Versión 3: Constructor vacío CON llamada explícita a super()
public class Donkey {
    public Donkey() {
        super();
    }
}

// Las 3 versiones son EXACTAMENTE equivalentes.
// El compilador de Java SIEMPRE convierte las versiones 1 y 2
// en la versión 3 automáticamente, porque:
//   - Si no hay constructor, Java crea uno vacío sin argumentos
//   - Si el constructor no empieza con this() ni super(),
//     Java inserta super() sin argumentos como primera línea

     */

}
