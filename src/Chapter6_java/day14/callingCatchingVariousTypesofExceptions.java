package Chapter6_java.day14;

public class callingCatchingVariousTypesofExceptions {

     // metodo subClases
    public void Subclasses() {

        // EXCEPCIONES Y SOBRESCRITURA DE MÉTODOS


        //Cuando una subclase sobrescribe un método heredado, también debe respetar las reglas
        //relacionadas con las excepciones declaradas mediante throws.
        //
        //La regla principal es que un método sobrescrito NO puede ampliar el conjunto de
        //excepciones verificadas (checked exceptions) que declara el método original.
        //
        //Por ejemplo, este código no está permitido:

        class CanNotHopException extends Exception { }
        class Hopper {
            public void hop() { }
        }
        class Bunny extends Hopper {
            //public void hop() throws CanNotHopException { } // NO COMPILA
        }

        //No compila porque hop() en Hopper no declara ninguna excepción verificada.
        //Por lo tanto, Bunny no puede sobrescribir ese método agregando una nueva checked exception.
        //
        //La razón es que cualquier objeto Bunny también puede utilizarse como un Hopper.
        //El código que utiliza Hopper no está obligado a manejar CanNotHopException,
        //por lo que agregarla en la subclase rompería el contrato establecido por la superclase.



        // LA SUBCLASE PUEDE REDUCIR LAS EXCEPCIONES DECLARADAS


        //Al sobrescribir un método, la subclase puede declarar menos excepciones verificadas
        //que el método heredado. También puede eliminar completamente la declaración throws.

        //Ejemplo:



    /* class Hopper {
        public void hop() throws CanNotHopException { }
    }
    class Bunny extends Hopper {
        public void hop()  { }
    } */


        //Este ejemplo sí compila.
        //
        //La superclase indica que hop() podría lanzar CanNotHopException, pero la subclase
        //decide implementar el método sin lanzar esa excepción.
        //
        //Esto es válido porque Bunny está ofreciendo un comportamiento igual o más seguro
        //desde el punto de vista del manejo de excepciones.




        // LA SUBCLASE PUEDE USAR UNA EXCEPCIÓN MÁS ESPECÍFICA


        //También es válido reemplazar una excepción declarada por la superclase por una
        //subclase de esa excepción.
        //
        //Esto significa que, si la clase padre declara una excepción general,
        //la clase hija puede declarar una versión más específica.

        class Hopper2 {
            public void hop() throws Exception { }
        }
        class Bunny2 extends Hopper {
            //public void hop() throws CanNotHopException { }
        }

        //La idea de este ejemplo es que, si el método heredado declarara Exception,
        //el método sobrescrito podría declarar CanNotHopException porque
        //CanNotHopException hereda de Exception.
        //
        //Una excepción más específica representa un caso que ya está incluido dentro
        //del tipo más general declarado por la superclase.
        //
        //Por ejemplo:
        //
        //Exception
        //     CanNotHopException
        //
        //Si el código ya está preparado para manejar Exception, también puede manejar
        //cualquier excepción que sea descendiente de Exception.
        //
        //Por ello, una implementación sobrescrita puede:
        //
        //1. Declarar la misma excepción.
        //2. Declarar una subclase de esa excepción.
        //3. Declarar menos excepciones.
        //4. No declarar ninguna excepción.
        //
        //Estas restricciones se aplican específicamente a las checked exceptions.



        //-------
        // EXCEPCIONES NO VERIFICADAS (UNCHECKED EXCEPTIONS)


        //Las RuntimeException y sus subclases siguen reglas diferentes.
        //
        //Un método sobrescrito puede declarar nuevas excepciones no verificadas,
        //incluso cuando el método original no declara ninguna excepción.

        class Hopper3 {
            public void hop() { }
        }

        class Bunny3 extends Hopper {
            public void hop() throws IllegalStateException { }
        }

        //Este código compila correctamente.
        //
        //IllegalStateException es una RuntimeException y, por lo tanto,
        //es una excepción no verificada.
        //
        //Las unchecked exceptions no necesitan ser declaradas ni capturadas
        //obligatoriamente por el compilador.
        //
        //Por esa razón, Java permite que una subclase agregue este tipo de excepción
        //en la declaración de un método sobrescrito.

        //REGLA GENERAL:

        //CHECKED EXCEPTIONS:
        //La subclase no puede agregar una excepción más amplia o una nueva excepción
        //que no esté permitida por el método de la superclase.
        //
        //UNCHECKED EXCEPTIONS:
        //La subclase puede declarar libremente RuntimeException o cualquiera de sus subclases.
    }



    public void Printing_an_Exception(){


        // FORMAS DE MOSTRAR INFORMACIÓN DE UNA EXCEPCIÓN


    /*
    Una excepción contiene diferente información que puede mostrarse dependiendo
    de lo que necesitemos durante la ejecución o depuración.

    Las formas más comunes son:

    1. Imprimir el objeto Exception.
    2. Obtener únicamente su mensaje.
    3. Mostrar el stack trace completo.
    */

        //Este ejemplo muestra los tres enfoques:

    /* public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    } */

        //Este código produce la siguiente salida:

        //java.lang.RuntimeException: cannot hop

        //java.lang.RuntimeException: cannot hop at trycatch.Handling.hop(Handling.java:15) at trycatch.Handling.main(Handling.java:7)



        // System.out.println(e)


        //Cuando se imprime directamente la variable de la excepción, Java utiliza
        //su representación en texto.
        //
        //Normalmente se muestra:
        //
        //Nombre de la clase de la excepción + mensaje asociado.
        //
        //Ejemplo:
        //
        //java.lang.RuntimeException: cannot hop
        //
        //Esto permite identificar rápidamente qué tipo de error ocurrió.


        // e.getMessage()




        //El método getMessage() devuelve únicamente el mensaje asociado a la excepción.
        //
        //No incluye el nombre de la clase ni información sobre los métodos
        //desde donde se produjo el problema.
        //
        //Ejemplo:
        //
        //cannot hop
        //
        //Es útil cuando solamente queremos mostrar una descripción concreta del error.



        // e.printStackTrace()



        //printStackTrace() muestra información más completa sobre la excepción.
        //
        //Además del tipo y el mensaje, presenta la secuencia de llamadas a métodos
        //que estaban activas cuando ocurrió el error.
        //
        //Cada línea ayuda a identificar:
        //
        //- El método involucrado.
        //- La clase donde se encuentra.
        //- El archivo.
        //- La línea aproximada donde ocurrió el problema.
        //
        //Esta información es especialmente útil para encontrar el origen de un error
        //durante la depuración.



        // STACK TRACE


        //El stack trace representa el recorrido de llamadas de métodos que llevó
        //hasta el punto donde ocurrió la excepción.
        //
        //Por ejemplo:
        //
        //main() llama a methodA()
        //methodA() llama a methodB()
        //methodB() lanza una excepción
        //
        //El stack trace permite observar esa cadena de llamadas y localizar
        //el punto donde se originó el problema.
        //
        //En preguntas de certificación Java, normalmente se presta mayor atención
        //a la primera representación de la excepción, especialmente cuando se evalúa
        //la salida producida por un fragmento de código.



        // POR QUÉ NO ES RECOMENDABLE IGNORAR UNA EXCEPCIÓN


        //Una checked exception debe ser capturada o declarada utilizando throws.
        //
        //Sin embargo, simplemente colocar un catch vacío no significa que el problema
        //haya desaparecido. Solo significa que el programa decidió no hacer nada
        //cuando ocurrió el error.
        //
        //Esto puede provocar errores posteriores más difíciles de identificar.

        //Ejemplo:

    /* public static void main(String[] args) {
        String textInFile = null;

        try {
            readInFile();
        } catch (IOException e) {
            // La excepción es capturada, pero no se realiza ninguna acción.
        }


        imagina muchas líneas de código aquí

        Como textInFile nunca se llenó (porque leer el archivo falló), sigue siendo null.

        System.out.println(textInFile.replace(" ", ""));    //falla
    }

    private static void readInFile() throws IOException {
        throw new IOException();
    } */



        // CONSECUENCIA DEL CATCH VACÍO


        //El problema original es la IOException generada durante la lectura.
        //
        //Sin embargo, como el catch no registra, muestra ni vuelve a lanzar la excepción,
        //la ejecución continúa como si el problema no hubiera ocurrido.
        //
        //Después, el programa intenta utilizar textInFile.
        //
        //Como la variable nunca recibió un valor válido, permanece en null.
        //Al intentar ejecutar replace() sobre null, se produce una NullPointerException.





        //Al capturar una excepción, es importante decidir qué debe hacer el programa.
        //
        //Algunas alternativas son:
        //
        //1. Registrar o imprimir información sobre la excepción.
        //2. Mostrar un mensaje adecuado al usuario.
        //3. Intentar una acción alternativa o recuperación.
        //4. Volver a lanzar la excepción.
        //
        //Un catch vacío debería evitarse, salvo casos muy específicos donde realmente
        //sea seguro ignorar la excepción.
        //
        //En muchos casos, si una operación esencial falla, continuar ejecutando el
        //programa puede producir errores secundarios.

    }



}
