package gyakorlasok;

import java.util.Random;

public class MontyHall_M {

    public static void main(String[] args) {

        final int KISERLET_SZAM = 500000;
        int win = 0;
        Random rnd = new Random();
        int jatekos;
        int ajandek;
        int nyitas;
        for (int i = 0; i < KISERLET_SZAM; i++) {
            jatekos = rnd.nextInt(3);
            ajandek = rnd.nextInt(3);
            do {
                nyitas = rnd.nextInt(3);
            } while (nyitas == jatekos || nyitas == ajandek);

            //játékos vált
            for (int j = 0; j < 3; j++) {
                if (j!=nyitas && j!=jatekos){
                    jatekos=j;
                    break;
                }
            }

            if (ajandek == jatekos) {
                win++;
            }
        }
        System.out.println(KISERLET_SZAM + " játékból " + win + " alkalommal nyert. " + (double) win / KISERLET_SZAM * 100 + "%");
    }
}
