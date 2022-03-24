package Sablonok;

public class CounterForCiklus {
    public static void main(String[] args) {
        int counterPrint = cntFinish();
        System.out.println(" A folyamat\t" +counterPrint + "\talkalommal futott le");
    }

    public static int cntFinish() {
        int cntF = 0;
        for (int i = 1; i <= 145; i++) {
            cntF++;
                 }
        return cntF;
    }
}

//For the Corgi!