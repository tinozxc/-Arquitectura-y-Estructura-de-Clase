package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Redundant_Imports;

import java.util.Random;
import java.lang.*;

public class ImportExampleRedundant {

    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(10)); // si compila
    }

}
