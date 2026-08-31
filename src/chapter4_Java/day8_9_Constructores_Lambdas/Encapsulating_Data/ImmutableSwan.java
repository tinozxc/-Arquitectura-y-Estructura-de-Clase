package chapter4_Java.day8_9_Constructores_Lambdas.Encapsulating_Data;

public class ImmutableSwan {
    private int numberEggs;

    // El valor inicial se define en el CONSTRUCTOR,
    // no hay ningún setter para cambiarlo después.
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    // Solo hay GETTER, no hay setter.
    public int getNumberEggs() {
        return numberEggs;
    }


}
//referencia al nombre de la clase arriba
class CreatingImmutableClasses{}