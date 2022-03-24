package gyakorlasok;

import java.util.Scanner;

public class Faktorialis_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a számo aminek kiváncsi a faktoriális értékére");
        int n = sc.nextInt();
        double a = 1;
        for(int i=1; i<=n; i++) {
            a *= i;
            System.out.println(i + "! = " +a);
        }
        System.out.println("");
        System.out.println(n + "! = " +a);
    }
}
// For the Corgi!
