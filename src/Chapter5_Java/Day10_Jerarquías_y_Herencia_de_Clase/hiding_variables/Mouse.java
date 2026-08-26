package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.hiding_variables;

//    - Las variables NO se sobrescriben (override), solo se OCULTAN (hide)
//    - Cuando ocultas una variable, existen DOS copias en el objeto hijo
//    - La variable que se usa depende de DONDE se hace la referencia
//    - Usar super.variable para acceder a la version del padre

public class Mouse  extends  Rodent {

    protected int tailLength = 8;  // Misma variable, OCULTA a la de Rodent

    public void getMouseDetails() {
        // this.tailLength = variable de Mouse 8
        // super.tailLength = variable de Rodent 4
        System.out.println("tail= " + tailLength + ",parentTail=" + super.tailLength );

    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();

        // Llama al metodo de Rodent - usa variable de Rodent
        mouse.getRodentDetails();  // parentTail=4

        // Llama al metodo de Mouse - usa ambas variables
        mouse.getMouseDetails();   // tail=8,parentTail=4
    }

}
