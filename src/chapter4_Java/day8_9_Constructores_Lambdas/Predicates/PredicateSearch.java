package chapter4_Java.day8_9_Constructores_Lambdas.Predicates;

import chapter4_Java.day8_9_Constructores_Lambdas.Writing_Simple_Lambdas.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//un predicate es una interfaz funcional que recibe un valor y devuelve un boolean
public class PredicateSearch {
    public static void main(String[] args) {
        //declaramos una lista de arreglos
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("pez", false, true));

        print(animals,a -> a.canHop());  // funciona lambda
    }

    // Ya no usamos nuestra interfaz CheckTrait, ahora usamos
    // Predicate<Animal>, que Java ya nos da hecho.
    //en ese Predicate tendra metodos ya definidos que podemos usar
    // siempre dando un booleano
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
