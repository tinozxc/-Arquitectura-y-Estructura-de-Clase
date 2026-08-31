package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.ExceptionOverwriting;

public class Reptile {

    // metodo 1- Lanza InsufficientDataException
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    // metodo 2- Lanza Exception clase padre de InsufficientDataException
    protected double getWeight() throws Exception {
        return 2;
    }

}
