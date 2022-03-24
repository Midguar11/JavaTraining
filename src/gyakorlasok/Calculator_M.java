package gyakorlasok;

import java.util.Scanner;

public class Calculator_M {
    public static void main(String[] args) {

        int a;              // felhasználó adja meg
        int b;              // felhasználó adja meg
        String op = "";     // felhasználó adja meg
        boolean hibasOperator = false;  // true: hibás operátort adott meg
        int result = 0;     // Az eredmény

        // Adatok bekérése a felhasználótól
        Scanner sc = new Scanner(System.in);
        System.out.println("First number pls!");
        a = sc.nextInt();
        System.out.println("Second number pls!");
        b = sc.nextInt();
        System.out.println("You are given Operator!");
        op = sc.next();

        // Opertáror ellenőrzése
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("/")) {
            result = a / b;
        } else {
        hibasOperator = true; // hibás a megadott operátor
        }
        if (hibasOperator) {
            System.out.println("You are gived wrong operators!");
        } else {
            System.out.println("a " + op + " b = " + result);
        }
    }
}
// For the corgi!