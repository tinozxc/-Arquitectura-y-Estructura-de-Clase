package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Abstract_And_subClass;

//si una clase abstracta intermedia proporciona dicha implmentacion
public abstract class BigCat2  extends Animal2{

    // aqui ya no es obligatorio para la siguiente clase
    // poner el metodo getName
    public String getName() {
        return "BigCat";
    }
    //este si es obligatorio
    public abstract void roar();
}
