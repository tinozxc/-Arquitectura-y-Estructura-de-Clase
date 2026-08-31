package Chapter1_java.Capitulo_2_Declaring_and_Initializing_Variables.Declaring_Multiple_variable;

public class DeclaringMultiplesVariables {

    public static void main(String[] args) {
        String s1 , s2;
        String s3 = "yes" , s4 = "no"; // doble declaracion en una sola linea

        // parece que tiene 3 valores cuando solo i3 esta declarado y asignado su valor
        int i1, i2 , i3 = 0;

        // int num , String value; // DOES NOT COMPILE ambos tipos de valores son diferentes
        // para estar en una sola linea de codigo

        /* declraciones legales , valida para compilar */

        boolean b1 , b2;
        // String s1 = "1" , s2;
        // double d1 , double d2;
        // int i1; int i2;
        //  int i3; i4;

        /*
        int i1;
        int i2;
        int i3; */
        // i4; // DOES NOT COMPILE no
        // tiene el tipo de dato int ademas le separa del ; seria nueva linea codigo


    }

}
