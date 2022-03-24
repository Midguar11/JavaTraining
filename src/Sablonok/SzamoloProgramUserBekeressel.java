package Sablonok;

import java.util.Scanner;

public class SzamoloProgramUserBekeressel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek add meg meddig számoljak el, köszönöm");
        int finalCount = sc.nextInt();
        int i = 0;
        while (i <= finalCount) {
            System.out.println(i);
            i++;
        }
    }
}
// For the Corgi!