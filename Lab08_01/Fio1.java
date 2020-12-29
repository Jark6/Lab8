package Lab08_01;

public class Fio1 {
    private static int step = 0;
    public static int f(int n) {
        space();
        System.out.println("" + n + "-> ");
        step++;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
              }
        else {
            return f(n - 2) + f(n - 1);
         }
       // step-=step;
     //space();
//     System.out.println("" + n + "<- ");
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}
