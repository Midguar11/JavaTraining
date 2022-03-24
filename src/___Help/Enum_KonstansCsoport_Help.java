package ___Help;

//Enum olyan string csoportot tudunk letrekozni melynek tagjai Konstansak azaz nem modsithatoak az elnevezeseket nagybetűvel kell irni

public class Enum_KonstansCsoport_Help {
    enum Teszt {DADA, MAMA, PAPA} //Enum létrehozása Function és Methodon kivűl értéke kihatt a teljes clasra

    public static void main(String[] args) {
        enum Level {LOW, MEDIUM, HIGH}
        ; //Enum létrehozása Function és Methodon belül csak ezen belül léteznek és védettek
        System.out.println(Level.LOW);
        System.out.println(Teszt.DADA);
    }

    public static void der(String[] args) {
        System.out.println(Teszt.DADA);
    }

}
