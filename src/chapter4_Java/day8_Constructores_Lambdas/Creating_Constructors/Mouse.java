package chapter4_Java.day8_Constructores_Lambdas.Creating_Constructors;

public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    // Constructor con 1 parámetro
    public Mouse(int weight) {
        this(weight, 16); // llama al constructor de 2 parámetros
    }

    // Constructor con 2 parámetros
    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // llama al constructor de 3 parámetros
    }

    // Constructor con 3 parámetros (el que realmente hace el trabajo)
    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print(); // Imprime: 15 16 6
    }
}
