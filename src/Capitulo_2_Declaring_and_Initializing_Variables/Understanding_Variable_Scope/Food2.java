package Capitulo_2_Declaring_and_Initializing_Variables.Understanding_Variable_Scope;

public class Food2 {

    public void eatIfHungry(boolean hungry){
        if(hungry){
         int bitesOfCheese = 1;
        }
        boolean teenyBit = true;
    //    System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }
    // System.out.println(teenyBit); // DOES NOT COMPILE

    public void eatMore(boolean hungry , int amountOfFood){
        int roomInBelly = 5;
        if(hungry){
          boolean timeToEat = true;
          while(amountOfFood > 0);
           int amountEaten = 2;
        }
      //  roomInBelly = roomInBelly - amountEaten; // DOES NOT COMPILE
     //   amountOfFood = amountOfFood - amountEaten; // DOES NOT COMPILE
    }
}
