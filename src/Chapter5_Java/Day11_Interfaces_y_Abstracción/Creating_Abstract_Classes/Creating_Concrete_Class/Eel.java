package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Creating_Concrete_Class;

// trabajar con clases abstractas tienes que recordar que, por sí mismas,
//no se pueden instanciar y, por lo tanto, no hacen mucho más que definir variables
// estáticas y métodos

public class Eel {
        //main ,  método que Java ejecuta primero cuando inicias tu programa.
    public static void main(String[] args) {

        final Eel eel = new Eel(); // DOES NOT COMPILE , una clase abstrata
        //no se puede instanciar
    }

}
