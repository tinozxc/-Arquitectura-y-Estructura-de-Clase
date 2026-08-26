package Chapter5_Java.Day11_Interfaces_y_Abstracción.Creating_Abstract_Classes;

//Definen métodos incompletos que los hijos deben implementar
public abstract class Animal {

    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    //metodo por obligacion los hijos deben añadir
    public abstract String getName();

}
