package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Overloading_Methods.primitives;

public class TooManyConversions {
    public static void play(Long l) { } // llama a este metodo play(4L)
    public static void play(Long... l) { }

    public static void main(String[] args) {
        //play(4);    // DOES NOT COMPILE ,Regla de Java: solo permite UNA conversión, nunca dos seguidas.
        play(4L);   // calls the Long version
        //Para llegar a Long, solo necesita una conversión: autoboxing directo long → Long.
        //Como es una sola conversión, es válido , si son 2 no compilaria
    }
}
