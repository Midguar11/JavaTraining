package X_miden;

/*Irjunk egy olyan programot, aminek egy parancssori arumentumot kell adni, ami egy N szám.
A program határozza meg, hogy milyen hosszú a parancssori argumentum, mint string. Ezután irja ki a képernyőre a hossz és az N szorzatát.
 */


public class Feladat_01_ArgumetumElemSzamolas {
    public static void main(String[] args) {

        // Verzio 1
//        int inArgn = Integer.parseInt((args[0])); // Ez is egy alternativa Atveszem az argumentum tombjéből az elemet és betöltöm "int be.
//        String inStr = String.valueOf(args[0]); // Ez is egy alternativa / Atveszem az argumentum tombjéből az elemet és betöltöm sima stringbe.
//        int inArgn = Integer.valueOf(args[0]); // Atveszem az argumentum tombjéből az elemet és castolom számmá
        int runCount = 0; // létrehozok egy számlálot
        for (int i = 0; i < args[0].length(); i++) { // megszamolom a string hosszát
            runCount++; // minden ciklusban növelem a countert
        }
        System.out.println("Augment elem hossza * Augment értkével=\n" +runCount * Integer.valueOf(args[0])); // a megszamolt tagokat megszorzom magaval az argumetum ertekevel,  es ezt kiiratom.

        //Verzio 2

        System.out.println("Augment elem hossza * Augment értkével=\n" +args[0].length() * Integer.valueOf(args[0]));

    }
}
//For the corgi!