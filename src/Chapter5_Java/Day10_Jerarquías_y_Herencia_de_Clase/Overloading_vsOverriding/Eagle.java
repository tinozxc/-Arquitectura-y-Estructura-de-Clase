package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Overloading_vsOverriding;

public class Eagle extends Bird {

    //diferentes  void , int , ademas 1 parametro adicional
    public int fly(int height) {
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }

    /*
    //  ERROR: retorno diferente , int , void , usan ambos parametros , es igual
    public int eat(int food) { // DOES NOT COMPILE
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }
    */
}
