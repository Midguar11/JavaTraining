package ___Help;

// tömb: összetett adattípus, 0-tól indexeljük
public class Array_Tomb_Help {
    public static void main(String[] args) {
        int[] numbers = {99, 2, 6, 8, 10}; // 1 Dimenzios szám tipusu tömbb deklarálása és definiálása érték adással, hossza az elemek száma alapján autamtikus
        numbers = new int[]{99, 2, 6, 8, 10}; // létező tömb felülirása, uj paraméterekkel és elemekkel
        System.out.println(numbers[0]); // kiiratjuk a tömb x elemét esetünkben ez a 0 elem azaz az1 elem
        System.out.println(numbers.length); // kiiratjuk tömb elemek darab száma
        System.out.println(numbers[numbers.length - 1]); // kiiratjuk utolsó elem
        numbers[0] = 44; // Felülirjuk a tömb 1 elemét (0 indexen )

        //-********************************

        int[] numbers2 = new int[4]; //  4 = elemek száma, tömb hossza, minden eleme 0 lesz
        System.out.println(numbers2.length);//kiiratjuk a tömb elemeinek darab száma ( hosszát )
        System.out.println(numbers2[3]);//kiiratjuk a tömb elemének 3 indexen lév őelemét ( 4. elem )
        String[] namesStr = { "Petőfi", "Kossuth", "Móricz", "Gárdonyi"}; // 1 Dimenzios String tipusu tömbb deklarálása és definiálása érték adással, hossza az elemek száma alapján autamtikus
        System.out.println(namesStr[3]); // Kiiratom a Gárdonyi-t
        namesStr[3] = "Banán"; // 3 elemet felülirom arra hogy Banán
        System.out.println(namesStr[3]); // kiiratom a 4. elemet

        //-********************************

        int[][] matrix = {{11,22,23}, {43,5,78,3}}; // Több Dimenzios szám tipusu tömbb deklarálása és definiálása érték adással, hossza az elemek száma alapján autamtikus
        System.out.println(matrix.length); // Több Dinezios tömbbök darab száma
        System.out.println(matrix[0].length); // Több Dinezios tömb 0 matrix elemeinek darab száma {11,22,23}
        System.out.println(matrix[1].length); // Több Dinezios tömb 1 matrix elemeinek darab száma {43,5,78,3}
        System.out.println(matrix[1][2]); ////Kiiratjuk az 1 tömb elemének 2. indexen lévő elemét ( 3. elem " 78" )
        int iFromUser = 99; // Példa egy új valtozoba bekert érték usertől
        matrix[1][3] = iFromUser; // Példa: egyenlővé teszem a bekárt változóval az 1 mátrix 4 indexén lévő elemet
        System.out.println( matrix[1][3]); // Kiiratva a 99 lesz
        matrix[1][3] = 11; // Direktbe felülirom ezt az elemet 11 el
        System.out.println( matrix[1][3]); // Kiiratva ez már 11

        //-********************************

        matrix[1] = new int[]{75, 74, 71, 79, 59}; // A tomb 1 tombjét rekonfigurálom uj értkkeket és hosz kap
        System.out.println(matrix[1].length); // Kiiratva hossszát ez mostmár 5 darabot tartalmazo tomb
        int sizeFrumUser = 33; // Példa változoba bekérem az értéket usertöl ez lesz majd a tömbb hossza
        int[] usertomb = new int[sizeFrumUser];// Deklarálom a user által megadott hoszra a tömbböt
        System.out.println(usertomb.length);// Kiiratom a tomb hosszát ami 33
           }
}
