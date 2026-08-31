package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Working_with_Unary_Operators;

public class LogicalComplementAndNegationOperators {
    public static void main(String[] args) {


        //! (complemento lógico): invierte un boolean.
        boolean x = false;
        System.out.println(x); // false
        x = !x;
        System.out.println(x); // true


        //- (negación): invierte el signo de un valor numérico.

        double x2 = 1.21;
        System.out.println(x);  // 1.21
        x2 = -x2;
        System.out.println(x);  // -1.21
        x2 = -x2;
        System.out.println(x);  // 1.21

        //No se pueden mezclar tipos: no puedes usar - en un boolean ni ! en un número.

        /*
        int x = !5;      // NO COMPILA (! no aplica a números)
        boolean y = -true; // NO COMPILA (- no aplica a booleanos)
        boolean z = !0;   // NO COMPILA (! no aplica a números, ni siquiera 0/1)

        */

    }



}
