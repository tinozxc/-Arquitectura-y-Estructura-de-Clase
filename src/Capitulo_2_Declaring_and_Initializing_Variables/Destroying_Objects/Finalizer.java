package Capitulo_2_Declaring_and_Initializing_Variables.Destroying_Objects;

public class Finalizer {

    protected  void finalize(){
        System.out.println("Calling Finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}
