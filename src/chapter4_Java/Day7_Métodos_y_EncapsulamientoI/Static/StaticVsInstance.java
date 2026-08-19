package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Static;

public class StaticVsInstance {

    private String name = "instance field";

    public static void first() { }
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
        addGorilla();   // OK
        babyGorilla();  // OK
    }

    // public static void announceBabiesToEveryone() {
    //     addGorilla();   // OK
    //     babyGorilla();  // NO COMPILA: static no puede llamar instance
    // }

    public int total;
    // public static average = total / count; // NO COMPILA: static usando campo de instancia
}

