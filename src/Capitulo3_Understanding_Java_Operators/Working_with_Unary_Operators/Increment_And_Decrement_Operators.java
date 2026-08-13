package Capitulo3_Understanding_Java_Operators.Working_with_Unary_Operators;

public class Increment_And_Decrement_Operators {

    public static void main(String[] args) {

        int counter = 0;
        System.out.println(counter);   // 0
        System.out.println(++counter); // 1  (pre: incrementa y luego retorna)
        System.out.println(counter);   // 1
        System.out.println(counter--); // 1  (post: retorna y luego decrementa)
        System.out.println(counter);   // 0
        //Ejemplo con múltiples operadores en la misma línea (típico en exámenes, x se modifica 3 veces):

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
    //Paso a paso (izquierda a derecha):

   /* java
    // 1. ++x -> x pasa a 4, se usa 4 en la expresión
    int y = 4 * 5 / x-- + --x;    // x=4

    // 2. x-- -> se usa el valor ORIGINAL (4), luego x pasa a 3
    int y = 4 * 5 / 4 + --x;      // x=3

    // 3. --x -> x pasa a 2, se usa el nuevo valor (2)
    int y = 4 * 5 / 4 + 2;        // x=2

    // 4. Se evalúa * y / (izq a der), luego +
    int y = 20 / 4 + 2;
    int y = 5 + 2;
    int y = 7;

    */
}
