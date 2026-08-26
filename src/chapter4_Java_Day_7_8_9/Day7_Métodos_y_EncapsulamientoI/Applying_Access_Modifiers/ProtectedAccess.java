package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Applying_Access_Modifiers;

public class ProtectedAccess {

    /*
    package pond.shore;
public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
}

Gosling.java (subclase, otro paquete) — accede por herencia, sin usar variable:

java
package pond.goose;
import pond.shore.Bird;
public class Gosling extends Bird {
    public void swim() {
        floatInWater();          // OK: por herencia
        System.out.println(text); // OK: por herencia
    }
}

BirdWatcher.java (mismo paquete que Bird, NO es subclase) — accede por paquete:

java
package pond.shore; // mismo paquete
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();           // OK: mismo paquete
        System.out.println(bird.text); // OK: mismo paquete
    }
}

BirdWatcherFromAfar.java (otro paquete, NO es subclase) — no compila:

java
package pond.inland;
import pond.shore.Bird;
public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        // bird.floatInWater();  // NO COMPILA
    }
}

El "gotcha" — Swan.java (subclase en otro paquete):

java
public class Swan extends Bird {
    public void swim() {
        floatInWater();  // OK: SIN variable -> usa la herencia directamente
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // OK: la VARIABLE es de tipo Swan (subclase)
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        // other.floatInWater(); // NO COMPILA: la VARIABLE es de tipo Bird
    }
}


    *
     */


}
