package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Distinguishing_Between_Object_References_and_Primitives;

public class PrimitiveTypes {
    // valores aceptados
   boolean type = true | false;
   byte type1 = 123;
   short type2 = 123;
   int type3 = 123;
   float type4 = 123.45f ;
   double type5 = 123.456;
   char type6 = 'a';

   // cual es numero maximo de un pues con esto
    //System.out.printl(Integer.MAX.VALUE);

    // long maximo
    //long max = 3123456789; // NO COMPILA
    long max = 3123456789L; // ahora sabe que es un Long

    //CONVERTIR A devuelta  a BINARIO

    //System.out.println(56); // 56
    //System.out.println(0b11); //3
    //System.out.println(017); // 15
    //System.out.println(0x1F); // 31

    //facil de leer
    int million1 = 1000000;
    int million2 = 1_000_000;


    // ahora para los dobles

    // double notAtStart = _1000.00; // DOES NOT COMPILE
    // double notAtEnd = 1000.00_; // DOES NOT COMPILE
    // double notByDecimal = 1000_.00 ; // DOES NOT COMPILE
    double annoyngButLegal =1_00_0.0_0 ; // this one compile



}
