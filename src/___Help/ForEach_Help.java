package ___Help;

public class ForEach_Help {
    public static void main(String[] args) {
        String[] ValutaTypes = {"EUR", "USD", "HUF", "CHF"}; // Létrehozok egy string tömbött 4 értékkel ez lehetne mas adat tipusu tömbb is

        for (String currency : ValutaTypes) // Bal oldalon Deklarálunk egy uj változot ebbe töltödnek be a Jobb oldal tomb értkei az elsőtöl kezdve elkezdi kiirni őket
        {
        System.out.println("Péznem:");
            System.out.println(currency);
            System.out.print("ennyid van: 30");
            System.out.println("");
        }

        // Igy is lehetne de ez nem elegáns
//        for (int i = 0; i < currencies.length; i++) { // kevésbé olvasható és van egy felesleg i változónk
//            String currency = currencies[i];
//            System.out.println(currency.toLowerCase());
//        }
    }
}
