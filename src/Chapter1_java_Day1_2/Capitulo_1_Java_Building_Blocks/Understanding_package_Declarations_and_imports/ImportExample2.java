package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports;

import java.util.Random; // importa y le dice donde encontrar Random

public class ImportExample2 {
    public static void main(String[] args) {
        Random r = new Random(); // crea una instancia de randow funciona porque el paquete
        // esta importado
        System.out.println(r.nextInt(10)); // imprime un numero del 1 al 10

    }
}
