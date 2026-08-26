package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Creating_Objects.Order_of_Initialization;

//debes recordar lo siguiente:
//Los campos y los bloques de inicialización de instancias se ejecutan
// en el orden en que aparecen en el archivo
//----------------------------------------------------
//El constructor se ejecuta después de que se hayan ejecutado todos
// los campos y bloques de inicialización de instancias.

public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("Setting Field");
    }

    public Chick(){
        name = "Tiny";
        System.out.println("Setting constructor");
    }
     public static  void main(String[] args){
        Chick chick = new Chick();
         System.out.println(chick.name);
     }
}


//{System.out.printl(name); } // DOES NOT COMPILE fuera del la clase Chick no imprimira su variable
// private string name = "Fluffy"; fuera de la clase Chick no tiene valor ni variable
