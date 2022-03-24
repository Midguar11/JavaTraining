package gyakorlasok;

import java.util.Arrays;

public class SearchArray_M {
    public static void main(String[] args) {

        int[] numArray = {4, 56, 192, 32, 45, 18, 98, 0};

        /*
         * 1. Feladat: van-e 0 eleme?
         *
         * */
        boolean hasZero = false;
        for (int elem : numArray) {
            if (elem == 0) {
                hasZero = true;
                break;
            }
        }
        if (hasZero) {
            System.out.println("A tömbnek van 0 eleme!");
        } else {
            System.out.println("A tömbnek nincs 0 eleme!");
        }

        System.out.println("************************************");

        /*
         * 2. Feladat: mi az első 0 elem pozíciója?
         *
         */
        int zeroPos = -1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == 0) {
                zeroPos = i;
                break;
            }
        }
        if (zeroPos > -1) {
            System.out.println("A 0 elem pozíciója=" + zeroPos);
        } else {
            System.out.println("A tömbnek nincs 0 eleme!");
        }

        /*
         * 3. Feladat: mennyi 0 elem van a tömbben?
         */
        int zeroCnt = 0;
        for (int elem : numArray) {
            if (elem == 0) zeroCnt++;
        }
        System.out.println("A tömbnek " + zeroCnt + " db 0 eleme van!");

        /*
         * 4. Feladat: van-e N (bármilyen egész szám) eleme a tömbnek?
         */
        int n = 192;
        boolean hasElement = false;
        for (int elem : numArray) {
            if (elem == n) {
                hasElement = true;
                break;
            }
        }
        if (hasElement) {
            System.out.println("A tömbnek van " + n + " eleme!");
        } else {
            System.out.println("A tömbnek nincs " + n + " eleme!");
        }

        System.out.println(Arrays.toString(numArray));  // tömb elemeinek kiíratása

        /*
         * 5. Feladat: hány N elem van a tömbben?
         */
        int numCnt = 0;
        int n2 = 15;
        for (int elem : numArray) {
            if (elem == n2) numCnt++;
        }
        System.out.println("A tömbnek " + numCnt + " db " + n2 + " eleme van!");

        /*
         * 6. Feladat: N elemek pozíciója?
         */
        int n3 = 15;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == n3) {
                System.out.println("A tömb " + i + " pozícióján van " + n3 + " szám");
            }
        }

        /*
         * 7. Feladat: egy növekvően rendezett tömbből kiszűrni az ismétlődéseket
         * Eredményt egy új tömbbe kell elhelyezni.
         * int[] numArray = {4, 4, 18, 32, 45, 56, 56, 98, 192, 205, 205, 205};
         * int[] resultArray = {4, 18, 32, 45, 56, 98, 192, 205, 0, 0, 0, 0};
         *
         * {4, 18, 32, 45, 56, 98, 192, 205, 0, 0, 0,0 }
         */
        int[] numArray2 = {4, 4, 18, 32, 45, 56, 56, 98, 192, 205, 205, 205};
        int[] resultArray2 = new int[numArray2.length];
        Arrays.sort(numArray2);

        System.out.println("*************************************");
        System.out.println(numArray2);

        System.out.println(Arrays.toString(numArray2));

        int prev = 0, ujIdx = 0;
        for (int regiIdx = 0; regiIdx < numArray2.length; regiIdx++) {

            if (regiIdx == 0 || numArray2[regiIdx] != prev) { // az első elemet mindig átmásolom,
                                                            // itt át kell másolni az új tömbbe
                resultArray2[ujIdx] = numArray2[regiIdx];
                ujIdx++;
            }

            prev = numArray2[regiIdx];
        }
        System.out.println(Arrays.toString(resultArray2));
        System.out.println("*************************************");

        /*
         * 8. Feladat: szűrjük ki a megadott szövegből a szóközöket
         * String szoveg = "hello masterfield";
         * String result = "hellomasterfield";
         */
        String szoveg = "hello masterfield";
        char[] chrArray = szoveg.toCharArray();

        /*
         * 9. Feladat: fordítsunk meg egy szöveget (indul a görög aludni)
         * Döntsük el, hogy a szöveg palindróm vagy sem! Szóközöket nem kell figyelembe venni!
         */

    }
}
