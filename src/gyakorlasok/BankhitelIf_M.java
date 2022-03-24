package gyakorlasok;

import java.util.Scanner;

public class BankhitelIf_M {
    public static void main(String[] args) {
        //If-fel
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a felsroltak közül melyik válllakozás tipussal szeretne hitelt felvenni");
        System.out.println("1 -es Mikro");
        System.out.println("2 -es Kis");
        System.out.println("3 -as Közepes");
        System.out.println("4 -es Nagy");
        int vt = sc.nextInt();
        if (vt >= 5) {
            System.out.println("Nem választható tipust adott meg, választható érték 1,2,3,4 ");
        }
        System.out.println("Kérem adja meg a felvenni kivant osszeget");
        long ft = sc.nextInt();
        if (vt == 1) {
            System.out.println("felvehető hitel:" + ft * 0.5 + "Ft");
        } else if (vt == 2) {
            System.out.println("felvehető hitel:" + ft * 0.4 + "Ft");
        } else if (vt == 3) {
            System.out.println("felvehető hitel:" + ft * 0.3 + "Ft");
        } else {
            System.out.println("felvehető hitel: Az ön ázal választott cégforma jelenleg nem támogatott");
        }
    }
}
//For the Corgi!