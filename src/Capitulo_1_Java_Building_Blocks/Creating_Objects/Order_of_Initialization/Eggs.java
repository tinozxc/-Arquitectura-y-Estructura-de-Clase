package Capitulo_1_Java_Building_Blocks.Creating_Objects.Order_of_Initialization;

public class Eggs {

    public Eggs(){
        number = 5;
    }

    public static void main(String[] args){
        Eggs eggs = new Eggs();
        System.out.println(eggs.number);
    }
    private int number = 3;
    {number = 4;}
}
