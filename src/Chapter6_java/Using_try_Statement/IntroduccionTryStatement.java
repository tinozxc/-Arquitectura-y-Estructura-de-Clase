package Chapter6_java.Using_try_Statement;

public class IntroduccionTryStatement {

    //A continuación aprenderemos cómo se gestionan las excepciones en Java.
    //Java separa, mediante la instrucción try, la lógica normal del método de la lógica encargada de resolver una excepción.

    /* try{
        También se conoce el bloque try como código protegido
    }catch( exception_type identifier (OBJETO DE Expcetion  que captura )){
        manejador de excepciones
    } */


    //Las sentencias dentro del bloque try se ejecutan de forma habitual.
    //Cuando alguna de esas sentencias genera una excepción compatible con el tipo declarado en el catch,
    //la ejecución del try se interrumpe inmediatamente y el control salta al bloque catch correspondiente.

    // Si, por el contrario, ninguna instrucción del try produce una excepción capturable, el bloque catch simplemente se ignora.

    //A lo largo de esta explicación usamos indistintamente las palabras 'block' (bloque) y 'clause' (cláusula), tal como hace
    //el propio examen, así que conviene familiarizarse con ambos términos. Los dos son válidos: se habla de "bloque" porque
    //hay llaves de por medio, y de "cláusula" porque forman parte de la estructura de una sentencia try.

    /* void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }
    void fall() {  throw new RuntimeException(); }
    */

    //El flujo comienza invocando fall() dentro del try, y ese método dispara una excepción.
    //Como consecuencia, Java abandona el resto del bloque try sin llegar a imprimir "never get here".
    //A partir de ahí se ejecuta el catch, que atrapa la RuntimeException lanzada y corre getUp().
    //Una vez concluido el catch, la instrucción try/catch finaliza y el programa continúa con normalidad ejecutando seeAnimals().

    // Veamos ahora algunos ejemplos de sentencias try mal formadas, que suelen usarse en el examen para confundir al candidato.

    /* try  // NO COMPILA
    fall();
    catch (Exception e)
    System.out.println("get up"); */

    //ESTO NO COMPILA PORQUE TANTO EL TRY COMO EL CATCH EXIGEN SIEMPRE LLAVES QUE DELIMITEN SU BLOQUE DE CÓDIGO.
    //A DIFERENCIA DE ESTRUCTURAS COMO IF, WHILE O FOR, AQUÍ NO EXISTE LA OPCIÓN DE OMITIR LAS LLAVES PARA UNA SOLA SENTENCIA.

    //Falta agregar las llaves. La forma correcta sería:

    /* try {
        fall();
    } catch (Exception e) {
        System.out.println("get up");
    } */

    // Las llaves son obligatorias aun cuando el bloque contenga una única instrucción.

    /* try { //NO COMPILA
        fall();
    } */

    //NO COMPILA PORQUE LE FALTA UN CATCH (O UN FINALLY); UN TRY NO PUEDE EXISTIR SOLO, SIN NINGUNA CLÁUSULA QUE LO ACOMPAÑE.

    //Este fragmento falla porque después del bloque try no hay nada más.
    //Hay que tener presente que la razón de ser de un try es reaccionar ante una eventual excepción;
    //si no se agrega ninguna otra cláusula, el try queda incompleto y sin sentido.

    //A continuación abordaremos el bloque finally
    //y veremos cómo capturar distintos tipos de excepciones, además de qué sucede si se produce una excepción dentro del propio catch o finally.

    /*
    public static void main(String[] args) {
        Using_a_try_Statement using_a_try_Statement = new Using_a_try_Statement();
        using_a_try_Statement.Adding_a_finally_Block();
    }
*/
    public void Adding_a_finally_Block() {
        /*
    }
        //Además del try y el catch, Java permite definir un bloque finally que se ejecuta siempre al terminar,
        //se haya producido una excepción o no. Por ejemplo:

        try{
            //cuerpo del bloque try
        }catch(Exception e){
            e.getMessage();     //cuerpo del bloque catch
        }finally{
            //cuerpo del bloque finally
            //El bloque finally se ejecuta en cualquier caso, sin importar si el try lanzó o no una excepción.
        }



     */
        /*
        Cuando hay catch y finally combinados, existen dos posibles recorridos del código:
        * Si ocurre una excepción, primero corre el catch y luego, a continuación, el finally.
        * Si no ocurre ninguna excepción, el finally se ejecuta apenas termina el bloque try.
        */

        //EL CATCH DEJA DE SER OBLIGATORIO CUANDO EXISTE UN FINALLY.

        //Un ejemplo que incluye finally:

        /* void explore() {
            try {
                seeAnimals();
                fall();
            } catch (Exception e) {
                getHugFromDaddy();
            } finally {
                seeMoreAnimals();
            }
            goHome();
        } */

        //Este ejemplo arranca en el try, donde se llama a fall() (la niña se cae).
        //Si logra levantarse por sí sola, no hay excepción y el flujo pasa directo al finally, ejecutando seeMoreAnimals().
        //Con eso, la sentencia try concluye y el programa sigue con goHome().


        //Pero si no logra levantarse sola, se lanza una excepción, y entra en juego el catch,
        //donde se ejecuta getHugFromDaddy(); al terminar ese catch, se pasa igualmente al finally
        //con seeMoreAnimals(). Después, la sentencia try termina y continúa la ejecución con goHome().
        //En ambos escenarios el desenlace es el mismo: el finally corre siempre y ahí concluye el try.

        //Para el examen OCA, recuerda que toda sentencia try necesita al menos un catch o un finally (o ambos a la vez, lo cual es válido).
        //Lo que no está permitido es no tener ninguno de los dos.
        //Ten en cuenta también que, en el contexto del OCA, se asume que un try es un try convencional, no un try-with-resources.

        //Es común que el examen intente confundirte omitiendo alguna cláusula o cambiando el orden en que aparecen.

        /* try { // NO COMPILA
            fall();
        } finally {
            System.out.println("all better");
        } catch (Exception e) {
            System.out.println("get up");
        } */

        /* try { // NO COMPILA
            fall();
        } */

        /* try {
            fall();
        } finally {
            System.out.println("all better");
        } */

        //El primer caso NO COMPILA porque el finally aparece antes que el catch, y ese orden no está permitido.

        //El segundo caso NO COMPILA porque le falta obligatoriamente un catch o un finally.

        //El tercer caso sí es válido: basta con tener el finally, sin necesidad de catch.


        //Vale aclarar que un uso realmente práctico del finally queda fuera del temario del examen OCA.
        //Normalmente finally se emplea para liberar recursos —archivos, conexiones a bases de datos, etc.—, tema que corresponde al OCP.
        //Por eso, en el OCA los ejemplos con finally suelen sentirse un poco artificiales o forzados.
        //Un caso típico de pregunta sería predecir qué imprime este fragmento:

    /*
        String s = "";
        try {
            s += "t";
        } catch(Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.print(s);

     */

        //EL RESULTADO ES tfa, ya que no hubo ninguna excepción: se ejecuta el try, luego el finally,
        //y finalmente el flujo continúa con la instrucción posterior al bloque try/catch/finally.


        //DATO IMPORTANTE:
        //El método System.exit(0) finaliza la ejecución del programa de forma inmediata, sin importar el punto exacto en que se invoque.
        //Si se llama a System.exit() dentro de un try o un catch, el bloque finally queda sin ejecutarse.
        //La JVM se apaga en ese instante, antes de que el flujo pueda alcanzar el finally.
        //EJEMPLO:

        /* try {
            System.out.println("Intentando...");
            System.exit(0); // el programa se cierra AQUÍ mismo
        } finally {
            System.out.println("Esto nunca se imprime"); // no se ejecuta
        } */

    }
}
