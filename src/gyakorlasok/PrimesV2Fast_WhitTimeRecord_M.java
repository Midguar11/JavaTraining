package gyakorlasok;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimesV2Fast_WhitTimeRecord_M {
    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println(" Adj meg egy értékét meddig keressek prim számokat");
        final int LIMIT = scan.nextInt();
        long start = System.currentTimeMillis();
        int cnt = 0;
        for (int szam = 0; szam < LIMIT; szam++) prime(primeList, szam);
        System.out.println("Talált prim számok:\n" +primeList);
        long stop = System.currentTimeMillis();
        System.out.println();
        System.out.println("Futási idő:" + (stop - start) + " ms. ");
    }

    private static void prime(ArrayList<Integer> primeList, int szam) {
        boolean isPrime = true;
        for (int y = 2; y < Math.sqrt(szam); y++)
            if (szam % y == 0) {
                isPrime = false;
                break;
            }
        if (isPrime)
            primeList.add(szam);
    }
}
