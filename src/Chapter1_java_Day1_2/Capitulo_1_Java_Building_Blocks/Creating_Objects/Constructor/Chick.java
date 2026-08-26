package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Creating_Objects.Constructor;

// un objeto es la instancia de una clase
// un objeto solo , es una entidad que tiene atributos y metodos
public class Chick {
    int numEggs = 0; // initializa y da un valor a un intero
    String name;  // inicializa el valor a un dato String

    public void Chick() {} //no es un CONSTRUCTOR

    public Chick(){
        name = "Duke"; // initializa en constructor
    }



}
