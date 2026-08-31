package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Overloading_Methods;

public class MethodsValids {

    // validaciones de metodos como son escritas
    public void fly(int numMiles) { }  // valido
    public void fly(short numFeet) { }  // igualmente valido tipo de dato
    public boolean fly() { return false; } // valido boolean con tipo de retorno
    void fly(int numMiles, short numFeet) { } // valido sin public igual es aceptado
    public void fly(short numFeet, int numMiles) throws Exception { } // t0do junto con una exception

   // 2da

    public void fly1(int numMiles) { }
 //   public int fly2(int numMiles) {  } //DOES NOT COMPILE, razon no retorna el valor del parametro


    //----------
  /*
    public void fly(int numMiles) { }
    public static void fly(int numMiles) { } // DOES NOT COMPILE
    //problema el mismo nombre igual  ,la diferencia es una instancia es metodo
    // y la otra es un metodo statico

*/
    /* ----------------
    * la lista de parámetros es la misma ,la diferencia es que uno es un
    * método de instancia  y el otro es un método estático.
   Solo tienes que escribir el  código y Java llama al método adecuado
    * */
    /*
    public void fly(int numMiles) {
        System.out.println("short");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }
    */
}
