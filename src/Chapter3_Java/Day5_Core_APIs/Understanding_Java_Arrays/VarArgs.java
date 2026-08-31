package Chapter3_Java.Day5_Core_APIs.Understanding_Java_Arrays;

//Cuando creas un array tú mismo, tiene el aspecto que hemos visto hasta ahora.
// Cuando se pasa uno a tu método, puede tener otro aspecto. Aquí tienes
//  tres ejemplos con un método main()
public class VarArgs {

    // Las tres formas siguientes son EQUIVALENTES para Java
    public static void main(String[] args) {
        // public static void main(String args[])   // misma firma, corchete en otro lugar
        // public static void main(String... args)  // varargs

        System.out.println(args.length); // legal, se comporta como un array normal
        if (args.length > 0) {
            System.out.println(args[0]); // legal, acceso por índice normal
        } else {
            System.out.println("Sin argumentos");
        }
    }

}
