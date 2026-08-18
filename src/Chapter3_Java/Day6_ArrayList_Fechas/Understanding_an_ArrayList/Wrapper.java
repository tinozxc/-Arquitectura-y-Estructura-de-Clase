package Chapter3_Java.Day6_ArrayList_Fechas.Understanding_an_ArrayList;

import java.util.ArrayList;
import  java.util.*;
public class Wrapper {

    public static void main(String[] args) {

        // ============ CONSTRUCTORES WRAPPER ============
        // Envuelven tipos primitivos en objetos

      //  Boolean b = new Boolean(true);      // Envuelve un boolean
      //  Integer i = new Integer(42);         // Envuelve un int
      //  Double d = new Double(3.14);         // Envuelve un double

        // ============ ARRAYLIST CON WRAPPERS ============
        // ArrayList solo acepta objetos, no primitivos
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);   // Autoboxing: int se convierte a Integer
        numeros.add(20);

        // ============ PARSE METHODS ============
        // Retornan PRIMITIVOS (tipo primitivo en el nombre del método)
        int num1 = Integer.parseInt("123");           // String a int primitivo
        double num2 = Double.parseDouble("3.14");     // String a double primitivo
        boolean b1 = Boolean.parseBoolean("true");    // String a boolean primitivo

        // ============ VALUEOF METHODS ============
        // Retornan WRAPPER CLASSES (objetos)
        Integer num3 = Integer.valueOf("456");        // String a Integer (objeto)
        Double num4 = Double.valueOf("2.71");         // String a Double (objeto)
        Boolean b2 = Boolean.valueOf("false");        // String a Boolean (objeto)

        // ============ CHARACTER - CASO ESPECIAL ============
        // Character NO tiene parse/valueOf. Usa charAt()
        char c = "Hola".charAt(0);  // Obtiene el primer carácter 'H'

        // ============ MOSTRAR RESULTADOS ============
        System.out.println("parseInt: " + num1);      // Salida: parseInt: 123
        System.out.println("valueOf: " + num3);       // Salida: valueOf: 456
        System.out.println("ArrayList: " + numeros);  // Salida: ArrayList: [10, 20]
        System.out.println("Character: " + c);        // Salida: Character: H
    }

}
