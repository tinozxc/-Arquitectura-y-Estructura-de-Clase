package chapter4_Java.day8_Constructores_Lambdas.Writing_Simple_Lambdas;

public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }

}
