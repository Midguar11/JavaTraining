package ___Help;

import java.util.Scanner;

public class Kereses_Tombben_Help {

    public static void main(String[] args) {

        int[] tomb = {1,2,3,3,3,3,3,3,3,3,4,6,7,8}; // Tomb létrehozása és érték felöltés
        Scanner scan = new Scanner(System.in); // Scaner létrehozása
        System.out.println("Kérlek add meg a számot amit keressek a tömbben");
        int condition = scan.nextInt();// keresett érték bekérése
        System.out.println(condition +"\t ebből a számból:\t" + countEquals(tomb,condition) +" darabot találtam a tömbben");//Találatok kiiratása

    }
    public static int countEquals(int[] tombin, int condition){ // "int[] "ezzel behoztam a fenti tombbot es tombin nek nevezem el. int conidtion ezzel behozom a keresesi erteket
        int cnt = 0; // találat számláló
            for(int k : tombin){  // For each lepegetek a tomb elemein
            if(k == condition){ // Amennyiben az adott elem eggyezi a conditionnal akkor noveltetem a countert cnt
                cnt++;
            }
        }
        return cnt; // vissza adja a szamolas eredmenyet
    }
}
