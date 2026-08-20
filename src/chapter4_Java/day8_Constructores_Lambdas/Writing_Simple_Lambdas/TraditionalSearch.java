package chapter4_Java.day8_Constructores_Lambdas.Writing_Simple_Lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // lista de animales
        animals.add(new Animal("pez", false, true));
        animals.add(new Animal("canguro", true, false));
        animals.add(new Animal("conejo", true, false));
        animals.add(new Animal("tortuga", false, true));

        // le pasamos una INSTANCIA de la clase que hace la comprobación
        print(animals, new CheckIfHopper());
    }

    // método GENERAL: puede comprobar CUALQUIER característica,
    // no necesita saber qué se está buscando específicamente
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // la comprobación general
                System.out.print(animal + " ");
        }
        System.out.println();
    }

}
