package Sablonok;

import java.util.Arrays;

public class Array_Válogató {

    public static void main(String[] args) {
        int[] tomb = {-1,0,1,2,3,4,-2,-3}; // tömb amiből válogatok
        Integer[] tombOuto1 = new Integer[tomb.length]; // tömb amiben hozom az értékeket, azért Integer és nem int mert igy a null értéket is látom
        Integer[] tombOuto2 = new Integer[tomb.length]; // tömb amiben hozom az értékeket, azért Integer és nem int mert igy a null értéket is látom
        szetvalogat(tomb,tombOuto1,tombOuto2); // hivatkozom a Functionra amivel csinálom a válogatást
        System.out.println(Arrays.toString(tombOuto1)); // kiiratom a képernyőre a pozitziv értékeket
        System.out.println(Arrays.toString(tombOuto2)); // kiiratom a képernyőre a negatív értékeket
    }

    public static void szetvalogat(int[] imputTomb, Integer[] tombOut01, Integer[] tombOut02){ //Átveszem a tömböket.
        int o1Index = 0; //Létrehozok egy index változot a számolás miatt
        int o2Index = 0; //Létrehozok egy mádosdik index változot a számolás miatt
        for(int s: imputTomb){ // a bejovö tömbön elkezdek lépkedni For each
            if(s >= 0){ // Ha az érték egyenlő vagy nagyobb mint 0 tehátr pozitiv szam
                tombOut01[o1Index] = s; // Ha az érték egyenlő vagy nagyobb mint 0 tehát pozitiv szám akkor belerakom az értéket és növelem az index értékét 1 el.
                o1Index++;
            } else {
                tombOut02[o2Index] = s;// Ha az érték kisebb mint 0 tehát negativ szám akkor belerakom az értéket és növelem az index értékét 1 el.
                o2Index++;
            }
        }
    }

}
