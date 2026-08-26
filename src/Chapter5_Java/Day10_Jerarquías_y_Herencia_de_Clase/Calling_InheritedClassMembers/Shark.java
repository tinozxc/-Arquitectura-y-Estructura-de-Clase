package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Calling_InheritedClassMembers;

//clase padre
class Fish {
    protected  int size;  //acceso entre paquetes
    private int age;   // solo la clase misma acceso

   //constructor
    public Fish(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }  //metodo para obtener la variable privado

}

public class Shark extends  Fish {
    private int numberOfFins = 8;


    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        // getAge() es público en Fish -> accesible sin problema
        System.out.print("Shark with age: " + getAge());
        // size es protected en Fish -> accesible directamente
        System.out.print(" and " + size + " meters long");
        // numberOfFins es un miembro propio de Shark
        System.out.print(" with " + numberOfFins + " fins");
    }

    //puedes usar el this para acceder a las variables
    public void displaySharkDetails1() {
        System.out.print("Shark with age: "+this.getAge());
        System.out.print(" and "+this.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }
        //puedes usar el super, padre para acceder a las variables
    public void displaySharkDetails2() {
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }

}
