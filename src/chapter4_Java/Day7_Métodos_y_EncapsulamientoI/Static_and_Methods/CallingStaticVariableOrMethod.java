package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Static_and_Methods;

public class CallingStaticVariableOrMethod {


    public static void main(String[] args) {
        // ---- Forma normal: usar el nombre de la CLASE ----
        System.out.println(Koala.count); // 0 -> valor inicial default de int

        // ---- Acceso a static a través de una INSTANCIA ----
        Koala k = new Koala();
        System.out.println(k.count); // 0 -> Java usa el TIPO de la referencia, no el objeto

        k = null;
        System.out.println(k.count); // 0 -> SIGUE funcionando, aunque k sea null

        // ---- Solo existe UN count, compartido por todos ----
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); // 5 -> última asignación gana
    }
}

class Koala {
    static int count = 0;
}
