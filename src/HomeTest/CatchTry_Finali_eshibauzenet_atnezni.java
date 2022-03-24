package HomeTest;

public class CatchTry_Finali_eshibauzenet_atnezni {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        boolean ok = false;
//        while(!ok){
//            String szoveg = s.nextLine();
//        }
        try { // hogy mindenkeppen fussson le ez a rész
            long faktorialis = fakt(4);
            //ennek itt van vége
            System.out.println(faktorialis);
                    } catch (IllegalArgumentException ex) { // itt elkapja a hiba uzenetet
            System.out.println(ex.getMessage()); // Itt kiiratja a usernek
        } finally {
            System.out.println(" A futas leált "); // ez mindig lefut ha van hiba ha nincs ez a finally
        }
    }

    public static long fakt(int nr)/*faktoriális számitás pl ( 3 = 1*2*3 */ {
        if (nr < 0) {
            throw new IllegalArgumentException(" Csak nem negativ szamot fogad el");//Ez itt azért hogy hibát dobjon
        }
        long eredmeny = 1;
        for (int i = 1; i <= nr; i++) {
            eredmeny *= i;
        }
        return eredmeny;
            }

}