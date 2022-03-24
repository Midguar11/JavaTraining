package X_miden;
// Bekér két számot A,B. Kiirja a naghyobb értékét
//Irja ki melyik a nagyobb érték
//Egyenlőségre is figyeljünk
//Bővítsük C értékkel és ugyanez ami fent

import java.util.Scanner;

public class Feladat12MaximumKereses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek add meg az A értékét:");
        int A = scanner.nextInt();
        System.out.println("Kérlek add meg az B értékét:");
        int B = scanner.nextInt();
        System.out.println("Kérlek add meg az C értékét:");
        int C = scanner.nextInt();
        melyikNagyobb(A, B, C);

    }

    private static void melyikNagyobb(int A, int B, int C) {
        if (A > B && A > C) {
            System.out.println("A három általad megadott számból " + A + " - " + B + "- " + C + "\n A nagyobb érték a A:\t" + A);
        } else if (B > A && B > C) {
            System.out.println("A három általad megadott számból " + A + " - " + B + "- " + C + "\n A nagyobb érték a B:\t" + B);
        } else if (C > A && C > B) {
            System.out.println("A három általad megadott számból " + A + " - " + B + "- " + C + "\n A nagyobb érték a C:\t" + C);
        } else
            System.out.println("A három általad megadott számból " + A + " - " + B + "- " + C + "\n a megadott értékek egyenlőek:\t" + A);


    }
}
// For the Corgi!
