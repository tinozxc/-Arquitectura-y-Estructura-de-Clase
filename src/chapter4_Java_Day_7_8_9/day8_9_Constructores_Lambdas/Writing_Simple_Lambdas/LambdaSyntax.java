package chapter4_Java_Day_7_8_9.day8_9_Constructores_Lambdas.Writing_Simple_Lambdas;

public class LambdaSyntax {

    //formas correctas de escribir una funcion lambda

    /*

    print( () -> true); // 0 parameters
    print( a -> a.startsWith("test")); // 1 parameter
    print( (String a) -> a.startsWith("test")); // 1 parameter
    print( (a, b) -> a.startsWith("test")); // 2 parameters
    print( (String a, String b) -> a.startsWith("test")); // 2 parameters

     */

    //FORMAS INCORRECTAS DE USAR LAMBDA

    /*
    *   print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
    *  obligatoria usar () , cuando son 2 parametros
    *
        print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE
        *falta el return cuando se aplica las llaves {}
        *
        print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE
        * olvido cerrar el codigo al final de la linea ;
        *
        *
        (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE no se declara dentro
    *
    * */
}
