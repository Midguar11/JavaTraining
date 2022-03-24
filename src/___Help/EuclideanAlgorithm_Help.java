package ___Help;

import java.util.Scanner;

//euclidean algorithm
/*Alapötlete az, hogy a legnagyobb közös osztó nem változik, ha a nagyobb számot a két szám különbségével helyettesítjük.
Például 252 és 105 legnagyobb közös osztója 21, amely legnagyobb közös osztója a 105 és a 147 = 252 − 105 számoknak is.
Ez a helyettesítés csökkenti a nagyobb számot, így a cserék ismétlésével egyre kisebb számokat kapunk, egészen addig,
 amíg a két szám egyenlővé nem válik. Ez az eddigi számpárok, így az eredeti számpár legnagyobb közös osztója.
 Az algoritmus lépésein visszafelé menve találunk két egész (akár negatív) tényezőt, amelyek felhasználásával a
  legnagyobb közös osztó kifejezhető a két kiindulási szám lineáris kombinációjaként.
 */
/* Két vagy több pozitív szám esetében a legkisebb közös többszörös az a szám, amelyik még mindegyik számmal osztható.
Két  pozitív egész szám közös osztói közül a lehetséges legnagyobb (nem 0) pozitív egész, amely mindkét egész számot maradék nélkül osztja.
*/
/* Kérjünk be két számot a felhasznélotól. Euklédeszi algoritmussal számoljuk ki a két szám legnagyobb közös osztóját és legkisebb közös többszörösét.
 */
public class EuclideanAlgorithm_Help {


//    // recursive implementation
//    public static int gcd(int p, int q) {
//        if (q == 0) return p;
//        else return gcd(q, p % q);
//    }

    // non-recursive implementation function
    public static int gcd2(int p, int q) { // mainbol bekerem  az ertekeket.
        while (q != 0) {  // Ha q erteke nem egyenlo mint akkor lefut
            int temp = q; // tempbe kirakom q erteket
            q = p % q; // q egyenlo az osztas utani maradek
            p = temp; //
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be légy szíves 2 egész számot, kiírom a legnagyobb közös osztóját\nEgyik szám:" );
        int p  = scanner.nextInt();
        System.out.println("Második szám:");
        int q  = scanner.nextInt();
//        int d = gcd(p, q); //recurisovs megoldas
        int oszto = gcd2(p, q);
        int szorzo = (p * q) / oszto;
//        System.out.println("A legnagyobb közös osztó:(" + p + ", " + q + ") = " + d);// recursiovs megoldas
        System.out.println(" Ezen két szám\t" +p +"-"+q +"\tA legnagyobb közös osztója: " + oszto);
        System.out.println(" Ezen két szám\t" +p +"-"+q +"\tA legkisebb közös többszörösét: " + szorzo);
    }
}

// For the Corgi!
