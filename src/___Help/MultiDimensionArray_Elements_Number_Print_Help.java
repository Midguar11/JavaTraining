package ___Help;

public class MultiDimensionArray_Elements_Number_Print_Help {
    public static void main(String[] args) {

        int [][] twoDim = new int [5][3];

        int a = (twoDim.length);//5
        int b = (twoDim[0].length);//5
        int x = -1;
        for(int i = 0; i < a; i++){ // 1 2 3 4 5
            for(int j = 0; j <b; j++) { // 1 2 3 4 5
//                int x = (i+1)*(j+1);
                x++;
                twoDim[i][j] = x;
                if (x<10) {
                    System.out.print(" " + x + " ");
                } else {
                    System.out.print(x + " ");
                }
            }//end of for J
            System.out.println();
        }//end of for i


    }
}
