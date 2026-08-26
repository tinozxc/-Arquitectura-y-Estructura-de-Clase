package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Abstract_And_subClass;

// clase lion concreta que extiende BigCat  despues Animal
public class Lion extends BigCat {

    // IMPLEMENTA getName() porque es la PRIMERA CLASE CONCRETA  = BigCat


    public String getName() {
        return "Lion";
    }
    // IMPLEMENTA roar() porque es obligatorio de la clase Animal abstracta
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
