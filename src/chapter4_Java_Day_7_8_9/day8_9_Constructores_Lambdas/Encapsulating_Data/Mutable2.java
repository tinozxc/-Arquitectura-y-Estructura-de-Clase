package chapter4_Java_Day_7_8_9.day8_9_Constructores_Lambdas.Encapsulating_Data;

public class Mutable2 {

    private StringBuilder builder;

    public Mutable2(StringBuilder b) {
        builder = new StringBuilder(b);  // COPIA DEFENSIVA en constructor evitamos referenciar
        //al mismo puntero o valor
    }

    public String getValue() {
        return builder.toString();  // DEVUELVE STRING (INMUTABLE) objeto
    }

}
