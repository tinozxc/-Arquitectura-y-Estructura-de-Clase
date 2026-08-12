package Capitulo_1_Java_Building_Blocks.Distinguishing_Between_Object_References_and_Primitives;

public class KeyDiferences {
    // int value = null; // DOES NOT COMPILE
    String s = null; // COMPILA

    String reference = "hello";
    int len = reference.length();
    // int bad = len.length(); // DOES NOT COMPILE
}
