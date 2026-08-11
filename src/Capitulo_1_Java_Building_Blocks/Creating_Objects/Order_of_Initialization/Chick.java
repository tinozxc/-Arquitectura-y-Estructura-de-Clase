package Capitulo_1_Java_Building_Blocks.Creating_Objects.Order_of_Initialization;

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
