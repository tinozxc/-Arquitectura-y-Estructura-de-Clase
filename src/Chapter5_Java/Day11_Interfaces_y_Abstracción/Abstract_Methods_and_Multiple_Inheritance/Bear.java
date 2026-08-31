package Chapter5_Java.Day11_Interfaces_y_Abstracción.Abstract_Methods_and_Multiple_Inheritance;

// las firmas de los dos métodos de la interfaz eatPlants() son compatibles
// sin problemas de implementacion de los metodos
public class Bear implements  Herbivore , Omnivore {

    //herbivoro interfaz y de Omnivoro
    public void eatPlants() {
        System.out.println("Eating meat");
    }

    //omnivoro interfaz
    public void eatMeat() {
        System.out.println("Eating plants");
    }
}
