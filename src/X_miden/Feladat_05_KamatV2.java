package X_miden;

/*Definiáljunk egy változot parancssosri argumetumból. Pénzünkre járó éves kamat. Irassuk ki hany évig kell kamatoztatni hogy a pénzünk dulplája legyen.
 */


import java.util.Scanner;

public class Feladat_05_KamatV2 {
    public static void main(String[] args) {

        double bankiKamat = Double.valueOf(args[0]); // Atveszem az argumentum tombjéből az elemet és castolom számmá
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mennyi penzt kivnasz befektetni?:");
        double sajatToke = scanner.nextDouble();
        System.out.println(" Az általunk behoztt tőke:\n" + sajatToke);
        System.out.println(" Az éves Banki kamat mértéke %( nem kamatos kamat:\n" + bankiKamat);
        bankiKamat /= 100;
        double evesKamat = sajatToke * bankiKamat;
//        System.out.println(evesKamat);
        double célérték = (sajatToke * bankiKamat);
        int cntEv = 1;
        do {
           célérték += evesKamat;
            System.out.println(célérték);
            cntEv++;                        }
        while ( célérték < sajatToke);
                {
            System.out.println("A pénzed meguplázásához:" +cntEv +" év kell");
        }
    }
}
//For the Corgi!