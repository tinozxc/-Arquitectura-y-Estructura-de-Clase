package Chapter3_Java.Day5_Core_APIs.Understanding_Java_Arrays;

public class CreatingAnArrayOfPrimitives {

    public static void main(String[] args) {
        // ---- Forma 1: tamaño fijo, valores por defecto (0 para int) ----
        int[] numbers1 = new int[3];
        System.out.println(numbers1[0] + " " + numbers1[1] + " " + numbers1[2]); // 0 0 0

        // ---- Forma 2: especificando valores iniciales (con "new int[]") ----
        int[] numbers2 = new int[] {42, 55, 99};
        System.out.println(numbers2[0] + " " + numbers2[1] + " " + numbers2[2]); // 42 55 99

        // ---- Forma 3: array anónimo, más corta (Java infiere tipo y tamaño) ----
        int[] numbers3 = {42, 55, 99};
        System.out.println(numbers3[0] + " " + numbers3[1] + " " + numbers3[2]); // 42 55 99

        // ---- Los [] pueden ir antes o después del nombre, con o sin espacio: son EQUIVALENTES ----
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        // ---- Declaraciones múltiples: OJO dónde ponés los corchetes ----
        int[] ids1, types1;      // ambos son int[]  (corchete pegado al TIPO)
        int idsB[], typesB;      // idsB es int[], typesB es int NORMAL (corchete pegado al NOMBRE)
        idsB = new int[]{1, 2};
        typesB = 5;
        System.out.println(idsB[1] + " " + typesB); // 2 5
    }

}
