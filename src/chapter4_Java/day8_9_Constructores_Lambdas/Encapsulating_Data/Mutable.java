package chapter4_Java.day8_9_Constructores_Lambdas.Encapsulating_Data;

public class Mutable {

    private StringBuilder builder;

    public Mutable(StringBuilder b) {
        builder = new StringBuilder(b);  // COPIA DEFENSIVA en constructor se crea otro puntero
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);  // COPIA DEFENSIVA en getter igualmente aqui
    }

}
