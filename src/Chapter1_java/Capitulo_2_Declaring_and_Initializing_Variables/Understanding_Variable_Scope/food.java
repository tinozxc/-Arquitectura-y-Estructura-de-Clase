package Chapter1_java.Capitulo_2_Declaring_and_Initializing_Variables.Understanding_Variable_Scope;

public class food {

    public void eat(int pieceOfCheese){
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry){
        if(hungry){
            int bitesOfCheese = 1;
        }
    } // bitesOfCheese goes out of scope here

    // System.out.printl(bitesOfCheese); // DOES NOT COMPILE
}
