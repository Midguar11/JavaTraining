package ___Help;

public class CounterForCiklus_Help {
  public static void main(String[] args) {
  int cntNumber = 0; //Declarák egy változott cntNumber ez lesz a countert definiálom az értékét a-ra.
  for (int i2 = 1; i2 <= 50; i2++) // i2 definiálom 1 re inen indul a számláló értékéet mindig 1 el növelem mig el nem éri az 50 -et.
    {
    System.out.println(i2); // minden ciklusnál kiiratjuk az i2 aktuális értéket a képernyőre
        cntNumber++; //Ez a számláló. Minden ciklussal +1 el növelem az értékét.
          }
        System.out.println("A számláló jelenlegi állása:\n " +cntNumber); // ha véget ér a folyamat blokkon kivül (scope" a vizsgált tartományi terület") kiíratom a counter változó aktuális értékét
    }

}
//For the Corgi!