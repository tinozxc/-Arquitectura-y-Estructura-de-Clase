package chapter4_Java.day8_Constructores_Lambdas.Creating_Constructors;

// ===== CONSTRUCTOR POR DEFECTO (Default Constructor) =====

class Rabbit1 {
    // No escribimos ningún constructor.
    // Java genera automáticamente uno vacío durante la COMPILACIÓN
    // (no aparece en el archivo .java, solo en el .class)
    // Equivale a: public Rabbit1() {}
}

class Rabbit2 {
    // Constructor SIN parámetros escrito a mano.
    // Ya que hay un constructor definido, Java NO genera el default.
    public Rabbit2() {
    }
}

class Rabbit3 {
    // Constructor CON parámetro.
    // Al tener un constructor propio, Java tampoco genera el default.
    public Rabbit3(boolean b) {
    }
}

class Rabbit4 {
    // Constructor PRIVADO.
    // Sigue contando como "constructor definido", así que Java
    // NO genera el constructor por defecto.
    // Además, al ser privado, ¡otras clases no pueden usarlo!
    private Rabbit4() {
    }
}

public class RabbitsMultiply {
    public static void main(String[] args) {
        Rabbit1 r1 = new Rabbit1();      // ✅ Llama al constructor generado por Java (default)
        Rabbit2 r2 = new Rabbit2();      // ✅ Llama al constructor escrito a mano (sin argumentos)
        Rabbit3 r3 = new Rabbit3(true);  // ✅ Llama al constructor con parámetro boolean

       // Rabbit4 r4 = new Rabbit4();      // ❌ NO COMPILA
        // Motivo: el constructor de Rabbit4 es "private",
        // por lo tanto otras clases (como esta) no pueden llamarlo.
    }
}