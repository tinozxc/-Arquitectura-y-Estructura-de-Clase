package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Using_Additional_Binary_Operators;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
        Los operadores &, |, ^ se aplican tanto a tipos numéricos como a boolean.
         se llaman lógicos
         */

        // AND (&) -> solo true si AMBOS son true

        /*
        true  & true  = true
        true  & false = false
        false & true  = false
        false & false = false

         */

// OR inclusivo (|) -> solo false si AMBOS son false

        /*
        true  | true  = true
        true  | false = true
        false | true  = true
        false | false = false

         */

// XOR (^) -> solo true si son DIFERENTES

        /*
        true  ^ true  = false
        true  ^ false = true
        false ^ true  = true
        false ^ false = false
         */

                /*
       Operadores Condicionales (Short-Circuit): && y ||

      Casi idénticos a & y |, pero no evalúan el lado derecho si
       el resultado ya puede determinarse con el lado izquierdo.
                 */

        /*

        boolean x = true || (y < 4);
     // Como el lado izq. ya es true, nunca se evalúa (y < 4)
     // (con | sí se evaluaría siempre)


         */

        //evitar NullPointerException

        /*
        if (x != null && x.getValue() < 5) {
            // Si x es null, el && detiene la evaluación aquí
            // Nunca se llama x.getValue(), así que no hay excepción

         */

        //! CUIDADO EN EL EXAMEN

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7); // si uno es true el otro no evalua
        System.out.println(x);
        // Como (x >= 6) ya es true, el lado derecho (++x <= 7) NUNCA se evalúa
        // Salida: 6 (x no se incrementó)
        }

    }

