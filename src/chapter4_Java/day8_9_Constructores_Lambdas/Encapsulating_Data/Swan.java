package chapter4_Java.day8_9_Constructores_Lambdas.Encapsulating_Data;

// VERSIÓN ENCAPSULADA (buena práctica):

public class Swan {
    private int numberEggs; // línea 2: ahora es PRIVADA

    // ----- GETTER (método accesor) -----
    // Permite LEER el valor desde fuera de la clase
    public int getNumberEggs() {
        return numberEggs;
    }

    // ----- SETTER (método mutador) -----
    // Permite MODIFICAR el valor, pero de forma controlada
    public void setNumberEggs(int numberEggs) {
        if (numberEggs >= 0) // "guard condition" = condición de protección
            this.numberEggs = numberEggs;
        // "this.numberEggs" = variable de instancia
        // "numberEggs" (parámetro) = el valor que nos pasaron
    }


}
