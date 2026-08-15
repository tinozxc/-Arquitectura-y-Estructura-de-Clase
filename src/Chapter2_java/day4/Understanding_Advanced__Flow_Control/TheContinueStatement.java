package Chapter2_java.day4.Understanding_Advanced__Flow_Control;

public class TheContinueStatement {

    public static void main(String[] args) {

        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) { // de char a int = sin necesidad de cast
                if (a == 2 || x == 'b') {
                    continue FIRST_CHAR_LOOP;
                }
                System.out.print(" " + a + x);
            }
        }
    }

}
