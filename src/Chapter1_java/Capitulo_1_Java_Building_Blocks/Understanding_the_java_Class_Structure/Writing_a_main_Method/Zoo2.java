package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_the_java_Class_Structure.Writing_a_main_Method;

//clase Zoo2
public class Zoo2 {

    public static void main(String[] args) {

        // fallara el codigo no tiene declarado args algun valor
        System.out.println(args[0]);
        System.out.println(args[1]);

        //Comandos a ejecutar por medio de terminal(bash)

        // $ java Zoo.java   este es el java ejecutor  de la clase compilado usando JVM
        // java Zoo Bronx Zoo
        // $javac Zoo.java y este es el java copilador y genera el archivo .class
        // $ java Zoo "San diego Zoo"
    }
}


