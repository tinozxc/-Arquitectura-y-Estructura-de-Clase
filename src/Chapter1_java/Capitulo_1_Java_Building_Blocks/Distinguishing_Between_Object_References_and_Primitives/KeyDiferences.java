package Chapter1_java.Capitulo_1_Java_Building_Blocks.Distinguishing_Between_Object_References_and_Primitives;

/*
Hay algunas diferencias importantes que debes conocer entre los tipos primitivos
y los tipos de referencia. En primer lugar, a los tipos de referencia se les
 puede asignar el valor null, lo que significa que, en ese momento, no hacen referencia
a ningún objeto. Los tipos primitivos te darán un error de compilación si intentas asignarles
 */
public class KeyDiferences {
    // int value = null; // DOES NOT COMPILE
    String s = null; // COMPILA

    String reference = "hello";
    int len = reference.length();
    // int bad = len.length(); // DOES NOT COMPILE
    //No existen métodos en «len» porque es un tipo primitivo int.
    // Los tipos primitivos no tienen métodos.

}
