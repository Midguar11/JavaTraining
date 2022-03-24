package X_miden;


import java.util.Random;

/* Hozz létre egy tömbböt egész számokkal 20-30 közötti rnd értékekkel. Ezután töltsük fel 1000 - es 2000 rnd egesszel értékekkel.
Határuzzuk meg a tomb elemeinek összegét és átlaégértékét.
*/
public class Feladat_02_TombRND {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] tomb = {rnd.nextInt(20, 30 +1), rnd.nextInt(20, 30 +1), rnd.nextInt(20, 30 +1), rnd.nextInt(20, 30 +1)};
//        System.out.println(tomb[0]);
//        System.out.println(tomb[1]);
//        System.out.println(tomb[2]);
//        System.out.println(tomb[3]);
          tomb = new int[]{rnd.nextInt(1000, 2000 +1),rnd.nextInt(1000, 2000 +1),rnd.nextInt(1000, 2000 +1), rnd.nextInt(1000, 2000 +1),};
        System.out.println(tomb[0]);
        System.out.println(tomb[1]);
        System.out.println(tomb[2]);
        System.out.println(tomb[3]);
        int sumTomb = 0;
        for (int cntTomb : tomb ) {
            sumTomb = sumTomb +cntTomb;
                    }
        System.out.println("A tömb értékeinek összege =\n" +sumTomb);
        System.out.println("A tömb értékeinek átalaga: =\n" +sumTomb / tomb.length);
        }
}
