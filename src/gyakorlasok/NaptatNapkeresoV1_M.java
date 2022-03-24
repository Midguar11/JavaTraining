package gyakorlasok;

public class NaptatNapkeresoV1_M {
    public static void main(String[] args) {

        /* Feladat: határozzuk meg, hogy 2022-ben mennyi péntek 13-a van!
         * Eredményként listázzuk ki az időpontokat:
         * Kiindulás: 2022 január 1 => szombat
         * int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
         *   5   13
         *   8   13
         *   11  13
         * Total=3
         *
         * 1 1  6
         * 1 2  7
         * 1 3  1
         * 1 31
         * 2 1
         * 2 2
         * 12 31
         * */
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int hanyadikNapAHeten = 6; // 1-H, 2-K, 3-Sze, 4-Cs, 5-P, 6-Szo, 7-V
        int pentek13Counter = 0;

        for (int m = 1; m <= 12; m++) { // hónapok 1-12

            for (int d = 1; d <= daysInMonth[m - 1]; d++) { // hónapon belül a napok 1-28/30/31

                // ellenőrizzük, hogy péntek 13-a van!
                if (d == 13 && hanyadikNapAHeten == 5) {
                    // péntek 13!
                    System.out.println(m + "\t" + d + "\t" + hanyadikNapAHeten);
                    pentek13Counter++;
                }

                hanyadikNapAHeten++;
                if (hanyadikNapAHeten == 8) hanyadikNapAHeten = 1;
            }
        }
        System.out.println("Péntek 13-ak száma=" + pentek13Counter);
    }
}
