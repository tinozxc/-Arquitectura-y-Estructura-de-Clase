package Chapter3_Java.Day5_Core_APIs.Using_The_StringBuilderClass;

public class MutabilityAndChaining {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");                    // sb = "start+middle"
        StringBuilder same = sb.append("+end");   // sb y same apuntan al MISMO objeto
        System.out.println(sb);   // start+middle+end
        System.out.println(same); // start+middle+end

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");    // a y b -> mismo objeto: "abcde"
        b = b.append("f").append("g");       // sigue siendo el mismo objeto: "abcdefg"
        System.out.println("a=" + a); // a=abcdefg
        System.out.println("b=" + b); // b=abcdefg
    }

}
