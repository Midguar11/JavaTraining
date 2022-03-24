package Sablonok;
//
import java.util.Scanner;

public class SzorzotablaTomb_Userbekeressel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem ada meg a szorzó tábla y tengelyének értékét");
        int yteng = sc.nextInt();
        System.out.println("Kérem ada meg a szorzó tábla x tengelyének értékét");
        int xteng = sc.nextInt();
        int[][] cord = new int[yteng][xteng];
        for (int a = 1; a <= yteng; ++a) {
            for (int b = 1; b <= xteng; ++b) {
                System.out.print(a * b + "  ");
            }
               System.out.println();
        }
            }
    }

