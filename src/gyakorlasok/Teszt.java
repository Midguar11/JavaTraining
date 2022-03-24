package gyakorlasok;

public class Teszt {
    public static void main(String[] args) {
    int[] teszt1 = {3,20,30,31,33,36,267,5,6,8,10,2,1};
        int t = 9999999;
        for (int k : teszt1 ){
            t = Math.min(t,k); // Min érték keresése tömbben, ha max érték kell akkor az int valtozot 0 rakd
        }
   System.out.println(t);

    }
}
//// For the Corgi!