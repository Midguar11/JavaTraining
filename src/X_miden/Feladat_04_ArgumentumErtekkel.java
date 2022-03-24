package X_miden;

/*Hozzunk létre egy egész tipusu tipusu változot parancssosri argumetumbol kolvasott értékkel.
Szorozzzuk addig önmagával mig el nem éri a 100-at.
Ezt átroljuk le egy változoban hányszor szoroztuk
 */


public class Feladat_04_ArgumentumErtekkel {
    public static void main(String[] args) {

        int inArgn = Integer.valueOf(args[0]); // Atveszem az argumentum tombjéből az elemet és castolom számmá
        System.out.println(inArgn);
        int cnt = 0;
        do {
            System.out.println("Az érték még nem érte el a 100 at. Jelenleg:" + inArgn);
            inArgn *= inArgn;
            cnt++;
        }
        while (inArgn < 100); {
            System.out.println(cnt +" Lépésből értem el a 100 at a következő ömagával való szorzás már meghadná.");
        }

    }
}
//For the corgi!