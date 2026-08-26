package Chapter5_Java.Day11_Interfaces_y_Abstracción.Abstract_Methods_and_Multiple_Inheritance.Problemas_con_ParametroEntrada;

//El código no se compila, ya que la clase define dos métodos con el mismo nombre y
//los mismos parámetros de entrada
public class Bear implements Herbivore3, Omnivore3{

    //no existe ninguna implementación de la clase Bear que
    //haya heredado de Herbivore y Omnivore que el compilador aceptara.
    //ya que ambos tienen el mismo nombre con el mismo tipo de parametro (vacio)
    public int eatPlants() {
        System.out.println("Eating plants: 10");
        return 10;
    }

    public void eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants");
    }
}
