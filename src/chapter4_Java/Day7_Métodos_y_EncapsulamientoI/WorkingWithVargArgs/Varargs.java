package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.WorkingWithVargArgs;

public class Varargs {

    //Un parámetro vararg
    //debe ser el último elemento de la lista de parámetros de un
    // mét0do. Esto implica que solo se permite
    //un parámetro vararg por mét0do.
    public static void walk1(int... nums) { }               // OK
    public static void walk2(int start, int... nums) { }     // OK
    // public static void walk3(int... nums, int start) {}    // NO COMPILA: vararg no está al final
    // public static void walk4(int... start, int... nums){}  // NO COMPILA: solo se permite UN vararg

    // ---- Llamadas: array, valores sueltos, o nada ----
    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    // ---- Acceso por índice, igual que un array normal ----
    public static void run(int... nums) {
        System.out.println(nums[1]);
    }

    public static void main(String[] args) {
        walk(1);                       // 0 -> Java crea array vacío
        walk(1, 2);                    // 1 -> un valor suelto -> array de tamaño 1
        walk(1, 2, 3);                 // 2 -> dos valores sueltos -> array de tamaño 2
        walk(1, new int[]{4, 5});      // 2 -> se pasa el array directamente

        try {
            walk(1, null);              // null explícito: NullPointerException al leer .length
        } catch (NullPointerException e) {
            System.out.println("NullPointerException al pasar null explícito");
        }

        run(11, 22); // 22 -> índice 1 del array {11, 22}
    }

}
