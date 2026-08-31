package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Defining_an_Abstract_Class;

public class HumpbackWhale extends  Whale {

    //la subclase no puede reducir la visibilidad del método padre, sing().


    private void sing() { // DOES NOT COMPILE esta declarado como protegido
        //en la clase padre
        System.out.println("Humpback whale is singing");
    }

}
