package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Distinguishing_Between_Object_References_and_Primitives;

/*
A diferencia de los tipos primitivos, que almacenan
sus valores en la memoria donde se asigna la variable, las referencias no almacenan el valor
del objeto al que hacen referencia. En su lugar, una referencia «apunta» a un objeto
almacenando la dirección de memoria
donde se encuentra dicho objeto, un concepto conocido como puntero
 */
public class ReferenceTypes {
    java.util.Date today;
    String greeting;

   // today = new java.util.Date(); // NO COMPILA no usa el tipo de dato adecuado que seria Date
   // greeting = "how are you"; // COMPILA
}
