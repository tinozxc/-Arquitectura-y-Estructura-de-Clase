package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Designing_Methods;

public class OptionalSpecifiers {

    public void walk1() {}                    // OK: sin especificador opcional
    public final void walk2() {}               // OK: final como especificador
    public static final void walk3() {}         // OK: static + final, el orden entre ellos no importa
    public final static void walk4() {}          // OK: mismo resultado que walk3, orden invertido

    // public modifier void walk5() {}          // NO COMPILA: "modifier" no es un especificador válido
    // public void final walk6() {}             // NO COMPILA: el especificador va ANTES del tipo de retorno

    final public void walk7() {}                // OK (caso raro): el especificador puede ir ANTES del modificador de acceso

}
