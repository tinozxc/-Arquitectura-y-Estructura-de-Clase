package chapter4_Java_Day_7_8_9.Day7_Métodos_y_EncapsulamientoI.Overloading_Methods;

public class ReferenceTypes {

 //metodos con respuestas diferentes
        public void fly(String s) {
            System.out.print("string ");
        }
        public void fly(Object o) {
            System.out.print("object ");
        }
        public static void main(String[] args) {
            ReferenceTypes r = new ReferenceTypes();  //crea una instacia de la clase
            r.fly("test"); //lama primero a string
            r.fly(56); // aqui se realiza un autoboxing hasta llegar a int
            // pasa a integer despues a Object
        }

}
