package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.InheritingMethods;

public class Wolf extends  Canine {

    // Sobrescribe el metodo del padre
    public double getAverageWeight() {
        // super.getAverageWeight() llama al metodo del padre (50)
        // Luego le suma 20
        return super.getAverageWeight() + 20;

        //super es OBLIGATORIO cuando quieres llamar al metodo
        //del padre desde un metodo sobrescrito
    }

    public static void main(String[] args) {
        // Crear objeto Canine y llamar a su metodo
        System.out.println(new Canine().getAverageWeight());  // 50.0

        // Crear objeto Wolf y llamar a su metodo sobrescrito
        System.out.println(new Wolf().getAverageWeight());    // 70.0
    }

}
