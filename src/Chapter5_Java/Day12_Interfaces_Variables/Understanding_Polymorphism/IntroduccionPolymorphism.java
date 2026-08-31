package Chapter5_Java.Day12_Interfaces_Variables.Understanding_Polymorphism;

public class IntroduccionPolymorphism {

    public void polymorphism() {

//Java permite el uso del polimorfismo, es decir, la capacidad que tiene un objeto de comportarse de multiples formas distintas.
//Dicho con mayor precision, un objeto en Java puede ser accedido a traves de una referencia del mismo tipo que el objeto,
//una referencia correspondiente a alguna superclase del objeto, o una referencia que apunte a una interfaz que el objeto
//implemente, ya sea de forma directa o a traves de una superclase.
//Ademas, no es necesario aplicar un casteo cuando el objeto se reasigna hacia un supertipo o hacia una interfaz que le corresponde.
//Veamos esta propiedad del polimorfismo con el siguiente ejemplo:

/* public class Primate {
    public boolean hasHair() {              //metodo propio de la clase Primate
        return true;
    }
}


public interface HasTail {
    public boolean isTailStriped();         //metodo abstracto que define el contrato de la interfaz
}


public class Lemur extends Primate implements HasTail {   //Lemur hereda de Primate e implementa HasTail
    public boolean isTailStriped() {        //implementacion obligatoria del metodo de la interfaz
        return false;
    }

    public int age = 10;    //variable exclusiva de la clase Lemur, no pertenece a Primate ni a HasTail


    public static void main(String[] args) {
        Lemur lemur = new Lemur();              //se crea UN SOLO objeto de tipo Lemur
        System.out.println(lemur.age);        //accede sin problema porque la referencia es del tipo real del objeto (Lemur)
        HasTail hasTail = lemur;               //el mismo objeto ahora se referencia como HasTail (upcast implicito, sin cast)
        System.out.println(hasTail.isTailStriped());   //solo puede ver lo declarado en la interfaz HasTail
        Primate primate = lemur;                //el mismo objeto ahora se referencia como Primate (upcast implicito, sin cast)
        System.out.println(primate.hasHair());          //solo puede ver lo declarado en la clase Primate
    }

} */


//Este codigo compila y se ejecuta sin ningun inconveniente, generando como salida:
// 10        viene de lemur.age
// false     viene de hasTail.isTailStriped()
// true      viene de primate.hasHair()


//Lo mas relevante de este ejemplo es que en realidad solo se crea y se referencia UN UNICO OBJETO, de tipo Lemur.
//El hecho de que una instancia de Lemur pueda pasarse tanto como una instancia de la interfaz que implementa, HasTail,
//asi como una instancia de una de sus superclases, Primate, es precisamente la esencia del polimorfismo.

//Una vez que al objeto se le asigna un nuevo tipo de referencia, unicamente quedan disponibles, sin necesidad de casteo explicito,
//los metodos y variables que pertenecen a ese tipo de referencia en particular.
//Por ejemplo, los siguientes fragmentos de codigo no lograran compilar:



/* HasTail hasTail = lemur;
System.out.println(hasTail.age); // FALLA: la variable age no existe dentro del "mundo" de la interfaz HasTail,
                                    aunque el objeto real (Lemur) si la tenga

Primate primate = lemur;
System.out.println(primate.isTailStriped()); // FALLA: el metodo isTailStriped() no esta declarado en Primate,
                                                solo la referencia Lemur o HasTail puede acceder a el */



//En este caso, la referencia hasTail unicamente tiene acceso directo a los metodos declarados dentro de la interfaz HasTail;
//por lo tanto, no reconoce que la variable age forma parte del objeto.
//De manera similar, la referencia primate solo tiene acceso a los metodos definidos en la clase Primate,
//y no cuenta con acceso directo al metodo isTailStriped().


    }

    // Object vs reference

    public void Object_vs_Reference(){
 //En el lenguaje Java, el acceso a los objetos siempre se realiza por medio de referencias; nunca se manipula
//el objeto de forma directa. Aun asi, resulta util imaginar al objeto como algo que efectivamente
//reside en la memoria, reservado alli por la maquina virtual de Java (JVM) en tiempo de ejecucion.
//Sin importar que tipo de referencia se utilice para apuntar hacia el, el objeto almacenado en memoria permanece igual.
//Un caso claro de esto es que, como toda clase hereda de java.lang.Object, cualquier objeto puede
//reasignarse a una referencia de ese tipo, tal como se muestra a continuacion:

/* Lemur lemur = new Lemur();
Object lemurAsObject = lemur; */

//Pese a que el objeto Lemur ahora cuenta con una referencia de tipo diferente, dicho objeto continua
//existiendo en memoria exactamente como un Lemur, sin sufrir ningun cambio interno.
//Lo que en verdad se modifico fue la posibilidad de invocar los metodos propios de Lemur
//desde la referencia lemurAsObject.


//Todo esto puede condensarse en dos reglas clave:
// 1. EL TIPO DEL OBJETO establece que caracteristicas posee realmente en la memoria.
// 2. EL TIPO DE LA REFERENCIA establece a que metodos y variables puede acceder el programa.

//A partir de esto se entiende que, al cambiar la referencia de un objeto hacia otro tipo,
//podria recuperarse el acceso a ciertas caracteristicas adicionales, el cambio de referencia
//no las genera, solamente modifica la visibilidad que se tiene sobre ellas.

//sin importar si se usa la referencia lemur, hasTail o primate,
//en la memoria continua existiendo un unico objeto compartido entre las tres.
//Segun el tipo de referencia empleado, el acceso quedara restringido a determinados metodos y variables.
//Asi, la referencia hasTail permite invocar el metodo isTailStriped(), pero no da acceso
//a la variable age, aunque esta si pertenezca a la clase Lemur.

    }



    // Casteo de Objectos

    public void CastingObjects(){

 //Antes creamos un unico objeto Lemur y lo accedimos mediante referencias de superclase e interfaz.
//al cambiar el tipo de referencia, perdimos acceso a metodos mas especificos de la subclase,
//aunque siguen existiendo dentro del objeto. Se pueden recuperar haciendo casteo hacia la subclase original:


/* Primate primate = lemur;
Lemur lemur2 = primate; // FALLA: downcast sin casteo explicito

Lemur lemur3 = (Lemur)primate;         // COMPILA: casteo explicito aplicado
System.out.println(lemur3.age);        // se recupera acceso a "age" */

//Reglas basicas de casteo:
// 1. Subclase  =  superclase: NO requiere casteo explicito.
// 2. Superclase  =   subclase: SI requiere casteo explicito.
// 3. No se permite castear entre tipos sin relacion.
// 4. Aunque compile, puede lanzar excepcion en runtime si el objeto no es realmente de esa clase.



//Ejemplo de tipos sin relacion (falla en compilacion):

/* public class Bird {}
public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = (Bird)fish; // ERROR AL COMPILAR: Fish y Bird no tienen jerarquia en comun
    }
} */



//Ejemplo de casteo valido en compilacion pero invalido en runtime:
        // IMPORTANTE

/* public class Rodent { }
public class Capybara extends Rodent { //clase  Capybara
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara)rodent; // ClassCastException en runtime
    }
} */

//Compila porque Capybara es subclase de Rodent, pero el objeto real nunca fue un Capybara.

    }



     // Virtual metodos
    public void VirtualMethods(){

//Un metodo virtual es aquel cuya implementacion especifica no se determina hasta el momento de ejecucion (runtime).
//De hecho, todo metodo en Java que no sea final, static ni private se considera virtual,
//ya que cualquiera de ellos puede ser sobrescrito en tiempo de ejecucion.
//Lo que hace especial a un metodo virtual en Java es que, si se invoca un metodo sobre un objeto
//que lo sobrescribe, se ejecuta la version sobrescrita, incluso si la llamada se hace mediante
//una referencia de la clase padre o desde dentro de la clase padre.

/* public class Bird {      //clase Bird
    public String getName() {      //version base definida en la superclase
        return "Unknown";
    }
    public void displayInformation() {  //metodo que imprimira una respuesta
        System.out.println("The bird name is: "+getName()); //invoca getName(), pero cual version se ejecuta se define en runtime
    }
}


public class Peacock extends Bird {
    public String getName() {     //sobrescribe el metodo de Bird
        return "Peacock";
    }
    public static void main(String[] args) {
        Bird bird = new Peacock();          //referencia de tipo Bird, pero el objeto real es Peacock
        bird.displayInformation();          //se ejecuta displayInformation() de Bird, pero getName() usa la version de Peacock
    }
} */


//Este codigo compila  mostrando como salida:
// The bird name is: Peacock


//getName() fue redefinido en la clase hija Peacock. Lo mas relevante aqui es que, dentro de displayInformation(),
//la llamada a getName() en tiempo de ejecucion termina resolviendose con la implementacion
//definida en la subclase Peacock, no con la de Bird.
//aunque la clase padre Bird define su propia version de getName() y no tiene ningun
//conocimiento de la clase Peacock durante la compilacion, en runtime la instancia utiliza
//la version sobrescrita, segun corresponda al objeto real.

//La esencia del polimorfismo es que un objeto puede comportarse de muchas formas distintas.
//Al combinar polimorfismo con sobrescritura de metodos, se entiende que un objeto puede
//interpretarse de maneras muy diferentes en runtime.

    }




    // parametros polymorphics
    public void PolymorphicParameters(){

//Una de las aplicaciones mas utiles del polimorfismo es la posibilidad de pasar instancias
//de una subclase o de una interfaz como argumento de un metodo.
// Por ejemplo, se puede definir
//un metodo que reciba como parametro una instancia de una interfaz, de modo que cualquier clase
//que implemente dicha interfaz pueda ser enviada a ese metodo

//Como en este caso se convierte de un subtipo hacia un supertipo, no hace falta un casteo explicito.
// esta propiedad se le conoce como parametros polimorficos de un metodo, y se demuestra a continuacion:

/* public class Reptile {
    public String getName() {
        return "Reptile";
    }
}

public class Alligator extends Reptile {
    public String getName() {
        return "Alligator";                //sobrescribe el metodo de la superclase
    }
}

public class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";                //sobrescribe el metodo de la superclase
    }
}

public class ZooWorker {
    public static void feed(Reptile reptile) {   //acepta cualquier subtipo de Reptile
        System.out.println("Feeding reptile " +reptile.getName());
    }
    public static void main(String[] args) {
        feed(new Alligator());     //valido y correcto , Alligator es subclase de Reptile
        feed(new Crocodile());     //valido y correcto , Crocodile es subclase de Reptile
        feed(new Reptile());       //valido y correcto  , coincide exactamente con el tipo del parametro
    }
} */



//Este codigo compila y se ejecuta correctamente, generando la siguiente salida:
// Feeding: Alligator
// Feeding: Crocodile
// Feeding: Reptile


// el metodo feed(Reptile reptile) ,  este metodo pudo recibir
//sin problema instancias de Alligator y Crocodile, ya que ambas son subclases de Reptile.
// ademas acepto una instancia exacta del tipo Reptile.

//Si hubiera intentado pasar una clase sin relacion alguna, como las ya vistas anteriormente Rodent o Capybara,
//o incluso una superclase como java.lang.Object, el codigo simplemente no habria compilado.


        //Polymorphic Parameters  y codigo reutilizable

//Cuando se define un metodo que sera accesible fuera de la clase actual ya sea para subclases
//o de forma publica hacia otros objetos- es una buena practica usar como tipo de parametro
//la superclase o interfaz correspondiente.

// existen muchas clases que implementan java.util.List, como java.util.ArrayList y java.util.Vector,
//al pasar una lista existente normalmente no interesa la subclase concreta que se este usando.
//Por eso, un metodo que reciba una List deberia declarar su parametro con el tipo interfaz
//java.util.List, en lugar de una clase especifica que la implemente, ya que de esta manera el codigo
//en vez del tipo de clase, para lograr mayor reutilizacion a continuacion un detalle:

        /* java.util.List list = new java.util.ArrayList(); */

    }



    // Polymorphism_and_Method_Overriding

    public void Polymorphism_and_Method_Overriding(){

 /*//  retomando tres reglas de la sobrescritura de metodos, necesarias justamente

    //polimorfismo. Sin ellas, seria facil crear contradicciones en el codigo ,fallas.
    */

        //REGLA 1: la version sobrescrita no puede tener MENOS visibilidad que la original.
    /* public class Animal {
        public String getName() {
            return "Animal";
        }
    }


    public class Gorilla extends Animal {
        protected String getName() { // NO COMPILA: baja la visibilidad de public a protected
            return "Gorilla";
        }
    }


    public class ZooKeeper {
        public static void main(String[] args) {
            Animal animal = new Gorilla();          //referencia Animal, objeto real Gorilla
            System.out.println(animal.getName());   //se espera acceso valido, es public en Animal
        }
    } */
    /*

    //Si esto compilara, la referencia animal.getName() deberia funcionar (es public en Animal),
    //pero el objeto real tiene una version protected, no accesible desde ZooKeeper. Contradiccion.
    //Java lo evita: no se permite reducir la visibilidad al sobrescribir.
    */



        //REGLA 2: no se pueden agregar ni ampliar excepciones checked al sobrescribir.
    /*
    //Si la subclase pudiera lanzar una excepcion checked nueva, el codigo que usa una referencia
    //de la superclase no tendria forma de saber que debe manejarla. Por eso queda prohibido.
    */



        //REGLA 3: el tipo de retorno debe ser covariante (igual o mas especifico).
    /*
    //Si el padre retorna Double y el hijo sobrescribe retornando Number, el hijo podria devolver
    //un Integer (tambien Number). Usando una referencia Double se esperaria un Double, pero llegaria
    //un Integer, generando un error de casteo al usarlo. Por eso solo se permiten retornos covariantes.
    */


    }


}
