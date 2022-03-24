package ___Help;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Calendar_Kivetel_Hibakezeles_Bufferreader_Help {

    public static void main(String[] args) {

        final int JELEN_EV = Calendar.getInstance().get(Calendar.YEAR); // Calendar tool behivása
        InputStreamReader isr = new InputStreamReader(System.in);  // Input reader toll meghivasa
        BufferedReader br = new BufferedReader(isr); // Bufferr reader hasznalta addig var mig entert nem kap, szürözhető
        System.out.print(" Kérem az életkorát:");
        try {                                             // hibakeresés miatt ezt a részt ami ez utan jön mindekép futatja
            String korString = br.readLine();
            int kor = Integer.parseInt(korString);
            int szulEv = JELEN_EV - kor;
            korEllenoriz(kor);                              // Itt behivom a kor ellenörzős Methodot
            System.out.println(" Az on szuletesi éve:" + szulEv);
        } catch (NumberFormatException e) {                    // elkapom a hiba uzenetet ami az "e" ből jön "
            e.printStackTrace();
            System.err.println(" Számokkal kell beírni az életkor"); // Ezt iratom ki rá akkor ha nem szamokat ir be
        } catch (Exception kivetel) {
            System.err.println(kivetel.getMessage()); // Eldönti mi a hiba üzenet
        }

    }

    private static void korEllenoriz(int kor) throws Exception { // Behivom a user altal megadott kor értéket
        if (kor <= 0) {
            throw new Exception(" Nem lehet 0 vagy negativ az eletkor"); // ellenorzi a beviteli értéket ha kisebb vaay egyenlő 0 akkor az eldobaj catch ágra.
        }
        if (kor >= 150) { // Ha a kor értéke nagyobb mint 150 akkor ezt a hibat dobja catch felé
            throw new Exception(" Nem lehet 150 vagy annál több az eletkor");
        }
    }
}
// For the Corgi!!