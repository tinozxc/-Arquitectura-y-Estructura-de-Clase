package chapter4_Java.day8_Constructores_Lambdas.Predicates;

import chapter4_Java.day8_Constructores_Lambdas.Writing_Simple_Lambdas.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("pez", false, true));

        print(animals,a -> a.canHop());
    }

    // Ya no usamos nuestra interfaz CheckTrait, ahora usamos
    // Predicate<Animal>, que Java ya nos da hecho.
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
