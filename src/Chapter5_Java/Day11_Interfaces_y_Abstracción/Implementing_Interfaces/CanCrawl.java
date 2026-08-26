package Chapter5_Java.Day11_Interfaces_y_Abstracción.Implementing_Interfaces;

//interfaz
public interface CanCrawl {

     //modificadores de acceso
    //un metodo no puede ser privado en una interfaz
    private void dig(int depth); // DOES NOT COMPILE

    //no se permite tambien protected
    protected abstract double depth(); // DOES NOT COMPILE

    //tambien no debe llevar final en un metodo de interfaz
    public final void surface(); // DOES NOT COMPILE

}
