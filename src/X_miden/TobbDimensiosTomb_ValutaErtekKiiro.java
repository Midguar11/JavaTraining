package X_miden;

public class TobbDimensiosTomb_ValutaErtekKiiro {
    public static void main(String[] args) {
       // two dimensional Array , 3 * 3  rows and colums
        int[][] twoDim = {
                {2020, 28, 49, 55},
                {2021, 24, 26, 200},
                {2022, 45, 54, 300}
        };

        int a = (twoDim.length);
        int b = (twoDim[0].length);
        int x = -1;
        System.out.println(" Váltási árfolyamok forintban 1 valuta egységre vonatkozoan éves bontásban");
        System.out.println(" \t\t  Euro \t/ USD \t/ Font ");
        for (int i = 0; i < a; i++) { // Row counter
            for (int j = 0; j < b; j++) { // Colum counter
                if (twoDim[i][j] < 1000) {
                    System.out.print("\t" + twoDim[i][j] +"-Ft");
                } else
                System.out.print("\t" + twoDim[i][j] +"|");
                           }
            System.out.println();
            System.out.println("-----------------------");
        }
    }
}
//For the Corgi!!