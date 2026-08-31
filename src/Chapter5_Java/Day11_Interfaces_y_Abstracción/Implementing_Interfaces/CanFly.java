package Chapter5_Java.Day11_Interfaces_y_Abstracción.Implementing_Interfaces;

//interfaz contrato que uno debe seguir cuando se implementa
public interface CanFly {

    //los metodos son sin llaves {} importante eso
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();

}
