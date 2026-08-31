package Chapter3_Java.Day6_ArrayList_Fechas.Understanding_an_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingAnArrayList {

    public static void main(String[] args) {
        // ---- add() sin genéricos: acepta CUALQUIER tipo (Object) ----
        ArrayList list = new ArrayList();  // no tiene <Libre>
        list.add("hawk");        // [hawk]
        list.add(Boolean.TRUE);  // [hawk, true]
        System.out.println(list); // [hawk, true]

        // ---- add() con genéricos: el compilador restringe el tipo ----
        ArrayList<String> safer = new ArrayList<>(); // permite solo String
        safer.add("sparrow");
        // safer.add(Boolean.TRUE); // NO COMPILA: solo acepta String

        // ---- add() con índice: cuidado con el orden ----
        List<String> birds = new ArrayList<>();
        birds.add("hawk");        // [hawk]
        birds.add(1, "robin");     // [hawk, robin]
        birds.add(0, "blue jay");   // [blue jay, hawk, robin]
        birds.add(1, "cardinal");    // [blue jay, cardinal, hawk, robin]
        System.out.println(birds);

        // ---- remove(): por valor (Object) o por índice (int) ----
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk");
        birds2.add("hawk");
        System.out.println(birds2.remove("cardinal"));        // false -> no estaba
        System.out.println(birds2.remove("hawk"));            // true  -> borra solo el PRIMER match
        System.out.println(birds2.remove(0));              // hawk -> borra por índice, devuelve el elemento
        System.out.println(birds2); // []

        // ---- set(): reemplaza sin cambiar el tamaño ----
        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk");
        birds3.set(0, "robin"); // size sigue en 1
        // birds3.set(1, "robin"); // IndexOutOfBoundsException

        // ---- isEmpty() / size() / clear() / contains() / equals() ----
        // (ver texto original — todos se comportan como se describe)

        //contains = valida si contiene tal elemento en esa lista
        List<String> birdsd = new ArrayList<>();
        birdsd.add("hawk"); // [hawk]
        System.out.println(birdsd.contains("hawk")); // true
        System.out.println(birdsd.contains("robin")); // false

   //equals en arraysList
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        one.equals(two);   // true (ambas vacías)

        one.add("a");
        one.equals(two);   // false (tamaños distintos)

        two.add("a");
        one.equals(two);   // true (mismo contenido, mismo orden)

        one.add("b");        // [a, b]
        two.add(0, "b");     // [b, a]
        one.equals(two);     // false ← ¡MISMOS elementos, pero ORDEN distinto!

    }

}
