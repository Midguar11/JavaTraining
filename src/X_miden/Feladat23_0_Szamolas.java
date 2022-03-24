package X_miden;
/* 23 feladat
Számoljuk meg hogy hány 0 eleme van egy számokból álló tömbbnek
 irja ki minden 0 eleme pozicioját */

public class Feladat23_0_Szamolas {
    public static void main(String[] args) {

        int[] tombNul = {1, 0, 1, 0, 0, 6, 7, 3};
        int cnt = 0;
        for (int i = 0; i < tombNul.length; i++) {
            if (tombNul[i] == 0) {
                cnt++;
                System.out.println("A nullás elemek poziciója:\t" + i);

            }
        }
        if (cnt > 0) {
            System.out.println("A tömbb ennyi darab nullát tartalmaz:\t" +cnt);
        } else System.out.println(" Nincs nulla a tömbben");
    }
}
// For the Corgi!


