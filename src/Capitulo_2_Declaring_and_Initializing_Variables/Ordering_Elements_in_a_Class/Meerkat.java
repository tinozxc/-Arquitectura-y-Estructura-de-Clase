package Capitulo_2_Declaring_and_Initializing_Variables.Ordering_Elements_in_a_Class;

//package structure // package must be first non-comment
import java.util.*; // import must come after package
public class Meerkat {
    double weight; // fields and methods can go in either orders
    public double getWeight(){
        return weight;
        // double height; // another field - they don't need to be together;
    }

    /* header */
    // package structure
    // class Meerkat
    // public class Meerkat{}

    /*comments anywhere and imports are optional . In the next example , we have a problem*/

    // import java.util.*;
    // package structure; // DOES NOT COMPILE paquete al reeves
    //String name; // DOES NOT COMPILE
    // public class Meerkat {}

    /*Orden */
    //public class Meerkat(){}
    // class Paw {}

}
