package X_miden;

import java.util.Arrays;

public class Feladat26_StringArrayOsszefutatása {
    public static void main(String[] args) {
        String[] aArray = {"macko", "vackor", "mez", "auto", "venezuela", "pillango", "xaver"};
        String[] bArray = {"rudolf", "geza", "bela", "rocket"};
        int aArrL = aArray.length;
        int bArrL = bArray.length;
        String[] cArray = new String[aArrL + bArrL];
        Arrays.sort(aArray); // az "a" tömb elemeit ABC be rakom
//        for (String k : aArray) {
//            System.out.println(k);
//        }

        Arrays.sort(bArray); // a "b" tömb elemeit ABC be rakom
        for (int i = 0; i < aArrL + bArrL; i++) {
            if (i < aArrL) {
                cArray[i] = aArray[i];
            } else cArray[i] = bArray[i - aArrL];
        }
        Arrays.sort(cArray);
        for (String k : cArray) {
            System.out.println(k);
//        }
//        Arrays.sort(cArray);
//        for (String k : cArray) {
//            System.out.println(k);
        }
    }
}
//For the corgi!


