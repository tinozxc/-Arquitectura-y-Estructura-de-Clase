package Chapter1_java.Capitulo_1_Java_Building_Blocks.Creating_Objects.Reading_and_Writing_Object_Fields;

//Es posible leer y escribir variables de instancia directamente
// desde quien realiza la llamada
public class Swan {
    int numEggs; // instance variable; por defecto java les da un valor

    public static void main(String[] args){
        Swan mother = new Swan();
        mother.numEggs = 1; // establece variable un valor
        System.out.println(mother.numEggs); // lee variable
    }
}
