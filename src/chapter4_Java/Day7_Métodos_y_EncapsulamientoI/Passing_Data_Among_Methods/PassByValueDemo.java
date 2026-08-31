package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Passing_Data_Among_Methods;

/*
 * Java SIEMPRE usa pass-by-value (pasa por valor)
 * - Para primitivos: se pasa una COPIA del valor
 * - Para objetos: se pasa una COPIA de la REFERENCIA
 */
public class PassByValueDemo {

    public static void main(String[] args) {
        int num = 4;
        newNumber(5);  //llama al metodo estatico newNumber con un valor de parametro 5
        System.out.println(num); // 4
    }
    // Al igual que en el ejemplo anterior, la asignación de la variable se realiza
    //únicamente al parámetro del mét0do y no afecta a la función que lo invoca

    public static void newNumber(int num) {
        num = 8;
    }

    /*
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name); // se mantiene webby al igual que anteriormnete no cambia
        // ya que se mantiene porque no se le asigna ningun valor
    }
    public static void speak(String name) {
        name = "Sparky";
    }
     */

/*
 aplica para strinBuilder

 Aquí la salida es Webby, porque el mét0do solo llama a un mét0do sobre el parámetro
 — no reasigna name a un objeto diferente. s es una copia de la variable name.
 Ambos apuntan al mismo objeto StringBuilder, los cambios
 hechos al StringBuilder están disponibles para ambas referencias.

public static void main(String[] args) {
    StringBuilder name = new StringBuilder();
    speak(name);
    System.out.println(name); // Webby
}
public static void speak(StringBuilder s) {
    s.append("Webby");
}

    */

}
