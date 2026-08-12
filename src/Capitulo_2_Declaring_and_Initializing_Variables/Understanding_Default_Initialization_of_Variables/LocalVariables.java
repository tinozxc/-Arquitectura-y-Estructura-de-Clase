package Capitulo_2_Declaring_and_Initializing_Variables.Understanding_Default_Initialization_of_Variables;

public class LocalVariables {

    public int notValid(){
        int y = 10;
        int x ;
        int reply = x + y; // Does NOT COMPILE; valor no declarado
        return reply;
    }

}
