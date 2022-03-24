package ___Help;

public class Meghataroza_Hany_TaguEgySzam_Help {
    public static void main(String[] args) {
                      int szam = 2567800; //Fontos, ez a változó módosulni fog, szóval ez a szám másolata legyen.
                int counter = 0;
                while (szam > 0) {
                    szam = szam / 10;
                    counter++;
                }
                System.out.println(counter);
            }
}

