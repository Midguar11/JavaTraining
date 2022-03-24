package X_miden;

/* Döntsük el van e nulla egy szamokbol allo tömbben
Bővítsük úgy hogy kiirja az első 0 elem pozicióját
 */
public class Feladat22_Döntés {
    public static void main(String[] args) {

        int[] tombNul = {1, 1, 1, 5, 0, 6, 7, 3};
        int cnt = 0;
        for (int i = 0; i < tombNul.length; i++) {
            if (tombNul[i] == 0) {
                cnt++;
                if (cnt == 1) {
                    System.out.println("Az első nullas elem poziciója:\t" + i);
                }
            }
        }
        if (cnt > 0) {
            System.out.println("van nulla a tombben");
        } else System.out.println(" Nincs nulla a tömbben");
    }
}
// For the corgi!

