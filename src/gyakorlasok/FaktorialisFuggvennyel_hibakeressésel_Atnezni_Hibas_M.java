package gyakorlasok;

import java.util.Scanner;

public class FaktorialisFuggvennyel_hibakeressésel_Atnezni_Hibas_M {

    public static void main(String[] args) {

        System.out.println(faktRekurziv(10));
        System.out.println("Input!");
        Scanner s = new Scanner(System.in);
        boolean ok = false;

        while(!ok){
            String szoveg = s.nextLine();
            try {
                int szam = Integer.parseInt(szoveg);
                ok = true;
                try {
                    long faktorialis = fakt(szam);
                    //Ennek meg itt van vége
                    System.out.println(faktorialis);
                } catch(IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                    //System.exit(-1);
                    //return;

                }
                finally {
                    System.out.println("Ez mindig lefut. Ha van hiba, ha nincs.");

                }
            } catch (NumberFormatException ex){

                System.out.println("Hibás input. Kééérem adjon meg egy számot!");
            }

        }

    }

    public static long fakt(int nr){
        if(nr < 0){
            throw new IllegalArgumentException("Csak nemnegativ szamot fogad el");
            //Es itt vege a futasnak
        }
        long eredmeny = 1;
        for(int i=1; i<=nr ; i++){
            eredmeny *= i;
        }
        return eredmeny;
    }

// Rekurzio fontos!!!!
    public static long faktRekurziv(int nr){
        System.out.println(nr + " Hívódik");
        if(nr < 0){
            throw new IllegalArgumentException("Csak nemnegativ szamot fogad el");
            //Es itt vege a futasnak
        }
        if(nr <= 1){
            return 1;
        }
        return nr * faktRekurziv(nr-1);
    }
}
