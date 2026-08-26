package Chapter2_java_Day_3_4.day4_Control_de_Flujo.Loops_While_Do_While_For_For_each.The_Do_While_Statement;

public class WhileVsDoWhileDemo {

    public static void main(String[] args) {

        // ----- Ejemplo 1: do-while se ejecuta al menos una vez -----
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println(x); // Outputs 1

        // ----- Ejemplo 2: while equivalente -----
        int a = 15;
        while (a > 10) {
            a--;
        }
        System.out.println("Resultado con while: " + a);

        // ----- Ejemplo 3: do-while equivalente usando if -----
        int b = 15;
        if (b > 10) {
            do {
                b--;
            } while (b > 10);
        }
        System.out.println("Resultado con do-while: " + b);

        // ----- Ejemplo 4: do-while con rama else -----
        int c = 5;
        if (c > 10) {
            do {
                c--;
            } while (c > 10);
        } else {
            c++;
        }
        System.out.println("Resultado con if-else: " + c);
    }

}
