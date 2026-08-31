package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.WildCards;

/*
 las clases en un mismo paquete pueden ser importadas juntos , usar un corto importe en todas
 las clases en un paquete *
 */

import java.util.*; // Imports java.util.Random y todos lo demas antes , uso del *

public class ImportExample {
    public static void main (String args[]){
        Random  r = new Random(); // crea una instancia del Random
        System.out.println(r.nextInt(10)); // imprimte del 1 al 9
    }
}
