package X_miden;

/* Olvass be 5 szót parancssori argumentumként. legyen egy fügvény amely végégi megy ezek szvak tömbjén.
Amelyik szó nme 5-10 közti osszuságú, ott egy saját készítésű exceptiont kell dobnia.
 */
public class Feladat_06_v1_Exeption {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() >= 5 && args[i].length() <= 10) {
                System.out.println(args[i]);
            } else {
                System.err.println(" Ennek az argumentum betüinek száma nem esik 5-10 közé, ez a tömb:" + i + " eleme");

            }
        }
    }
}
// For the Corgi!


