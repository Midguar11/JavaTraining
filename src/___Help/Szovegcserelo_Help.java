package ___Help;

public class Szovegcserelo_Help {
    public static void main(String[] args) {
        String eredmeny = censor("A jó anyad nagyon aranyos anyad", "anyad", "*******"); // declaralok egy eredmeny nevű stringet amit egyenlő lesz egy meghívót fügvénnyel és elemivel
        System.out.println(eredmeny); // kiiratom a tartalmat
    }

    public static String censor(String text, String toChange, String newWord)/* String tomb censor létrehozom és elnevzem őket 3 változóval.*/ {
        text = text.replaceAll(toChange, newWord);// textben irja felül a toChange, a new world értékére
        return text; // a text értékét hozza vissza
    }
// az egész eredménye hogy ki sem irja az ereditelg be írt csunya szavakat
}
// For the Corgi!