package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.CallingConstructor;

// constructor padre siempre se ejecuta antes que el constructor hijo.
class Primate {
    public Primate() {
        System.out.println("Primate");
    }
    //constructor , imprime Primate
}
// CONSTRUCTOR HIJO (hereda de Primate)
class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }  // constuctor imprime Ape
}

// CONSTRUCTOR NIETO (hereda de Ape)
public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();  // resultado Primate , Ape
    }
    // 1. Primero se ejecuta Primate() → imprime "Primate"
    // 2. Luego se ejecuta Ape() → imprime "Ape"
    // 3. Finalmente se ejecuta Chimpanzee() → (no tiene print, pero existe)
    // Resultado final: "Primate" y luego "Ape"
    //siempre el padre primero

}
