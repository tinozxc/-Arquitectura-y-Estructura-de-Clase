package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Overriding_vs_Hiding_Methods;

public class Kangaroo extends Marsupial {
    // Mismo metodo static , oculta al de Marsupial
    public static boolean isBiped() {
        return true;
    }

    // Metodo de instancia del hijo
    public void getKangarooDescription() {
        // Este metodo pertenece a Kangaroo
        // Cuando llama a isBiped(), usa la version de Kangaroo true
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();

        // Llama al metodo de Marsupial (clase padre)
        // Usa isBiped() de Marsupial porque el metodo es de la clase padre
        joey.getMarsupialDescription();  //  false

        // Llama al metodo de Kangaroo (clase hija)
        // Usa isBiped() de Kangaroo porque el metodo es de la clase hija
        joey.getKangarooDescription();   //  true
    }


}
