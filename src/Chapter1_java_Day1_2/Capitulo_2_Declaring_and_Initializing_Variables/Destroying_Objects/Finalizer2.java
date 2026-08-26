package Chapter1_java_Day1_2.Capitulo_2_Declaring_and_Initializing_Variables.Destroying_Objects;

import java.util.ArrayList;
import java.util.List;

public class Finalizer2 {

    private static List objects = new ArrayList();
    protected  void finalize(){
        objects.add(this); // no hagas esto
    }
}
