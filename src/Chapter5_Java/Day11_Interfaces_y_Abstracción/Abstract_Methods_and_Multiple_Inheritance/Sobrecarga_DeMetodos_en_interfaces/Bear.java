package Chapter5_Java.Day11_Interfaces_y_Abstracción.Abstract_Methods_and_Multiple_Inheritance.Sobrecarga_DeMetodos_en_interfaces;
//si los dos métodos tienen firmas diferentes ademas
// los parámetros de entrada son diferentes, no hay conflicto porque se considera una
//sobrecarga de métodos
public class Bear implements Herbivore1 , Omnivore1{

    //ambos metodos son iguales pero los parametros son diferentes
    // simplemente ocurre la sobrecarga de metodos

        //implementa de Herbivore1
    public int eatPlants(int quantity) {

        System.out.println("Eating plants: "+quantity); //imprimimos una respuesta
        return quantity;
    }

    //implementa de Omnivore1
    public void eatPlants() {
        System.out.println("Eating plants"); //imprimimos una respuesta
    }
}
