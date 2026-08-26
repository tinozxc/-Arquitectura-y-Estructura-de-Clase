package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Overloading_Methods.primitives;

public class Plane {

    //Java intenta encontrar el mét0do sobrecargado
    //más específico que coincida
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123);  //busca un literal int lo encuentra imprime int
        p.fly(123L); // busca un literal long(L) encuentra e imprime long

    }
}