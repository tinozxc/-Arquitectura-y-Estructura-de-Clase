package chapter4_Java.day8_9_Constructores_Lambdas.Encapsulating_Data;

public class NotImmutable {

    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;  // PELIGRO: referencia directa al objeto original
    }

    public StringBuilder getBuilder() {
        return builder;  // PELIGRO: devuelve la referencia interna
    }

}


