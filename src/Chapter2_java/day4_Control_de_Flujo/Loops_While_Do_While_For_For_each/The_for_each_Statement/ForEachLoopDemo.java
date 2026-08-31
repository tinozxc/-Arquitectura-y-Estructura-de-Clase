package Chapter2_java.day4_Control_de_Flujo.Loops_While_Do_While_For_For_each.The_for_each_Statement;

public class ForEachLoopDemo {

    public static void main(String[] args) {

        // ----- Ejemplo 1: for-each sobre un array -----
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println();
        // Salida: Lisa, Kevin, Roger,

        // ----- Ejemplo 2: for-each sobre un List<String> -----
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        // Salida: Lisa, Kevin, Roger,

        // ----- !!!Casos que NO compilan  -----

        // 1) El lado derecho debe ser un array o implementar Iterable.
        // String namesStr = "Lisa";
        // for (String name : namesStr) {   // NO COMPILA
        //     System.out.print(name + " ");
        // }

        // 2) El tipo del lado izquierdo debe coincidir con el tipo del array/coleccion.
        // String[] namesArr = new String[3];
        // for (int name : namesArr) {      // NO COMPILA (String != int)
        //     System.out.print(name + " ");
        // }

        // ----- Equivalencia: for-each se convierte a for tradicional -----

        // for-each con array:
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println();
        // Es equivalente a:
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.print(name + ", ");
        }
        System.out.println();

        // for-each con List (usa Iterator internamente):
        java.util.List<Integer> nums = new java.util.ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        for (int value : nums) {
            System.out.print(value + ", ");
        }
        System.out.println();
        // Es equivalente a:
        for (java.util.Iterator<Integer> i = nums.iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        // ----- Evitar la coma final usando un for tradicional -----
        java.util.List<String> names2 = new java.util.ArrayList<String>();
        names2.add("Lisa");
        names2.add("Kevin");
        names2.add("Roger");
        for (int i = 0; i < names2.size(); i++) {
            String name = names2.get(i);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
        System.out.println();
        // Salida: Lisa, Kevin, Roger  (sin coma al final)

        // ----- Cuando se necesita comparar elementos entre iteraciones -----
        // Aquí SÍ conviene un for tradicional, ya que necesitamos el índice
        // para acceder al elemento anterior (values[i-1]).
        int[] valuesArr = new int[3];
        valuesArr[0] = 10;
        valuesArr[1] = 5;
        valuesArr[2] = 15;
        for (int i = 1; i < valuesArr.length; i++) {
            System.out.print((valuesArr[i] - valuesArr[i - 1]) + ", ");
        }
        System.out.println();
        // Salida: -5, 10,
    }
}
