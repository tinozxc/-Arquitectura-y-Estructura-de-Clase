package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Designing_Methods;

public class AccessModifiers {

    public void walk1() {}   // public: se puede llamar desde cualquier clase
    void walk4() {}          // default (package-private): sin modificador, se omite

    // default void walk2() {}      // NO COMPILA: "default" no es un modificador de acceso válido
    // void public walk3() {}       // NO COMPILA: el modificador debe ir ANTES del tipo de retorno

    private void walk5() {}   // private: solo se puede llamar desde la misma clase
    protected void walk6() {} // protected: mismo paquete o subclases

}
