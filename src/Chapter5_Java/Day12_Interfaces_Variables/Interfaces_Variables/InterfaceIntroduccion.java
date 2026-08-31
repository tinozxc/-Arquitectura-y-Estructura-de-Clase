package Chapter5_Java.Day12_Interfaces_Variables.Interfaces_Variables;

public class InterfaceIntroduccion {

    //
    // entendimiento sobre la variables de interfaz ,

    public void Variable_Interface (){
 //EN UNA INTERFAZ TAMBIÉN ES POSIBLE DECLARAR VARIABLES, CONOCIDAS COMO VARIABLES DE INTERFAZ.
//IGUAL QUE SUCEDE CON LOS METODOS DE INTERFAZ, SE SOBREENTIENDE QUE ESTAS VARIABLES SON PUBLICAS.
//PERO A DIFERENCIA DE LOS METODOS, ADEMAS SE SOBREENTIENDE QUE SON ESTATICAS Y DE SOLO LECTURA (FINAL).
/*

NORMAS QUE APLICAN A LAS VARIABLES DECLARADAS DENTRO DE UNA INTERFAZ
    * 1. Toda variable de interfaz se considera automaticamente publica, estatica y final.
    * En consecuencia, si se intenta declarar como privada o protegida, el compilador lanzara error,
    * y lo mismo ocurre si se intenta marcar como abstracta.
    * 2. Debido a que se trata de una variable final, es obligatorio asignarle un valor
    * en el mismo momento de su declaracion.
*/


//EN OTRAS PALABRAS: una variable de interfaz funciona como una CONSTANTE definida a nivel de la interfaz.

//AL SER ESTATICA, PUEDE USARSE SIN NECESIDAD DE CREAR UNA INSTANCIA DE LA INTERFAZ.

//Las dos formas de declarar la siguiente interfaz son equivalentes, ya que el compilador
//transforma automaticamente la primera version en la segunda:


/* public interface CanSwim {      //declaracion inicial de la interfaz CanSwim
    int MAXIMUM_DEPTH = 100;        //carece de public y final explicitos, el compilador los agrega por su cuenta
    final static boolean UNDERWATER = true; //el orden de final y static no afecta, Java igual la vuelve publica
    public static final String TYPE = "Submersible";    //escrita de forma completa y correcta
}


public interface CanSwim {         //version  generada por el compilador
    public static final int MAXIMUM_DEPTH = 100;
    public static final boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
} */


//ESTE CODIGO COMPILA SIN PROBLEMAS. JAVA DA POR HECHO QUE TODA VARIABLE DE INTERFAZ ES PUBLIC STATIC FINAL,
//Y SI ESOS MODIFICADORES NO ESTAN ESCRITOS, EL COMPILADOR LOS AGREGA POR SU CUENTA.

//El compilador se encarga de insertar automaticamente public static final en cualquier
//variable de interfaz a la que le falten dichas palabras clave.

//Cabe mencionar tambien que, por convencion, es habitual escribir en mayusculas
//los nombres de las variables que representan constantes dentro de una clase.



//EJEMPLO:
/* public interface CanDig {
    private int MAXIMUM_DEPTH = 100;  // FALLA DE COMPILACION: usa el modificador private, cuando se espera public
    protected abstract boolean UNDERWATER = false;  //FALLA DE COMPILACION: usa protected en vez de public,   Y ADEMAS abstract EN VEZ DE final
    public static String TYPE;   FALLA DE COMPILACION: le falta el valor inicial obligatorio
} */



//En el primer caso, MAXIMUM_DEPTH falla porque usa private, y toda variable de interfaz se asume publica.
//En el segundo caso, UNDERWATER falla por dos motivos: esta marcada como protected,
//lo cual contradice el modificador public implicito, y ademas esta marcada como abstract,
//lo cual contradice el modificador final implicito.

//Por ultimo, TYPE falla porque no se le asigno ningun valor a esa variable public static final.


    }
    //------------------------------------------------------------------------------
    //--- DefaultInterface_Methods()

    public void DefaultInterface_Methods() {
//A partir de Java 8, se incorporó un nuevo tipo de método dentro de las interfaces, llamado método default.

//Un método default es aquel que se define dentro de una interfaz utilizando la palabra clave default, y que sí incluye un cuerpo de implementación.

//Esto lo diferencia de los métodos tradicionales de interfaz, los cuales son abstractos por naturaleza y carecen de cuerpo.

//En esencia, un método default combina la firma de un método abstracto con una implementación ya lista para usar.
//Las clases que implementan la interfaz pueden decidir si sobrescriben ese método o no, sin estar obligadas a ello.
//Si optan por no sobrescribirlo, simplemente se ejecutará la implementación que trae por defecto. Por eso se dice que ESTE TIPO DE MÉTODO ES CONCRETO Y NO ABSTRACTO.



//! RAZÓN DE SER DE LOS MÉTODOS DEFAULT EN LAS INTERFACES:

//Su motivo principal fue facilitar la evolución del código sin romper la compatibilidad con versiones anteriores.
//Supongamos que existe una interfaz usada por decenas o cientos de desarrolladores, y se necesita agregarle una nueva funcionalidad.

//Si simplemente se añade un método nuevo a la interfaz, todas las clases que la implementan dejarían de compilar,
//obligando a cada usuario a modificar su código. Esto podría incluso ser motivo suficiente para descartar el cambio.

//No obstante, si ese nuevo método se define con una implementación por defecto, el código existente sigue funcionando sin cambios,
//y quienes deseen aprovechar la nueva funcionalidad tienen la libertad de sobrescribirla.



//EJEMPLO DE UN MÉTODO DEFAULT EN UNA INTERFAZ :

/* public interface IsWarmBlooded {        //INTERFACE IsWarmBlooded
    boolean hasScales();                //FIRMA DE METODO SIN IMPLEMENTACION hasScales()
    public default double getTemperature() {        //METODO CON CUERPO GRACIAS A DEFAULT  getTemperature()
        return 10.0;        //retorno de un valor de tipo double
    }
} */



//OJO: la palabra default aquí no tiene relación con el modificador de acceso de paquete (package-private).
//Se sigue asumiendo que todos los métodos y variables de una interfaz son públicos.

//Cualquier clase que implemente IsWarmBlooded queda libre de usar tal cual la versión por defecto de getTemperature(),
//o bien definir su propia implementación sobrescribiéndolo.



/*
ESTAS SON LAS REGLAS QUE GOBIERNAN LOS MÉTODOS DEFAULT DENTRO DE UNA INTERFAZ:

* 1. Un método default únicamente puede existir dentro de una interfaz; no está permitido en clases normales ni abstractas.
* 2. Todo método default debe llevar obligatoriamente la palabra clave default.
* Si se marca de esa forma, es indispensable que incluya un cuerpo de método.
* 3. No hay una suposición implícita de que sea estático, final o abstracto, dado que las clases que implementan
* la interfaz pueden tanto usarlo como reemplazarlo.
-------------------
* 4. Igual que el resto de miembros de una interfaz, se da por hecho que un método default es público,
* por lo que declararlo como private o protected impedirá la compilación.
*/




/* public interface Carnivore {
    public default void eatMeat();  // NO COMPILA RAZON: DECLARADO CON DEFAULT PERO SIN CUERPO DE METODO
    public int getRequiredFoodAmount() {  //NO COMPILA RAZON:  TIENE CUERPO DE METODO PERO LE FALTA LA PALABRA DEFAULT
        return 13;
    }
} */

//El método eatMeat() no compila debido a que fue declarado como default sin proporcionarle un cuerpo.
//Por su parte, getRequiredFoodAmount() tampoco compila, ya que cuenta con cuerpo de método pero no fue marcado con default.

        /*
         * Al contrario de lo que ocurre con las variables de interfaz, que se tratan como miembros estáticos,
         * los métodos default no admiten el modificador estático y necesitan de una instancia de la clase implementadora para poder invocarse.

         * Del mismo modo, no pueden declararse como final ni abstract, puesto que su diseño permite —sin exigir— que sean sobrescritos en las clases hijas.

         * Cuando una interfaz hereda de otra que ya contiene un método default, tiene la posibilidad de dejarlo tal cual,
         * en cuyo caso se conserva el comportamiento original heredado.

         * También puede optar por redefinir ese método default siguiendo las reglas habituales de sobrescritura,
         * como no reducir su visibilidad y respetar el uso de tipos de retorno covariantes.

         * Como tercera alternativa, la interfaz puede convertir nuevamente el método en abstracto,
         * forzando así a que cualquier clase que implemente esta nueva interfaz deba definir su propio cuerpo para dicho método.
         * Estas mismas posibilidades aplican igualmente cuando es una clase abstracta la que implementa la interfaz.

         */

// ejemplo, la siguiente clase reemplaza un método default heredado y convierte otro método de la interfaz en abstracto:



/* public interface HasFins {       //interfaz base HasFins
        //metodos con su valor de retorno
    public default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength() {
        return 20.0;
    }
    public default boolean doFinsHaveScales() {
        return true;
    }
}



public interface SharkFamily extends HasFins {        //SharkFamily hereda de HasFins
    public default int getNumberOfFins() {      //redefine el metodo default getNumberOfFins
        return 8;
    }
    public double getLongestFinLength();    //lo redefine pero sin default, por eso ya no lleva cuerpo.
    public boolean doFinsHaveScales() {  //FALLA. YA NO ES DEFAULT PERO SE LE PUSO CUERPO DE METODO.
        return false;
    }
} */

//La interfaz HasFins declara tres métodos default: getNumberOfFins(), getLongestFinLength() y doFinsHaveScales().
//A su vez, SharkFamily hereda de HasFins y reemplaza getNumberOfFins() por una nueva versión que devuelve otro valor.
//Después, SharkFamily transforma getLongestFinLength() en un método abstracto, lo que obliga a cualquier clase
//que implemente SharkFamily a definir explícitamente ese método.

//Por último, SharkFamily intenta redefinir doFinsHaveScales() sin marcarlo como default.
//Como las interfaces solo permiten cuerpos de método en los que llevan la palabra default, esta parte del código no compila.

    }


    //--------
    // DefaultMethods_and_MultipleInheritance
    private void DefaultMethods_and_MultipleInheritance(){

        //JAVA permite que una clase implemente mas que una interfaz al mismo tiempo y ademas incorporo
        //los metodos default en las interfaces.

        //La combinacion de ambas caracteristicas genera, en la practica, situaciones muy similares a las que provoca la herencia multiple. EJM:

        /*
        * public interface Walk (){ // INTERFAZ walk
        *
        *   public default int getSpeed(){
        *   return 5 ;
        * }
        * }
        *
        *  public interface Run {
        *
        *   public default int getSpeed() {
        *   return 10;
        *
        * }
        *
        * }
        *
        *
        * public class Cat implements Walk , Run { FALLA DE COMPILACION
        *   public static void main (String [] args){
        *    System.out.printl(new Cat().getSpeed());
        * }
        *
     * }
        *
        * */


//En este caso puntual, la clase Cat queda con dos implementaciones distintas heredadas para el metodo getSpeed(). ¿cual prevalece?
//Como ni Walk ni Run dependen una de la otra dentro del contexto de Cat, resulta imposible determinar si el resultado seria 5 o 10.
//Lo que sucede en realidad es que no se imprime ningun numero: EL CODIGO SIMPLEMENTE NO LOGRA COMPILAR.
//Siempre que una clase reciba, desde dos interfaces distintas, metodos default identicos en nombre y firma, el compilador detendra el proceso con un error.



//Aun asi, existe una salida para este escenario: si la clase implementadora se encarga de sobrescribir dicho metodo,
//el problema de ambiguedad queda resuelto y el programa compila sin inconvenientes, pues ahora hay una unica version definida. ejercicio a continuacion:

/* public class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());       //AHORA SI COMPILA, DEBIDO A QUE SE DEFINIO UNA IMPLEMENTACION PROPIA QUE ELIMINA LA DUDA
    }
} */
//Toda clase que reciba dos metodos default en conflicto, heredados de interfaces distintas, esta forzada a escribir su propia version del metodo,
//caso contrario el compilador no dejara pasar el codigo. Esta condicion tambien alcanza a las clases abstractas que implementen varias interfaces,
//ya que ese metodo default podria terminar siendo invocado desde algun metodo concreto declarado dentro de la propia clase abstracta.


    }


    //  Static_InterfaceMethods

  public void Static_InterfaceMethods(){
//Desde Java 8, tambien se permite declarar metodos estaticos directamente dentro de una interfaz.
//Estos se identifican mediante la palabra clave static y
//se comportan de forma bastante similar a como funcionan los metodos estaticos dentro de una clase comun.
//En realidad, existe una unica diferencia relevante entre un metodo estatico declarado en una clase y uno declarado en una interfaz.
//Un metodo estatico definido en una interfaz NO PASA A FORMAR PARTE DE LAS CLASES QUE LA IMPLEMENTAN, es decir, no se hereda.


        /*
         * 1. Al igual que el resto de miembros de una interfaz, se asume que este metodo estatico es publico. NO COMPILARÁ si se le coloca private o protected
         * 2. Para invocarlo, es obligatorio anteponer el nombre de la interfaz como referencia.
         */
//EJEMPLO A CONTINUACION DEL CASO:

/* public interface Hop {      //declara la interfaz Hop
    static int getJumpHeight() {     //se considera publico de forma automatica
        return 8;       // retorno de valor tipo int
    }
} */


//El metodo getJumpHeight() se comporta exactamente igual que un metodo estatico comun definido en una clase.
//Es decir, puede invocarse sin necesidad de crear una instancia, usando la sintaxis Hop.getJumpHeight().

//Tambien conviene recordar que el compilador agrega por su cuenta el modificador public,
//dado que todo metodo dentro de una interfaz se considera publico por defecto.


//MUESTRA DE UNA CLASE QUE IMPLEMENTA LA INTERFAZ.

/* public class Bunny implements Hop {  //clase que implementa Hop
    public void printDetails() {
        System.out.println(getJumpHeight()); // ESTO FALLA, PORQUE PARA ACCEDER AL METODO ESTATICO
                                            ES NECESARIO ANTEPONER EL NOMBRE DE LA INTERFAZ SEGUIDO DEL METODO STATIC
    }
} */

      //---------

//Sin colocar explicitamente el nombre de la interfaz antes del metodo, el codigo no compila, aun cuando Bunny implemente Hop.
//Esto confirma que los metodos estaticos de una interfaz no quedan disponibles como herencia en la clase implementadora.

//EJEMPLO  CORREGIDO  Y EXPLICADO  EL PORQUE :

/* public class Bunny implements Hop { / clase que implementa la interfaz Hop

    public void printDetails() {
    // Hop para llamar a  getJumpHeight debe ir siempre primero el nombre de la interfaz
        System.out.println(Hop.getJumpHeight());  //AHORA SI SE HACE REFERENCIA CORRECTA AL NOMBRE DE LA INTERFAZ, POR LO QUE COMPILA.
    }
} */


//Si una clase implementa dos interfaces que declaran metodos estaticos con identica firma, el codigo igual compila sin ningun problema.


    }


}
