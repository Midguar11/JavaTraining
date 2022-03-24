package gyakorlasok;

import java.util.Scanner;

public class PrimFinder_WhitTimeRecord_M {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Adj meg egy értékét meddig keressek prim szamokat");
        final int LIMIT = scan.nextInt();
        long start = System.currentTimeMillis();
        int counter = 0;
        System.out.println("Talált prim számok:");
        for (int szam = 2; szam <= LIMIT; szam++) {
            if (prim(szam)) {
                System.out.print(szam + ", ");
                counter++;
            }
                  }
        long stop = System.currentTimeMillis();
        System.out.println();
        System.out.println("Futási idő:" + (stop - start) + "ms. " + counter + " prímet találtam.");
    }

    private static boolean prim(int szam) {
        boolean prim = true;
        int oszto = 2;
        double sqrt = Math.sqrt(szam);
        while (prim) {
            if (!(oszto <= sqrt)) break;
            if (szam % oszto == 0) {
                prim = false;
            }
            oszto++;
        }
        return prim;
    }

}
