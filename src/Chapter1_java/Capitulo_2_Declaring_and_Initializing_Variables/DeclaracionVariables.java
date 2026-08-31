package Chapter1_java.Capitulo_2_Declaring_and_Initializing_Variables;

public class DeclaracionVariables {

    public static void main(String[] args) {
// inicializas una variable
        String zooName;
        int numberAnimals;
        int amount = 0Xe;

        // declaras una variable;
        zooName = "the Best Zoo";
        numberAnimals = 100;

        //forma secundaria declarar e inicializar
        // String zooName = "The best Zoo";
        //int numberAnimals = 100;




    }

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
             int bitesOfCheese = 1;
            } // bitesOfCheese goes out of scope here
       //  System.out.println(bitesOfCheese);// DOES NOT COMPILE solo existe en el if
        // si estas afuera no se puede llamar a esa variable
         }

         //---------------------------------------
        //
         public void eatMore(boolean hungry, int amountOfFood) {
              int roomInBelly = 5;
            if (hungry) {  // hungry  si existe
                boolean timeToEat = true; // existe solo en el if
               while (amountOfFood > 0) {

                   //
                      int amountEaten = 2;
                    roomInBelly = roomInBelly - amountEaten;
                     amountOfFood = amountOfFood - amountEaten;
                      }
                  }
              System.out.println(amountOfFood);
              }




}
