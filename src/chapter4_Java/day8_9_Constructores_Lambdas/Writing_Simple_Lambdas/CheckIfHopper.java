package chapter4_Java.day8_9_Constructores_Lambdas.Writing_Simple_Lambdas;

//clase que implementa los metodos de la interfaz
public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }

}
