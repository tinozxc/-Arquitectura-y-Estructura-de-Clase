package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Overloading_Methods;

public class Autoboxing {

   // public void fly(Integer numMiles) { }

    //¿que ocurre si tenemos tanto una versión primitiva como una versión entera?

    public void fly(int numMiles) { } // buscara siempre el primitivo
    public void fly(Integer numMiles) { } // hara el autoboxing

    /*
  Java utilizará la versión «int numMiles». Java intenta utilizar la lista de parámetros más específica
que pueda encontrar. Cuando no existe la versión primitiva de tipo «int», realiza un autoboxing.
    * */

}
