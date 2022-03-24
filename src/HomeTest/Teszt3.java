package HomeTest;

public class Teszt3 {
    public static void main(String[] args) {
    String a = "bubu"; // String literal Heapben ugyanoda kerultek a 2 hivatkozasa a memoriaban ugyanott van
    String b = "bubu"; // String literal Heapben ugyanoda kerultek a 2 hivatkozasa a memoriaban ugyanott van
        System.out.println(a == b); // ha igy vizsgalom akkor a helyét vizsgálja meg tehát mivel egy helyen vannak a válasz true
        String c = new String("bubu"); // Ezek mar objectumkent viselkednek kulon helykre kerulnek a hepaben memoriaban kulon hivatkozasok
        String d = new String("bubu"); // Ezek mar objectumkent viselkednek kulon helykre kerulnek a hepaben memoriaban kulon hivatkozasok
        System.out.println( c == d ); // ha igy vizsgalom akkor a helyét vizsgálja meg tehát mivel nem egy helyen vannak a válasz false
        System.out.println( a.equals(b)); // Ha igy viszgalom akkor a tartalmat vizsgalom ami True barhogy is hoztam létre és bárhol tárolodik
        System.out.println( c.equals(d)); // Ha igy viszgalom akkor a tartalmat vizsgalom ami True barhogy is hoztam létre és bárhol tárolodik
    }
}