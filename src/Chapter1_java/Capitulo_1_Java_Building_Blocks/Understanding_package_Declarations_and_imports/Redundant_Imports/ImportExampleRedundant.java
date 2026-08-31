package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Redundant_Imports;

// cuantos importes para que algo sea redundante en total son 3
// lang es importado automaticamente por java lo cual es innecesario ponerlo
import java.lang.System;
import java.lang.*;
import java.util.Random;

public class ImportExampleRedundant {

    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(10)); // si compila imprime del 0 al 9
    }

}
