package chapter4_Java_Day_7_8_9.day8_9_Constructores_Lambdas.Creating_Constructors;

//FinalFields de aqui viene
public class MouseHouse {

    // "final" sin valor asignado en la declaración.
    // Se le PERMITE quedar así porque se asignará más adelante,
    // pero DEBE recibir un valor antes de que termine el constructor.
    private final int volume;

    // "final" CON valor asignado directamente en la declaración.
    // Esta ya quedó inicializada aquí mismo, no se puede volver a tocar.
    private final String name = "The Mouse House";

    public MouseHouse(int length, int width, int height) {
        // Aquí asignamos el valor a "volume" DENTRO del constructor.
        // Esto es válido porque el constructor forma parte
        // del proceso de inicialización del objeto.
        volume = length * width * height;
    }

}

class FinalFields{

}