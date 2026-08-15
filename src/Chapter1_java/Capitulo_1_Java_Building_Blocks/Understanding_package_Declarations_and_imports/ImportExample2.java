package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports;

import java.util.Random; // imports tell us where to find Randoms

public class ImportExample2 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));

    }
}
