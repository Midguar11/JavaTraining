package gyakorlasok;

public class MasodfokuEgyenletMegoldo_M {

    public static void main(String[] args) {
        masodfoku(1, -1, -12);
    }

    private static void masodfoku(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        double sqrt = Math.sqrt(d);
        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);
        if (d>0) {
            System.out.println("Megoldások:" + x1 + ", " + x2);
        }else if (d==0){
            System.out.println("Megoldás:" + x1 );
        }else{
            System.out.println("Az egyenletnek nincs valós megoldása.");
        }

    }

}
