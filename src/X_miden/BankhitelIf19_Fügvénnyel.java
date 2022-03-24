package X_miden;
/* Korább hitel számoló program bővítése. Fügvénybe rakva. Függvény vett paraméterek:
Vállalat mérete és teljes összeg ( tőke ).  Viszatérési érték a felvehető összeg. Számítsa ki külön mindketőt és azt hogy összesen ,ennyo a felvehető érték. */

import java.util.Scanner;

public class BankhitelIf19_Fügvénnyel {
    public static void main(String[] args) {
        //If-fel
        Scanner sc = new Scanner(System.in);
        long elsoHitel = 0;
        long masodikHitel =0;
        for (int i = 0; i < 2; i++) { // 2 azért mert 2 vállalatnak kell bekérnem az adait
            System.out.println("Kérem adja meg a felsroltak közül melyik válllakozás tipussal szeretne hitelt felvenni");
            System.out.println("1 -es Mikro");
            System.out.println("2 -es Kis");
            System.out.println("3 -as Közepes");
            System.out.println("4 -es Nagy");
            int vt = sc.nextInt();
            if (vt >= 5 || vt <= 0) { // egyszerű hiba kezelés
                System.out.println("Nem választható tipust adott meg, választható érték 1,2,3,4 ");
            } else
                System.out.println("Kérem adja meg a válalat tőkéjét");
            long ft = sc.nextInt();
            hitelSzamolas(vt, ft);
            if (i == 0) {
                elsoHitel = hitelSzamolas(vt, ft);
            } else masodikHitel = hitelSzamolas(vt, ft);
                  }
        System.out.println("a Felvehető hitel összege Forintban az Első válalat számára:\t" + elsoHitel);
        System.out.println("a Felvehető hitel összege Forintban a Második vállalt számára :\t" + masodikHitel);
        System.out.println("A két vállalatnak az együttes támogatás összege:\t" + (elsoHitel + masodikHitel));
        }
      // Hitelszamolas fugveny
    private static long hitelSzamolas(int vt, long ft) {
        long backOsszeg = 0;
        if (vt == 1) {
            backOsszeg = (long) (ft * 0.5);
        } else if (vt == 2) {
            backOsszeg = (long) (ft * 0.4);
        } else if (vt == 3) {
            backOsszeg = (long) (ft * 0.3);
        } else {
            backOsszeg = 0;
        }
        return backOsszeg;
    }
}
//For the Corgi!