package Chapter5_Java.Day11_Interfaces_y_Abstracción.Implementing_Interfaces.Inheriting_An_Interface;
//1. Una interfaz que extiende otra interfaz, así como una clase abstracta que
//implementa una interfaz, hereda todos los métodos abstractos como si fueran sus propios
//métodos abstractos.
//-------------------
//2. La primera clase concreta que implemente una interfaz, o que extienda
// una clase abstracta
//que implemente una interfaz, debe proporcionar una implementación para todos los
//métodos abstractos heredados.

//una interfaz puede heredar todo los metodos abstractos de de la interfaz padre
public interface Seal  extends  HasTail , HasWhiskers{
}
