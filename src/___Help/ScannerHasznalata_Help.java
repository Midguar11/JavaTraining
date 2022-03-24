package ___Help;

import java.util.Scanner;

public class ScannerHasznalata_Help {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // declaralok egy scanert
        System.out.println("Adj meg egy szamot?"); // Kiiratom a kepernyore ezt
        int i = scan.nextInt(); // Bekerek egy int szamot
        scan.nextLine(); // eldobom a számérték utan keletkezett fölösleges entert mert ez problémát okoz mikor stringre váltok
        System.out.println("Adj meg még egy szamot?");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Hello! Hogy hívnak?");
        String nev = scan .nextLine(); // bekérek egy stringet
        System.out.println("Kutyád neve?");
        String knev = scan .nextLine();
        System.out.println(nev); // elekdzem kiiratni a bekert adatokat
        System.out.println(knev);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);



    }



}