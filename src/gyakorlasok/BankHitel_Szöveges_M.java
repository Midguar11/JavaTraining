package gyakorlasok;

public class BankHitel_Szöveges_M {
    public static void main(String[] args) {
        boolean isCorp = true;      // true: vállalati, false: magánszemély
        int establishYear = 2014;
        String corpType = "KIS"; // KOZEP, NAGY, MIKRO, KIS
        boolean hasAppliedToPalyazat = true;
        int age = 18;
        String tempCity = "Budapest";
        String permCity = "Szeged";

        if (/* */  !corpType.equals("KIS")) {
            System.out.println("Az ügyfél kaphat hitelt!");
        } else {
            System.out.println("Az ügyfél nem kaphat hitelt!");
        }

        if ((isCorp && (corpType.equals("MIKOR") || corpType.equals("KIS"))) || // 1.
                (isCorp && (corpType.equals("KOZEP") || corpType.equals("NAGY")) && !hasAppliedToPalyazat) || // 2.
                (!isCorp && (!permCity.equals("Budapest") || (permCity.equals("Budapest") && !tempCity.equals("Budapest"))))) { // 3.
            System.out.println("Az ügyfél kaphat hitelt!");
        } else {
            System.out.println("Az ügyfél nem kaphat hitelt!");
        }
    }
}
