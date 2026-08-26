package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Static_and_Methods;

public class StaticVsInstance {

    private String name = "instance field";

    public static void first() { } // los metodos no necesitan ser instanciados por la clase
    //para poder ser utilizados
    public static void second() {
        first(); // OK: static llamando static
    }

    public void third() {
        System.out.println(name); // OK: instance usando instance field
        second();                  // OK: instance llamando static
    }

    public static void main(String[] args) {
        first();
        second();
        // third(); // NO COMPILA: static no puede llamar instance sin objeto

        new StaticVsInstance().third(); // OK: a través de una instancia sí se puede
    }

}

class Gorilla {
    public static int count;

    public static void addGorilla() { count++; }  // static + static: OK
    public void babyGorilla() { count++; }          // instance + static: OK

    public void announceBabies() {
        addGorilla();   // OK tod0 bien
        babyGorilla();  // OK tod0 bien
    }

    // public static void announceBabiesToEveryone() {
    //     addGorilla();   // OK
    //     babyGorilla();  // NO COMPILA: static no puede llamar instance
    // }

    public int total;
    // public static average = total / count; // NO COMPILA: static usando campo de instancia
}

