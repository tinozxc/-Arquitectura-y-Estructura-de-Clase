package Chapter1_java.Capitulo_2_Declaring_and_Initializing_Variables.Destroying_Objects;

public class GarbageCollection {

    // GarbageCollection cuando una variable deja de ser apuntado , java elimina ese espacio
    //para ahorrarlo
    public class Scope{
        public static void main(String[] args) {
            String one , two;
            one = new String("a"); // uno tiene valor a
            two = new String("b"); // 2 valor b
            one = two; // uno toma el valor de two que es b
            //! aqui one es para el Garbage Collection ya que no tiene valor
            //"a" -> se pierde y aparece GC
            String three = one; // tambien three ya que one anteriormente toma el valor de b
            one = null; // ahora es valor nulo si en caso alguna variable como three volviera a guardar one
            //seria null

        }
    }

}
