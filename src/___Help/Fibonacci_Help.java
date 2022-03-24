package ___Help;

//A Fibonacci-számok (ejtsd: fibonaccsi) a matematikában az egyik legismertebb másodrendben rekurzív sorozat elemei.
// A nulladik eleme 0, az első eleme 1, a további elemeket az előző kettő összegeként kapjuk
public class Fibonacci_Help {
    public static void main(String[] args) {
        int fibonacci = 1;
        int elozo = 0;
        System.out.println(elozo);
        System.out.println(fibonacci);
        while(fibonacci < 1000 ){ // elövizsgálom azért hogy ne szaladjunk tul az ezren ha afibanoci kisebb mint ezer fut a program
            int regiFibonacci = fibonacci;
            fibonacci = fibonacci + elozo;
            elozo = regiFibonacci;
            if(fibonacci < 1000){ // Amig el nem éri az ezret printelem
                System.out.println(fibonacci);
            }
        }
    }
}