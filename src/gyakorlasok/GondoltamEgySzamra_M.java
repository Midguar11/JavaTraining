package gyakorlasok;

import java.util.Random;
import java.util.Scanner;

public class GondoltamEgySzamra_M {

    public static void main(String[] args) {
        /* Feladat: legyen egy random értéket tartalamzó változónk az 1...n számtartományból.
        * n: fix/konstans érték (20)
        * A felhasználó tippelhet 1...n közötti számra.
        * Ki kell írni, hogy a megadott szám és a "gondolt" szám milyen relációban van: kisebb, nagyobb, egyenlő.
        * Egyenlő esetén gratulálunk, kiírjuk a tippek számát és véget ér a program.
        *  */

        /*   boolean b = false;
         * if(b == true)     =>      if(b)
         * if(b == false)     =>      if(!b)
         *
         * */

        int n = 20;
        int rnd = new Random().nextInt(n) + 1;  // 1-n közötti véletlen egész szám
        boolean tippOK = false;                 // ha jó a tipp, akkor true, egyébként false
        Scanner sc = new Scanner(System.in);
        int tippCnt = 0;                        // tippek száma

        System.out.println("(DEBUG) rnd=" + rnd);
        do {
            System.out.println("Kérem a tippet!");
            int tippNum = sc.nextInt();

            // tipp validálása
            if(tippNum < 1 || tippNum > n) { // rossz értéket adott meg
                System.out.println("A tippelt szám az 1..."+ n + " tartományba kell essen!");
                continue;
            }

            tippCnt++;

            // tipp kiértékelése
            if(tippNum > rnd) {
                System.out.println("A gondolt szám kisebb!");
            } else if (tippNum < rnd) {
                System.out.println("A gondolt szám nagyobb!");
            } else { // a két szám egyenlő
                System.out.println("Gratulálunk, talált!");
                System.out.println("Tippek száma:" + tippCnt);
                tippOK = true;
            }

        } while(!tippOK);
    }
}
