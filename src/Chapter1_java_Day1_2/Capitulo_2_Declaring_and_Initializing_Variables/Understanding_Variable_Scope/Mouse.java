package Chapter1_java_Day1_2.Capitulo_2_Declaring_and_Initializing_Variables.Understanding_Variable_Scope;

public class Mouse {
    static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches){
      if(length < MAX_LENGTH){
          int newSize = length + inches;
          length = newSize;
      }
    }

}
