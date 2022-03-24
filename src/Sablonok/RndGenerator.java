package Sablonok;

import java.util.Random;
import java.util.Scanner;

public class RndGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány oldalu a kocka amivel dobnom kell?");
        int cubeside = sc.nextInt();
        System.out.println("Amit dobtam:\t" + RndGen(cubeside));
    }

    public static int RndGen(int cubeside) {
        int rndNumber = new Random().nextInt(cubeside) + 1;
        return rndNumber;
    }
}
// For the Corgi!

