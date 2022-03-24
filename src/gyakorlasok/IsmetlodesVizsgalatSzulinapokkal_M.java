package gyakorlasok;

import java.util.Random;

public class IsmetlodesVizsgalatSzulinapokkal_M {

    public static void main(String[] args) {

        final int KISERLET_SZAM=50000;
        final int LETSZAM=50;
        int vanAzonos=0;

        int[] szuliNapok=new int[LETSZAM];
        Random rnd=new Random();

        for (int i = 0; i < KISERLET_SZAM; i++) {
            feltolt(LETSZAM, szuliNapok, rnd);
            rendezes(szuliNapok);
            if (vanAzonosSzulinap(szuliNapok)){
                vanAzonos++;
            }
        }
        System.out.println(KISERLET_SZAM + " kisérletből "+ LETSZAM + " fős osztályban " +
                vanAzonos +" alkalommal volt ismétlődés. "+(double)vanAzonos/KISERLET_SZAM*100+"%");

    }

    private static void feltolt(int LETSZAM, int[] szuliNapok, Random rnd) {
        for (int j = 0; j < LETSZAM; j++) {
            szuliNapok[j]= rnd.nextInt(365)+1;
        }
    }

    private static boolean vanAzonosSzulinap(int[] szuliNapok) {
        boolean vanAzonos=false;
        for (int i = 0; i < szuliNapok.length-1 ; i++) {
            if (szuliNapok[i] == szuliNapok[i+1]){
                vanAzonos=true;
            }
        }
        return vanAzonos;
    }

    private static void rendezes(int[] szuliNapok) {
        for (int j=0;j<szuliNapok.length-1;j++) {
            for (int i = 0; i < szuliNapok.length-1; i++) {
                if (szuliNapok[i] > szuliNapok[i+1]){
                    int csere=szuliNapok[i];
                    szuliNapok[i]=szuliNapok[i+1];
                    szuliNapok[i+1]=csere;
                }
            }
        }
    }

    private static void tombKiir(int[] tomb) {
        for (int szam : tomb) {
            System.out.print(szam + ",");
        }
        System.out.println();
    }

}
