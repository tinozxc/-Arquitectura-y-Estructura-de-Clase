package Chapter1_java.Capitulo_1_Java_Building_Blocks.Creating_Objects.Constructor;

public class Chick {
    int numEggs = 0; // initialize on line
    String name;

    public void Chick() {} //NOT A CONSTRUCTOR

    public Chick(){
        name = "Duke"; // initialize in constructor
    }
}
