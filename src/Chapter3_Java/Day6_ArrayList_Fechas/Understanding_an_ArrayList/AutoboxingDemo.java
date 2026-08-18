package Chapter3_Java.Day6_ArrayList_Fechas.Understanding_an_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase de demostración que muestra los conceptos de:
 * - Autoboxing y unboxing
 * - Conversión entre arrays y Lists
 * - Ordenamiento de collections
 * - Casos especiales y trampas comunes
 */
public class AutoboxingDemo {

    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE AUTOBOXING ===");
        demostrarAutoboxing();

        System.out.println("\n=== PELIGRO CON NULL Y UNBOXING ===");
        demostrarNullUnboxing();

        System.out.println("\n=== TRAMPA CON remove() EN LIST ===");
        demostrarTrampaRemove();

        System.out.println("\n=== CONVERSIÓN LIST -> ARRAY ===");
        demostrarListToArray();

        System.out.println("\n=== CONVERSIÓN ARRAY -> LIST (BACKED LIST) ===");
        demostrarArrayToList();

        System.out.println("\n=== TRUCO CON VARARGS ===");
        demostrarVarargsTrick();

        System.out.println("\n=== ORDENAMIENTO DE LIST ===");
        demostrarSorting();
    }

    /**
     * 1. Demostración básica de autoboxing y unboxing
     * - Autoboxing: convertir primitivo a wrapper automáticamente
     * - Unboxing: convertir wrapper a primitivo automáticamente
     */
    private static void demostrarAutoboxing() {
        // Lista que almacena Double (wrapper)
        List<Double> weights = new ArrayList<>();

        // Línea 5: Autoboxing - double 50.5 se convierte automáticamente a Double
        weights.add(50.5);  // [50.5]
        System.out.println("Después de add(50.5): " + weights);

        // Línea 6: Forma tradicional - pasando explícitamente un wrapper
        weights.add(new Double(60));  // [50.5, 60.0]
        System.out.println("Después de add(new Double(60)): " + weights);

        // Línea 7: Autoboxing para remove()
        weights.remove(50.5);  // [60.0]
        System.out.println("Después de remove(50.5): " + weights);

        // Línea 8: Unboxing - Double se convierte automáticamente a double
        double first = weights.get(0);  // 60.0
        System.out.println("Valor obtenido con unboxing: " + first);
    }

    /**
     * 2. Peligro: Unboxing de null produce NullPointerException
     * Es legal agregar null a la lista, pero al hacer unboxing se produce error
     */
    private static void demostrarNullUnboxing() {
        List<Integer> heights = new ArrayList<>();
        heights.add(null);  // Legal: null puede asignarse a cualquier referencia

        System.out.println("Lista con null: " + heights);

        try {
            // ¡Peligro! Intenta unboxing de null -> NullPointerException
            int h = heights.get(0);  // NullPointerException
            System.out.println("Esto nunca se ejecuta: " + h);
        } catch (NullPointerException e) {
            System.out.println("ERROR: ¡No se puede hacer unboxing de null!");
            System.out.println("Excepción: " + e.getClass().getSimpleName());
        }
    }

    /**
     * 3. Trampa común: remove(int index) vs remove(Object o)
     * Cuando se usa remove() con int, Java llama al método que recibe índice
     * en lugar de hacer autoboxing para eliminar el objeto
     */
    private static void demostrarTrampaRemove() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("Lista inicial: " + numbers);  // [1, 2]

        // remove(1) elimina el ELEMENTO en el índice 1 (el valor 2)
        // No hace autoboxing porque ya existe remove(int index)
        numbers.remove(1);
        System.out.println("Después de remove(1): " + numbers);  // [1]

        // Para eliminar el valor 1, forzamos el uso del wrapper
        numbers.add(2);  // Volvemos a agregar 2
        System.out.println("Lista reiniciada: " + numbers);  // [1, 2]

        // Forzamos autoboxing para eliminar el valor 2 (no el índice)
        numbers.remove(new Integer(2));
        System.out.println("Después de remove(new Integer(2)): " + numbers);  // [1]
    }

    /**
     * 4. Conversión de List a Array
     * - toArray() devuelve Object[]
     * - toArray(new T[0]) devuelve el tipo específico
     */
    private static void demostrarListToArray() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        System.out.println("List original: " + list);

        // Opción 1: toArray() devuelve Object[] (pérdida de tipo)
        Object[] objectArray = list.toArray();
        System.out.println("Object[] length: " + objectArray.length);
        System.out.println("Object[0]: " + objectArray[0] + " (clase: " + objectArray[0].getClass().getSimpleName() + ")");

        // Opción 2: toArray(new T[0]) - devuelve array del tipo correcto
        // Pasando tamaño 0, Java crea un array del tamaño adecuado
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("String[] length: " + stringArray.length);
        System.out.println("String[0]: " + stringArray[0] + " (clase: " + stringArray[0].getClass().getSimpleName() + ")");

        // Opción 3: con tamaño mayor
        String[] biggerArray = list.toArray(new String[10]);
        System.out.println("String[] con tamaño 10: length = " + biggerArray.length);
        System.out.println("Elementos poblados: " + biggerArray[0] + ", " + biggerArray[1]);
        System.out.println("Elementos vacíos: " + (biggerArray[2] == null ? "null" : biggerArray[2]));
    }

    /**
     * 5. Conversión de Array a List (BACKED LIST)
     * ¡Importante! El array y la lista están vinculados (backed list)
     * Cambios en uno afectan al otro
     * PERO: no se puede cambiar el tamaño de la lista
     */
    private static void demostrarArrayToList() {
        String[] array = { "hawk", "robin" };
        System.out.println("Array original: " + Arrays.toString(array));

        // Arrays.asList() crea una lista de tamaño fijo vinculada al array
        List<String> list = Arrays.asList(array);
        System.out.println("List creada: " + list);
        System.out.println("Tamaño de la lista: " + list.size());

        // Cambio en la lista afecta al array
        list.set(1, "test");
        System.out.println("\nDespués de list.set(1, 'test'):");
        System.out.println("  List: " + list);
        System.out.println("  Array: " + Arrays.toString(array));

        // Cambio en el array afecta a la lista
        array[0] = "new";
        System.out.println("\nDespués de array[0] = 'new':");
        System.out.println("  List: " + list);
        System.out.println("  Array: " + Arrays.toString(array));

        // Intentar cambiar el tamaño lanza excepción
        try {
            list.remove(1);  // UnsupportedOperationException
            System.out.println("Esto no se ejecuta");
        } catch (UnsupportedOperationException e) {
            System.out.println("\nERROR: ¡No se puede cambiar el tamaño de la lista vinculada!");
            System.out.println("Excepción: " + e.getClass().getSimpleName());
        }

        // También lanza excepción al agregar
        try {
            list.add("nuevo");  // UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("ERROR: ¡No se puede agregar a la lista vinculada!");
        }
    }

    /**
     * 6. Truco con Varargs para crear List en una línea
     * Arrays.asList() acepta varargs, permitiendo crear List fácilmente
     */
    private static void demostrarVarargsTrick() {
        // Forma tradicional con varios pasos
        List<String> tradicional = new ArrayList<>();
        tradicional.add("one");
        tradicional.add("two");
        System.out.println("Tradicional: " + tradicional);

        // ¡Truco! Crear e inicializar en una línea usando varargs
        List<String> listaConVarargs = Arrays.asList("one", "two");
        System.out.println("Con varargs: " + listaConVarargs);

        // También funciona con más elementos
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Números con varargs: " + numeros);

        // Útil para pruebas rápidas
        List<String> colores = Arrays.asList("rojo", "verde", "azul");
        System.out.println("Colores: " + colores);
    }

    /**
     * 7. Ordenamiento de ArrayList con Collections.sort()
     */
    private static void demostrarSorting() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        System.out.println("Lista desordenada: " + numbers);

        // Ordenamiento ascendente natural
        Collections.sort(numbers);
        System.out.println("Lista ordenada (ascendente): " + numbers);

        // Ordenamiento con Strings
        List<String> words = Arrays.asList("zebra", "apple", "mango");
        System.out.println("Words desordenadas: " + words);
        Collections.sort(words);
        System.out.println("Words ordenadas (alfabético): " + words);
    }
}