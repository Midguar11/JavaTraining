package gyakorlasok;

import java.util.Scanner;

public class KeresesTombben_Megadott_erteketkeres_M {

    public static void main(String[] args) {

        int[] tomb = {1,2,3,3,3,3,3,3,3,3,4,6,7,8};
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek add meg a számot amit keressek a tömbben");
        int condition = scan.nextInt();
        System.out.println(condition +"\t ebből a számból:\t" + countEquals(tomb,condition) +" darabot találtam a tömbben");

    }
    public static int countEquals(int[] t, int condition){
        int cnt = 0;
            for(int k : t){
            if(k == condition){
                cnt++;
            }
        }
        return cnt;
    }
}
