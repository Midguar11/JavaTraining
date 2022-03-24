package Sablonok;

import java.util.ArrayList;


public class Primes_fast {
    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();

        final int LIMIT = 1000000;
        for (int szam = 0; szam < LIMIT; szam++) prime(primeList, szam);
        System.out.println("\n" +primeList);
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
