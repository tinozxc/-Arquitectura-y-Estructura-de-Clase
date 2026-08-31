package chapter4_Java.day8_9_Constructores_Lambdas.Creating_Constructors;


//Sobrecarga de constructores y el uso del this
public class OverloadingConstructors {

   class Hamster{

       private String color;
       private int weight;

       public Hamster(int weight) { // primer constructor
           this.weight = weight;
           color = "brown";
       }
       public Hamster(int weight, String color) { // segundo constructor
           this.weight = weight;
           this.color = color;
       }
      // Qué ocurre si
      // añadimos «new» antes del nombre del constructor?

    //   public Hamster(int weight) {
    //      new Hamster(weight, "brown"); // DOES NOT COMPILE

           // Compila pero crea objeto extra
           // No establece los valores en el objeto actual

       //SOLUCION USAR this = como si fuera un método, Java invoca otro constructor
       // sobre la misma instancia de la clase


       //      public Hamster(int weight) {
       //    this(weight, "brown");
      //  }

       /* regla importante al usar this --

       public Hamster(int weight) {
           System.out.println("in constructor");
            // ready to call this
            this(weight, "brown"); // DOES NOT COMPILE tiene que ir siempre primero
            }
        */
       }




}
