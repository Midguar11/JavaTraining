package X_miden;

/* Olvass be 5 szót parancssori argumentumként. legyen egy fügvény amely végégi megy ezek szvak tömbjén.
Amelyik szó nme 5-10 közti osszuságú, ott egy saját készítésű exceptiont kell dobnia.
 */
public class Feladat_06_v2_Exeption {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                if (args[i].length() >= 5 && args[i].length() <= 10) {
                    System.out.println(args[i]);
                                    }
                else
//              System.out.println("A tomb ezen eleme kivül esik az 5  -10 es tartományon:\t" +args[i]); // Ha igy futtatnam  akkor tovabb fut a program
                throw new Exception("A tomb ezen eleme kivül esik az 5  -10 es tartományon ezert leallitom a futást:\t" +args[i]); // Sajat keszitesu hiba
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Elkapom az exceptionos hiba a benne levo uzenetet meg kiiratom
        }
        finally {
            System.out.println("Futás leált!!");
        }
    }
}
// For the Corgi!


