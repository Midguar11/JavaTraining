package X_miden;

import java.util.Scanner;

public class Feladat_10_SzuletesMasodpercben {
    public static void main(String[] args) {
        long mPe = 31536000 ; // madoperc értéke / év (31 536 000 ) 365*24*60*60
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek add meg a születési éved");
        int szulEv = scan.nextInt();
        System.out.println("Kérlek add meg a mostani évet");
        int maiEv = scan.nextInt();
        long resEv = maiEv - szulEv;
        resEv *= 31536000;
        System.out.println(" Születésed éved ótta eltelt másodpercek száma:\t" +resEv );

    }
}
