package gyakorlasok;


public class Fibonacci_TobbFajta_M {
    public static void main(String[] args) {

        //// Whlie és If megoldás

        int fibonacci = 2;
        int elozo = 1;
        System.out.println(elozo);
        System.out.println(fibonacci);
        while(fibonacci< 1000 ){

            int regiFibonacci = fibonacci;
            fibonacci = fibonacci + elozo;
            elozo = regiFibonacci;

            if(fibonacci < 1000){
                System.out.println(fibonacci);
            }
        }

   // For ciklussal Megoldva ( Ez tulmegy 1000 en )
        System.out.println("-------------FOR ciklus------------");
        int fibonacci3 = 2;
        int elozo3 = 1;


        for(int regiFibonacci = fibonacci3; fibonacci3<1000; ){
            regiFibonacci = fibonacci3;
            fibonacci3 = fibonacci3+elozo3;
            elozo3 = regiFibonacci;
            System.out.println(fibonacci3);
        }

// Tömbbel Megoldva
        System.out.println("----Tömbbel----");

        int[] previousValues = {1,2};
        System.out.println(previousValues[0]);
        while(previousValues[1]<1000){
            System.out.println(previousValues[1]);
            int regiFibonacci = previousValues[1];
            previousValues[1] = previousValues[1] + previousValues[0];
            previousValues[0] = regiFibonacci;

        }
    }

}
