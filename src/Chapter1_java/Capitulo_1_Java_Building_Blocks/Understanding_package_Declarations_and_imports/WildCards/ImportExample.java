package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.WildCards;

import java.util.*; // Imports java.util.Random among other things;

public class ImportExample {
    public static void main (String args[]){
        Random  r = new Random();
        System.out.println(r.nextInt(10));
    }
}
