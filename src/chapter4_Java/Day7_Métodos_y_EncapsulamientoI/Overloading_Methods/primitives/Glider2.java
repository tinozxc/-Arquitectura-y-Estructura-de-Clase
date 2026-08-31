package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Overloading_Methods.primitives;

public class Glider2 {
    //metodos tipo String diferentes parametros
    public static String glide(String s) { return "1"; }
    public static String glide(String... s) { return "2"; }
    public static String glide(Object o) { return "3"; }
    public static String glide(String s, String t) { return "4"; }

    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));

        //glide("a") — un solo argumento
        //Java busca coincidencia exacta con 1 parámetro String → glide(String s) calza perfecto.
        //Retorna: "1"

        //glide("a", "b") — dos argumentos
        //
        //Java busca coincidencia exacta con 2 parámetros String → glide(String s, String t) calza perfecto.
        //Retorna: "4"

        //glide("a", "b", "c") — tres argumentos
        //Java busca un método con exactamente 3 parámetros String fijos → no existe ninguno.
        //Como último recurso, revisa la versión varargs: glide(String... s) → acepta cualquier cantidad
        //Retorna: "2"
    }
}