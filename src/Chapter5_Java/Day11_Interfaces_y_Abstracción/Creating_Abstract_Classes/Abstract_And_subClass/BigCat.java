package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes.Abstract_And_subClass;

// clase BigCat asbtracta que extiende de animal
public abstract class BigCat extends Animal {

    public abstract void roar(); // Nuevo metodo abstracto
    // NO implementa getName() - esto es permitido porque BigCat es abstracta
    // La clase abstracta NO esta obligada a implementar metodos abstractos del padre


}
