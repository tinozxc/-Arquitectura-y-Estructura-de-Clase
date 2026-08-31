package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.Herencia;

// ...pero el compilador de Java, POR DETRÁS, la convierte automáticamente en esto:
public class ZooEquivalente extends java.lang.Object {
}

// Ambas definiciones son EXACTAMENTE equivalentes.
// Java SIEMPRE inserta "extends java.lang.Object" de forma implícita
// cuando una clase no extiende ninguna otra clase.