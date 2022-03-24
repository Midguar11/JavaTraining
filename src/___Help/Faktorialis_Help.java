package ___Help;

import java.util.Scanner;
// A matematikában egy n nemnegatív egész szám faktoriálisának az n-nél kisebb vagy egyenlő pozitív egész számok szorzatát nevezzük.
// Például:  5 ! = 1 ⋅ 2 ⋅ 3 ⋅ 4 ⋅ 5 = 120 ( Ez az 5 fatkoriális értéke), ez a definíció már magában foglalja azt a megállapodást, hogy 0 ! = 1
//A program vegtelen ciklusban van amig jó értéket andka meg ismétli onmagát
public class Faktorialis_Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false; // Igaz hamis valtozo
        do { // elölenörzi if nél vizsgála 0 e ha igen akkor kilép, ha nem akkor lép elsre és felut.
            System.out.println("Kérem adja meg a számot aminek kiváncsi a faktoriális értékére");
            int n = sc.nextInt(); // Bekérek egy számot
            if (n == 0) { // n nem lehet egyenlo 0 val ellenorzese
                isExit = true;
            } else {
                double fact = 1; //Factorialis változo ide töltöm be az értéket
                for (int i = 1; i <= n; i++) { // Fontos az egyenlőség jel!!!
                    fact *= i; // A factorialist ertekenek adom az elozo fact * aktualis i vel igy pont a kepletet kapom
//            System.out.println(i + "! = " +fact);// Szamolas folyamata ha nem akarom csak az eredmenyt ezt kiszedem
                }
                System.out.println(""); // Sortörlés felesleges értékek kidobása
                System.out.println(n + "! = " + fact);//A megadott szám factorialis értéke
            }
        }while (!isExit);
        }
 }
// For the Corgi!
