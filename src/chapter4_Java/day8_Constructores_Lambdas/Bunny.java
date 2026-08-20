package chapter4_Java.day8_Constructores_Lambdas;

public class Bunny {
    private String color;
    private int height;
    private int length;
    private final String especie; // "final" = no se puede cambiar después de asignarse

    // ----- CONSTRUCTOR NORMAL (el patrón más común) -----
    public Bunny(String color) {
        this.color = color; // "this.color" = variable de instancia
        // "color" (derecha) = el parámetro que recibimos
        this.especie = "Conejo doméstico"; // los "final" deben asignarse en el constructor
    }

    // ----- CONSTRUCTOR SOBRECARGADO (overloading) -----
    // Mismo nombre de clase, pero distintos parámetros
    public Bunny(int length, int theHeight) {
        // ❌ ERROR COMÚN (al revés):
        // length = this.length;
        // Esto tomaría el valor de la variable de instancia (0, porque nunca se inicializó)
        // y se lo asignaría al PARÁMETRO. La variable de instancia se queda en 0 para siempre.

        // ✅ FORMA CORRECTA:
        this.length = length; // instancia = parámetro

        height = theHeight; // aquí NO hace falta "this" porque los nombres son distintos
        // (parámetro "theHeight" vs instancia "height", no hay ambigüedad)

        this.color = "blanco"; // válido usar "this" aunque no haya conflicto de nombres (redundante)
        this.especie = "Conejo doméstico";
    }

    // ----- CONSTRUCTOR SIN ARGUMENTOS (a veces llamado "constructor por defecto" cuando lo escribes tú) -----
    public Bunny() {
        // Si no escribes NINGÚN constructor, Java crea uno vacío automáticamente
        // (el "default constructor"), pero en cuanto escribes uno,
        // ese constructor automático YA NO se genera.
        this("Café"); // "this(...)" llama a OTRO constructor de la misma clase
        System.out.println("constructor sin argumentos");
    }

    public static void main(String[] args) {
        Bunny b1 = new Bunny(1, 2);
        System.out.println(b1.length + " " + b1.height + " " + b1.color);
        // Salida: 1 2 blanco

        Bunny b2 = new Bunny();
        System.out.println(b2.color); // Café (heredado del this("Café"))
    }
}