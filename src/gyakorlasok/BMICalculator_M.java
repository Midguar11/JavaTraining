package gyakorlasok;

import java.util.Scanner;

public class BMICalculator_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány kiló vagy?");
        double s = sc.nextDouble();
        if (s > 220) {System.out.println(" NEM vagy te elefánt!");
        }
        System.out.println("Milyen magas vagy (cm)?");
        double m = sc.nextDouble();
        if (m > 230) {System.out.println(" NEM vagy te zsiráf!!!");
        }
        double BMI = s / ((m / 100.0f) * (m / 100.0f));
        if (BMI <= 18.5 ) {
            System.out.println("sovány vagy" + " A Testömeg indexed:  " +   BMI + " kg/m2");
                    } else if (BMI <= 25 ) {
            System.out.println("Normális érték" + " A Testömeg indexed:  "   + BMI + " kg/m2");
        }
        else if (BMI < 30 ) {
            System.out.println("Normális érték" + " A Testömeg indexed:  "   + BMI + " kg/m2");
        }
        else
            System.out.println("Kövér vagy, futás!" + " A Testömeg indexed:  " +   BMI + " kg/m2");
        }
            }
// For the Corgi!