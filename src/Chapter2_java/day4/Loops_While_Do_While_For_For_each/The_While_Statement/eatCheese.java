package Chapter2_java.day4.Loops_While_Do_While_For_For_each.The_While_Statement;

public class eatCheese {

    int roomInBelly = 5;

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;  // 4
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    // loop infinito
/*
     int x = 2;
     int y = 5;
        while (x < 10)  // x nunca llegara a 10 por no haber un incremento
        y++;  // infinito por siempre


  */
}
