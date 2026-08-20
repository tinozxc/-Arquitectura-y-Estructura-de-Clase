package chapter4_Java.day8_Constructores_Lambdas.Creating_Constructors;

public class InitializationOrderSimple {

// ===== ORDEN DE INICIALIZACIÓN (Order of Initialization) =====
// Estas son las 4 reglas que HAY que memorizar:
// 1. Si hay superclase, se inicializa primero (lo veremos en el próximo capítulo).
//    Por ahora: "no hay superclase" y pasamos a la siguiente regla.
// 2. Declaraciones de variables ESTÁTICAS e inicializadores ESTÁTICOS,
//    en el orden en que aparecen en el archivo.
// 3. Declaraciones de variables de INSTANCIA e inicializadores de instancia,
//    en el orden en que aparecen en el archivo.
// 4. El CONSTRUCTOR.

    private String name = "Torchie";              // línea 2
    { System.out.println(name); }                 // línea 3 (inicializador de instancia)

    private static int COUNT = 0;                 // línea 4
    static { System.out.println(COUNT); }         // línea 5 (inicializador estático)
    static { COUNT += 10; System.out.println(COUNT); } // línea 6 (otro inicializador estático)

    public InitializationOrderSimple() {
        System.out.println("constructor");        // línea 7-9 (constructor)
    }
}

