package gyakorlasok;

public class Naptar_NapkeresoV2_M {
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
        int[] daysInMonthNoLeapYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        /* 2022 */
//        int[] daysInMonth = daysInMonthNoLeapYear;
//        int hanyadikNapAHeten = 6; // 1-H, 2-K, 3-Sze, 4-Cs, 5-P, 6-Szo, 7-V
        /******/

        /* 2019 */
//        int[] daysInMonth = daysInMonthNoLeapYear;
//        int hanyadikNapAHeten = 2; // 1-H, 2-K, 3-Sze, 4-Cs, 5-P, 6-Szo, 7-V
        /******/

        /* 2016 */
        int[] daysInMonth = daysInMonthLeapYear;
        int hanyadikNapAHeten = 5; // 1-H, 2-K, 3-Sze, 4-Cs, 5-P, 6-Szo, 7-V
        /******/

        int pentek13Counter = 0;

        for (int m = 1; m <= 12; m++) { // hónapok 1-12

            for (int d = 1; d <= daysInMonth[m - 1]; d++) { // hónapon belül a napok 1-28/30/31

                // ellenőrizzük, hogy péntek 13-a van!
                if (d == 13 && hanyadikNapAHeten == 5) {

                    String hanyadikNapAHetenString = "";
                    switch(hanyadikNapAHeten) {
                        case 1:
                            hanyadikNapAHetenString = "H";
                            break;
                        case 2:
                            hanyadikNapAHetenString = "K";
                            break;
                        case 3:
                            hanyadikNapAHetenString = "Sze";
                            break;
                        case 4:
                            hanyadikNapAHetenString = "Cs";
                            break;
                        case 5:
                            hanyadikNapAHetenString = "P";
                            break;
                        case 6:
                            hanyadikNapAHetenString = "Szo";
                            break;
                        case 7:
                            hanyadikNapAHetenString = "V";
                            break;
                        default:
                            hanyadikNapAHetenString = "N/A";
                            break;
                    }

                    String mString = "";
                    switch(hanyadikNapAHeten) {
                        case 1:
                            mString = "Január";
                            break;
                        case 2:
                            mString = "Február";
                            break;
                        case 3:
                            mString = "Március";
                            break;
                        case 4:
                            mString = "Április";
                            break;
                        case 5:
                            mString = "Május";
                            break;
                        case 6:
                            mString = "Június";
                            break;
                        case 7:
                            mString = "Július";
                            break;
                        case 8:
                            mString = "Augusztus";
                            break;
                        case 9:
                            mString = "Szeptember";
                            break;
                        case 10:
                            mString = "Október";
                            break;
                        case 11:
                            mString = "November";
                            break;
                        case 12:
                            mString = "December";
                            break;
                        default:
                            mString = "N/A";
                            break;
                    }

                    // péntek 13!
                    System.out.println(mString + "\t" + d + "\t" + hanyadikNapAHetenString);
                    pentek13Counter++;
                }

                hanyadikNapAHeten++;
                if (hanyadikNapAHeten == 8) hanyadikNapAHeten = 1;
            }
        }
        System.out.println("Péntek 13-ak száma=" + pentek13Counter);
    }
}
