package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Abstract_And_subClass;
//la subclase concreta ya no esta obligada a implementar de la clase abstracta
// el getName();
public class Lion2  extends  BigCat2{

    public void roar() {    //metodo de BigCat2 abstracto
        System.out.println("The Lion lets out a loud ROAR!");
    }
 //--- recordar

    //1.Las clases abstractas no se pueden instanciar directamente.
    //2. Las clases abstractas pueden definirse con cualquier número —incluido cero— de métodos abstractos y no abstractos.
    //3. Las clases abstractas no pueden marcarse como privadas ni finales.
    //4. Una clase abstracta que hereda de otra clase abstracta hereda todos sus métodos abstractos
    //como si fueran sus propios métodos abstractos.
    //5. La primera clase concreta que hereda de una clase abstracta debe proporcionar una implementación
    //para todos los métodos abstractos heredados.
}
