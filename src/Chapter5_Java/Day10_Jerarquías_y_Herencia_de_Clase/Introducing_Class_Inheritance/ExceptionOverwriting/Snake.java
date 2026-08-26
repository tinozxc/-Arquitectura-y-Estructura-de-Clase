package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.ExceptionOverwriting;

public class Snake extends Reptile {

    // METODO 1- SOBRESCRITO , Elimina la excepcion
    // Regla: El hijo puede eliminar excepciones del padre
    protected boolean hasLegs() {
        return false;  //  no lanza excepcion
        //
    }

    // METODO 2- SOBRESCRITO ,Cambia Exception por InsufficientDataException
    // Regla: El hijo puede lanzar una excepcion MAS ESPECIFICA , subclase
    protected double getWeight() throws InsufficientDataException {
        return 2;  //  InsufficientDataException es subclase de Exception
    }


}