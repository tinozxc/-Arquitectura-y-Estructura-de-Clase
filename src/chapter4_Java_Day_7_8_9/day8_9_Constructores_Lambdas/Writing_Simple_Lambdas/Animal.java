package chapter4_Java_Day_7_8_9.day8_9_Constructores_Lambdas.Writing_Simple_Lambdas;

//  INTRODUCCIÓN A LAMBDAS
// Objetivo: imprimir todos los animales de una lista según cierto criterio.
// Primero lo hacemos SIN lambdas, para entender por qué son útiles.

// ----- Clase Animal -----
public class Animal {
    private String species;   // especie
    private boolean canHop;   // puede saltar
    private boolean canSwim;  // puede nadar

    //constructor para inicializar
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
 //metodos
    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species; // para poder identificar fácilmente al animal al imprimirlo
    }
}
