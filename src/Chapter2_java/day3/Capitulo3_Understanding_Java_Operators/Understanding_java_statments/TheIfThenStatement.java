package Chapter2_java.day3.Capitulo3_Understanding_Java_Operators.Understanding_java_statments;

public class TheIfThenStatement {

    public static void main(String[] args) {

        //Ejecuta un bloque de código solo si una expresión
        // boolean es true en tiempo de ejecución.

         /*
        if (booleanExpression) {
            // Se ejecuta si es true
        }

          */

        //sin bloque, una sola instrucción):

        /*
        if (hourOfDay < 11)
            System.out.println("Good Morning");
     // Si hourOfDay < 11, se imprime el mensaje
         */

        //Ejemplo con bloque (múltiples instrucciones):

        /*
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }
     // Las llaves {} permiten ejecutar varias instrucciones juntas
         */


        //!Cuidado con la indentación y las llaves
        // código sin llaves que parece estar agrupado
        //  por la indentación, pero no lo está.


        /*
            if (hourOfDay < 11)
                System.out.println("Good Morning"); // -> si cuenta solo esta linea
                morningGreetingCount++;  // no lo cuenta

                //EXPLICACION
    // La indentación ENGAÑA: parece que ambas líneas dependen del if,
    // pero en realidad SOLO el println() depende del if.
    // morningGreetingCount++ SIEMPRE se ejecuta, sin importar la condición.
         */

    }
}
