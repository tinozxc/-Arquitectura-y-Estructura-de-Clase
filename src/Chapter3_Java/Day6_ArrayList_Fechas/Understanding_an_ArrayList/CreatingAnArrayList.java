package Chapter3_Java.Day6_ArrayList_Fechas.Understanding_an_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreatingAnArrayList {

    public static void main(String[] args) {
        // ---- Formas viejas (pre-genéricos, Java < 5) ----
        ArrayList list1 = new ArrayList();     // capacidad por defecto, vacío
        ArrayList list2 = new ArrayList(10);    // capacidad para 10, sigue vacío
        ArrayList list3 = new ArrayList(list2); // copia el tamaño y contenido de otro ArrayList

        // ---- Con genéricos (Java 5+): defines el tipo entre < > ----
        ArrayList<String> list4 = new ArrayList<String>(); // tipo repetido
        ArrayList<String> list5 = new ArrayList<>();        // "diamond operator" (Java 7+), infiere el tipo

        // ---- List es una INTERFAZ, ArrayList es una implementación ----
        List<String> list6 = new ArrayList<>(); // OK: guardar un ArrayList en variable List
        // ArrayList<String> list7 = new List<>(); // NO COMPILA: List es interfaz, no se puede instanciar

        list6.add("hola");
        System.out.println(list6); // [hola]
    }
}
