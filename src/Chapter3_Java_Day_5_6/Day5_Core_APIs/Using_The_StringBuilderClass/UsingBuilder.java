package Chapter3_Java_Day_5_6.Day5_Core_APIs.Using_The_StringBuilderClass;

public class UsingBuilder {
    public static void main(String[] args) {
        // ---- Con String: ineficiente ----
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current; // cada += crea un objeto String nuevo (27 objetos en total)
        }
        System.out.println(alpha); // abcdefghijklmnopqrstuvwxyz

        // ---- Con StringBuilder: eficiente ----
        StringBuilder alphaSB = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            alphaSB.append(current); // modifica el MISMO objeto, no crea uno nuevo cada vez
        }
        System.out.println(alphaSB); // abcdefghijklmnopqrstuvwxyz
    }
}
