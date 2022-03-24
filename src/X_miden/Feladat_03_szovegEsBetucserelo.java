package X_miden;

/*Irjunk algoritmust ami beolvassa a parancssorból egy szöveget, megcseréli a szöveg
első felét a másodikkal, kicseréli az "a" betűket " i"-re*/

public class Feladat_03_szovegEsBetucserelo {
    public static void main(String[] args) {
//        System.out.println(args.length);
        int argLeng = args.length; // valtozoba beolvasom az argumetum tomb hosszát ( erőforrsá takarékos)
        int argHalfl = argLeng / 2; // Ezt osztom mivel a felénél át kell hoznom a szöveget, ezt is változóba rakom
        String[] csereltArg = new String[argLeng]; // létreghozok egy uj tömböt amibe majd rakom az uj értkeket  aminek hossza autamtikusan az arg tomb hossza.
        for (int i = 0; i < argHalfl; i++) { // for ciklusban a masodik felét beolvasom a tömb első felébe
            csereltArg[i] = args[i + argHalfl];
        }
        for (int i = argHalfl; i < argLeng; i++) { // for ciklusban a tömb első felét bolvasom a tömb masodik felébe
            csereltArg[i] = args[i - argHalfl];
        }
        System.out.println("Az eredeti argument szövege:\n");
        for (int i = 0; i < argLeng; i++) { // kiiratom az eredeti argumetum tömb szövegét
            System.out.print(args[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < argLeng; i++) {
            csereltArg[i] = csereltArg[i].replace("a", "i"); // kicseréltetem az a és A betűket i re
            csereltArg[i] = csereltArg[i].replace("A", "i");
        }
        System.out.println();
        System.out.println("\nA cserélt argumetumok szövege:\n"); // kiiratom a végeredményt
        for (int i = 0; i < argLeng; i++) {
            System.out.print(csereltArg[i] + ", ");
        }
        System.out.println();
    }
}
// For the Corgi!