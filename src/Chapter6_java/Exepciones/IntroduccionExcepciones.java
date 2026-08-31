package Chapter6_java.Exepciones;

public class IntroduccionExcepciones {


 //En todo programa existe la posibilidad de que algo no salga como se espera durante su ejecucion.
//Para gestionar este tipo de situaciones, Java cuenta con el mecanismo de excepciones.
//El examen OCA unicamente evalua los aspectos mas basicos sobre el manejo de excepciones.

    public static void main(String[] args) {
        //Practicamente cualquier motivo puede provocar que un programa deje de funcionar correctamente.

    /*

    Algunos escenarios comunes serian:
    * El programa trata de establecer conexion con un servidor web, pero no hay señal de internet.
    * Se produjo un descuido al programar y se accedio a una posicion de arreglo que no existe.
    * Un metodo es invocado por otro con un dato que no es capaz de procesar.
    */

        //Como puede verse, algunos de estos casos corresponden claramente a fallos de programacion.
        //Otros, en cambio, son totalmente ajenos a nuestro control. Si se cae la conexion a internet, el programa no tiene forma de evitarlo.

        //Lo que si podemos controlar es la reaccion frente a ese problema. Empezaremos revisando para que sirven las excepciones.
        //Luego veremos los distintos tipos que existen, y por ultimo, como generar una excepcion nosotros mismos.


    }

    public void The_Role_of_Exceptions(){
        //Podria decirse que una excepcion es la manera en que Java admite: "no tengo idea de como continuar desde aqui, resuelvelo tu."
        //Al escribir un metodo, se tiene la opcion de resolver la excepcion dentro del mismo, o transferir esa tarea
        //a quien haya realizado la llamada al metodo.

        //Estas son las unicas dos alternativas disponibles en Java frente a una excepcion.
        //Un metodo puede encargarse de ella internamente, o dejarsela como responsabilidad a su invocador.

        // ejemplo del capitulo 1 importante :
        //Se coloco el siguiente fragmento dentro de la clase Zoo


    /* public class Zoo {
        public static void main(String[] args) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
    } */

        //Luego, desde la linea de comandos, se ejecutaron estas instrucciones pasando menos argumentos de los requeridos:

        //$ javac Zoo.java (compilacion)
        //$ java Zoo Zoo   (ejecucion con un solo argumento)

        //Al llegar a la cuarta linea, Java noto que el arreglo solo contenia un elemento, por lo que el indice 1 era invalido.
        //Java no busco resolverlo por cuenta propia; simplemente indico:
        //"esto se sale de mi alcance" y mostro la excepcion:

    /* ZooException in thread "main"
    java.lang.ArrayIndexOutOfBoundsException: 1
    at mainmethod.Zoo.main(Zoo.java:7) */

        //Las excepciones aparecen con bastante frecuencia, incluso dentro de aplicaciones bien escritas.

        //Conforme se desarrollen programas de mayor complejidad, sera habitual lidiar con problemas
        //relacionados a archivos, conexiones de red y servicios externos.

        //De cara al examen, las excepciones suelen asociarse principalmente a errores presentes en el propio codigo.
        //Un ejemplo clasico seria intentar acceder a una posicion que no existe dentro de un arreglo.
        //


        //Valores Especiales de Retorno vs. Excepciones

        //Se recurre a las excepciones cuando sucede "algo fuera de lo normal". Aunque, claro, ese termino es relativo.
        //El siguiente metodo, en cambio, retorna -1 en vez de generar una excepcion cuando no localiza ninguna coincidencia:

    /* public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }
        }
        return -1;
    } */

    /*
    Hay dos formas distintas de comunicarle a quien usa el metodo que "sucedio algo particular":
    * Un codigo de retorno (return -1, null, etc.)
    * Una excepcion (un problema que debe gestionarse)
    */

    /* Para busquedas -> conviene un codigo de retorno (-1)
    Si se busca "Joe" en una lista y no aparece, eso no constituye un error verdadero. Es un resultado
    totalmente normal y anticipado. Es esperable que un nombre no este presente en la lista.
    Ademas, ya es una practica establecida entre desarrolladores que las busquedas retornen -1 o null si no encuentran nada.
    */

    /* Para casos poco comunes o graves -> conviene una excepcion
    Si al metodo se le pasa null en lugar del arreglo de nombres, eso jamas deberia suceder en condiciones normales.
    Se trata de una situacion genuinamente atipica, por lo que en ese contexto si corresponde lanzar una excepcion.
    */

        //EN RESUMEN:
        //Limita el uso de -1 u otros valores especiales a resultados previsibles (como no encontrar algo al buscar).
        //Para cualquier otro caso realmente fuera de lo comun, opta por las excepciones, ya que resulta mas dificil ignorarlas.
    }

    public void Understanding_Exception_Types(){
        //Segun lo explicado, una excepcion es un evento capaz de alterar el curso normal de ejecucion del programa.
        //Java agrupa a todos los objetos que representan estos eventos bajo la superclase Throwable.
        //Vale aclarar que no todas las subclases llevan la palabra "exception" en su nombre, lo cual puede generar cierta confusion.
        /*
         * Jerarquia de excepciones en Java:
         *
         *                  java.lang.Object
         *
         *                  java.lang.Throwable
         *
         *      java.lang.Exception      java.lang.Error
         *
         *      java.lang.RuntimeException
         *
         * - Throwable: clase base para todo lo que puede lanzarse (throw) y capturarse (catch).
         * - Error: fallas serias vinculadas al sistema o a la JVM (ej: OutOfMemoryError). Normalmente no deberian gestionarse.
         * - Exception: fallas que la aplicacion podria querer capturar y solucionar.
         * - RuntimeException: excepciones no verificadas (unchecked); no requieren try/catch
         *   ni declararse con "throws" (ej: NullPointerException, ArrayIndexOutOfBoundsException).
         * - Exception (que no derive de RuntimeException) se considera checked, y el compilador
         *   obliga a resolverla con try/catch o a declararla mediante "throws".
         */

        //Un Error señala que la situacion es tan grave que el programa no deberia intentar seguir funcionando.
        //Un ejemplo seria que el disco duro dejara de responder completamente. Son condiciones extremas, poco frecuentes en la practica.
        //Una excepcion en tiempo de ejecucion equivale a la clase RuntimeException junto con todas sus subclases.
        //Suelen ser situaciones inesperadas, aunque no necesariamente representan algo fatal para el programa.
        //Por ejemplo, acceder a un indice de arreglo invalido es algo inesperado, pero manejable.
        //Tambien reciben el nombre de excepciones no verificadas.



        //Ejecucion del programa vs. el momento en si de "runtime"

        //Tecnicamente hablando, TODAS las excepciones, sean checked o unchecked, ocurren durante la ejecucion, jamas en la compilacion.
        //Pero si usaramos la expresion "excepcion en tiempo de ejecucion" para referirnos a eso, GENERARIA CONFUSION CON RUNTIMEEXCEPTION.
        //Por esa razon, nadie la emplea de esa forma en la practica.

        //Cuando se habla de "runtime exception", siempre se esta haciendo referencia puntual a RuntimeException (unchecked),
        //y no a "cualquier excepcion que surgio mientras el programa se ejecutaba".



        //Una excepcion verificada (checked) incluye a Exception y a todas sus subclases, salvo las que derivan de RuntimeException (unchecked).
        //Suelen ser mas previsibles; un ejemplo tipico seria intentar leer un archivo inexistente.

        //¿Y que hay de las excepciones verificadas? Efectivamente, Java aplica una norma conocida como la regla de "manejar o declarar".
        //Frente a las excepciones verificadas, Java exige que el codigo las resuelva, o bien las declare en la firma del metodo.
        //Por ejemplo, este metodo advierte que existe la posibilidad de lanzar una excepcion:

    /* void fall() throws Exception {
        throw new Exception();
    } */

        //En este caso, la clausula throws Exception NO implica que el metodo forzosamente vaya a lanzarla.
        //Simplemente cumple la funcion de advertir al compilador.

        //Ten en cuenta que se estan empleando dos palabras clave diferentes. throw se usa para lanzar la excepcion en ese momento.
        //throws, en cambio, solo declara que el metodo tiene la posibilidad de lanzarla. O quiza nunca ocurra.

        //Debido a que las excepciones verificadas tienden a ser predecibles,
        //Java exige que el programador deje evidencia de haberlas considerado.
        //Ya sea resolviendolas dentro del propio metodo, o declarando que no puede encargarse de ellas y
        //que esa responsabilidad pasa a quien lo invoque.

        //Un caso frecuente de excepcion en tiempo de ejecucion es NullPointerException, la cual surge al intentar acceder
        //a un miembro desde una referencia nula. Esto puede ocurrir practicamente en cualquier metodo.



        //Excepciones verificadas vs. no verificadas (en tiempo de ejecucion)
        //===============
        //En el pasado: se abusaba bastante de las excepciones verificadas (checked), pensadas para errores de los que el programador podia recuperarse.
        //El problema en la practica: terminaban propagandose de metodo en metodo (throws) sin que realmente nadie las resolviera.
        //Se volvian mas un estorbo que una proteccion real.
        //En la actualidad: numerosas librerias prefieren usar RuntimeException (unchecked) incluso para errores recuperables,
        //ya que resulta mas sencillo y evita ese arrastre continuo de clausulas throws.


    }

    public void Throwing_an_Exception(){
        //Cualquier porcion de codigo en Java tiene la capacidad de generar una excepcion.

        //Para el examen: lo mas comun sera toparse con excepciones que ya vienen incluidas en Java.
        //Tambien es posible que aparezca alguna excepcion creada especificamente para la evaluacion.
        //La pregunta dejara claro que se trata de una excepcion, pues el nombre de la clase terminara con 'Exception'.
        //Por ejemplo, 'MyMadeUpException'

        //En el examen se presentan dos formas de codigo que desencadenan una excepcion. La primera es codigo defectuoso. Por ejemplo:
    /* String[] animals = new String[0];
    System.out.println(animals[0]);  */

        //El fragmento anterior desencadena lo siguiente:
        //Este codigo genera una ArrayIndexOutOfBoundsException.
        //Esto significa que preguntas relacionadas con excepciones pueden aparecer camufladas dentro de preguntas
        //que en apariencia tratan sobre otro tema.




        //La segunda forma en que el codigo puede desencadenar una excepcion es pidiendole explicitamente a Java que la genere.
        //Java permite redactar instrucciones de este tipo:

    /* throw new Exception();

    throw new Exception("Ow! I fell."); */
        throw new RuntimeException();
        //throw new RuntimeException("Ow! I fell.");

        //La palabra clave throw le comunica a Java que otra seccion del programa debera encargarse de la excepcion.
        //Alguien mas tendra que definir como proceder con ella. Al construir una excepcion, es habitual poder
        //incluir un String a modo de mensaje, o dejarlo sin especificar y usar los valores predeterminados.

        //Los dos primeros ejemplos crean una instancia de tipo Exception y la lanzan al instante.
        //Los ultimos dos evidencian que la sintaxis luce identica sin importar el tipo particular de excepcion que se este lanzando.


    }


}
