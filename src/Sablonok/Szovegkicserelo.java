package Sablonok;

public class Szovegkicserelo {
    public static void main(String[] args) {
        String eredmeny = censor("A jó anyad nagyon aranyos anyad", "anyad", "*******");
        System.out.println(eredmeny);
    }

    public static String censor(String text, String toChange, String newWord) {
        text = text.replaceAll(toChange, newWord);
        return text;
    }

}
// For the Corgi!