package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Defining_an_Abstract_Class;

public class DefaultMethodImplementationsInAbstractClasses {

    /*una clase final no puede ser extendida por otra clase. Al marcar una
    clase abstracta como final, se está indicando que la clase nunca
     podrá ser instanciada

     --------  no se puede por el final
    * public final abstract class Tortoise {} // DOES NOT COMPILE
    *--------------

    un método abstracto no puede marcarse como «final» por la misma razón por la que
    una clase abstracta no puede marcarse como «final». Una vez marcado como «final»,
     el método
     ----------------
    *   public abstract class Goat {  //de igual forma el metodo tiene final
         public abstract final void chew(); // DOES NOT COMPILE
           }
    *----------------

        un método no puede marcarse como abstracto y privado a la vez
        ---------
    *       public abstract class Whale {
            private abstract void sing(); // DOES NOT COMPILE
            }
    *
    *---

    *       public class HumpbackWhale extends Whale {
            private void sing() {
            System.out.println("Humpback whale is singing");
            }
        }
        *
        * public abstract class Whale {
             protected abstract void sing();
            }
        *
    *
    * */


}
