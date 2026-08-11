package Capitulo_1_Java_Building_Blocks.Creating_Objects.Reading_and_Writing_Object_Fields;

public class Swan {
    int numEggs; // instance variable;
    public static void main(String[] args){
        Swan mother = new Swan();
        mother.numEggs = 1; // set variable
        System.out.println(mother.numEggs);
    }
}
