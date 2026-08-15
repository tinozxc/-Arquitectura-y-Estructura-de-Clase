package Chapter1_java.Capitulo_2_Declaring_and_Initializing_Variables.Understanding_Default_Initialization_of_Variables;

public class FindAnswer {

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
      //  System.out.printl(answer);
      //  System.out.printl(onlyOneBranch); // DOES NOT COMPILE
    }
}
