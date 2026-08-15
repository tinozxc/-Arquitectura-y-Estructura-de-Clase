package Chapter1_java.Capitulo_2_Declaring_and_Initializing_Variables.Destroying_Objects;

public class GarbageCollection {

    public class Scope{
        public static void main(String[] args) {
            String one , two;
            one = new String("a"); // uno tiene valor a
            two = new String("b"); // 2 valor b
            one = two; // uno toma el valor de two que es b
            String three = one; // tambien three ya que one anteriormente toma el valor de b
            one = null; // ahora es valor nulo si en caso alguna variable como three volviera a guardar one
            //seria null

        }
    }

}
