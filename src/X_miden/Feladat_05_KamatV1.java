package X_miden;

/*Definiáljunk egy változot parancssosri argumetumból. Pénzünkre járó éves kamat. Irassuk ki hany évig kell kamatoztatni hogy a pénzünk dulplája legyen.
 */


public class Feladat_05_KamatV1 {
    public static void main(String[] args) {

        double bankiKamat = Double.valueOf(args[0]); // Atveszem az argumentum tombjéből az elemet és castolom számmá
        double sajatToke = 1000;
        System.out.println(" Az általunk behoztt tőke:\n" +sajatToke);
        System.out.println(" Az éves Banki kamat mértéke %( nem kamatos kamat:\n" + bankiKamat);
        bankiKamat /= 100;
        System.out.println(bankiKamat);
        int cntEv =0;
        for (double i = 0; i <= sajatToke; i +=(sajatToke * bankiKamat ) ) {
            System.out.println(i);// Ellenörző sor
            cntEv++;
        }
        System.out.println(cntEv +" Év alatt sikerült megdupláznod a pénzed");
    }
}
//For the corgi!