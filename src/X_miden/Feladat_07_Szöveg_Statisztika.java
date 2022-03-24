package X_miden;

/* Adott szövegből statisztikát meghatározza melyik szó szerepel a legtöbbször a szövegben és melyik szó a leghoszabb.*/

import java.util.Scanner;

public class Feladat_07_Szöveg_Statisztika {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kérlek adj meg egy szöveget")
//        String inSzoveg = scanner.nextLine();
        String inSzoveg = "valami ami nem ez ami ehhhhehhe ez teszelini ez";
        String[] tombSzavak = inSzoveg.split(" "); // itt tombositem es szedem szet szavankent
        int vanAzonos = 0;
        System.out.println(vanAzonos);
        // Ismetlödő kereső
        //Szovizsgalo hosszusag
            String maxSzo = "";
            for (int i = 0; i < tombSzavak.length; i++) {
                if (tombSzavak[i].length() > maxSzo.length()) {
                    maxSzo = tombSzavak[i];
                }
            }
            System.out.println("A szovegben a leghoszabb szó a kvöetkező:\t" + maxSzo);
//        System.out.println(nyomtat);
        }

//   //szovizsgalo ismetles
//    private static boolean vanAzonossag(int[] tombSzavak) {
//        boolean vanAzonos = false;
//        //szovizsgalo ismetles
//        for (int i = 0; i < tombSzavak.length - 1; i++) {
//            if (tombSzavak[i] == tombSzavak[i + 1]) {
//                vanAzonos = true;
//            }
//        }
//        return vanAzonos;
//       }
}



// For the Corgi!


