package ___Help;

public class SzovegFormazas_Help {
    public static void main(String[] args) {

        // Unicode

        System.out.println("\u0392"); // Javaban ha konkrét karakterre akarunk hivatkozni es kiiratni akkor igy lehet
        //az unicod tabla kodja alapjan. https://unicode-table.com/hu/


        // Műveletek


        System.out.println("felhasználótol által beírt szöveg\t" + " aaaaaaaaaaaaaaa"); // \t Tabulator
        System.out.println("felhasználótol által beírt szöveg\n" + "aaaaaaaaaa"); // \n új sor
        System.out.println("felhasználótol\"\"\" által beírt szöveg" + "aaaaaaaaaa");// \ ez escape után hasznalhato olyan speicalis karakter ami egyebkent a rendszer utasitasa
        System.out.println("felhasználótol\r");//vissza soremelés nélkül
        System.out.println("felhasználótol\f");// Lapdobás
        System.out.println("felhasználótol\r");//vissza soremelés nélkül


    }
}
