package ___Help;

public class Final_Konstansok_Help {

    public static final double PI = 3.14; // konstansan statikus ezt kötelezően meg kell adni nem valtozhato késöbb
    public static final String TERULET_SZOVEG = "TERULET_SZOVEG";// konstansan statikus ezt kötelezően meg kell adni nem valtozhato késöbb
    public static final int[] TOMB = {1, 2, 4, 5, 7}; // Konstans Final Tömb az értékei egyesével dierkt cimezve átirhatoak

    public static void main(String[] args) {
        int sugar = 3;
        double terulet = sugar*sugar* PI;
        System.out.println(terulet);
        System.out.println(TERULET_SZOVEG + terulet);


        int a= 10;
        double negyzetTerulet = a*a;
        System.out.println(TERULET_SZOVEG + negyzetTerulet);
    }
}
