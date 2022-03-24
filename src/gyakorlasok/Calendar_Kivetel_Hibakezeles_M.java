package gyakorlasok;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Calendar_Kivetel_Hibakezeles_M {

    public static void main(String[] args) {

        final int JELEN_EV = Calendar.getInstance().get(Calendar.YEAR);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(" Kérem az életkorát:");
        try {
            String korString = br.readLine();
            int kor = Integer.parseInt(korString);
            int szulEv = JELEN_EV - kor;
            korEllenoriz(kor);
            System.out.println(" Az on szuletesi éve:" + szulEv);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println(" Számokkal kell beírni az életkor");
        } catch (Exception kivetel) {
//            System.err.println("Túl magas vagy alacsony életkor");
            System.err.println(kivetel.getMessage()); //20 vagy 22 if alapjan eldonti mi az uzenet
        }

    }

    private static void korEllenoriz(int kor) throws Exception {
        if (kor <= 0) {
            throw new Exception(" Nem lehet negativ az eletkor");
        }
        if (kor >= 150) {
            throw new Exception(" Nem lehet 150 vagy annál több az eletkor");
        }
    }
}
// For the Corgi!!