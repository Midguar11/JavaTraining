package ___Help;

import java.util.Locale;

public class String_Help {
    public static void main(String[] args) {
        String gg = "kutaadjameg";
        System.out.println(gg.charAt(1)); // a fenti string masodik elemet irja ki
        System.out.println(gg.indexOf("k")); // megmondja melyik az első indexen ez a stringben
        System.out.println(gg.lastIndexOf("a")); // megmondja melyik az utolsó indexen ez a stringben
        System.out.println(gg.replace("t", "r")); // String elemek cseréje
        System.out.println(gg.replaceAll("[a-z]", "ddd")); // Ez komplex szabajokat alkothatsz meg a cserere hogy mikor csereljen es mire
        System.out.println(gg.replaceFirst("[a-z]", "ddd"));// Ez komplex szabajokat alkothatsz meg a cserere hogy mikor csereljen es mire. De ez balrol jobra halad
        System.out.println(gg.matches("[a-z]"));
        ;// ellenorzi a formatumot hogy megfelel e megadott kitetelnek
        String a = " Matyi";
        String b = a + " egy fiu"; // Konkatenáció 2 Sting összeadása
        System.out.println(b);
        String inSzoveg = "valami ami nem ez ami ehhhhehhe ez teszelini ez";
        String[] tombSzavak = inSzoveg.split(" "); // Sting splietelése itt tombositem es szedem szet szavankent.  A regexbe adom meg hol spiletejen, jelenleg a spacenel splittel
        int tombHossza = inSzoveg.length();
        System.out.println(tombHossza); // lekéri a String tomb hosszát és beraktam egy változóba
        boolean mivelKezdodik = inSzoveg.startsWith("valami"); // megnezni hogy a string igy kezdődik e? kis nagybetű fontos mert nem eggyezik!
        System.out.println(" A szöveg igy kezdődik valami:\t" + mivelKezdodik);
        boolean erreVegzodik = inSzoveg.endsWith("ez"); // megnezni hogy a string igy végződik e? kis nagybetű fontos mert nem eggyezik!
        System.out.println(" A szöveg igy végződik e ez:\t" + mivelKezdodik);
        String nagyBeture = gg.toUpperCase(); // nagybetűre alakítja a gg stringet egy uj stringbe rakja bele mert a string Inmutabilis tipus
        System.out.println(nagyBeture);
        String kisBeture = nagyBeture.toLowerCase(); // kisbetúre alakítja a nagybetűre stringet egy uj stringbe rakja bele mert a string Inmutabilis tipus
        System.out.println(kisBeture);
        String fragment = gg.substring(2, 7); // kivagja egy adott String darbajat index alapján, az elso szam indexe benne van de a vég index nem az elötte lévőnél zárja.
        System.out.println(fragment);
        fragment = gg.substring(2); // kivagja egy adott String darbajat index alapján, A megadott indextől a vég indexig
        System.out.println(fragment);
        String szokozOs = "      bela Mellla lamellla haha        ahhhh";
        String trimElt = szokozOs.trim(); // levagja a szokozoket az elejerol es vegerol, hasznos ha pl  számmá kell alakitani valamit
        System.out.println(szokozOs);
        System.out.println(trimElt);
        boolean empty = szokozOs.isEmpty(); // megnezi ures e a string ha ures akkor jon vissza trueval
        System.out.println(empty);
        boolean wildSpace = szokozOs.isBlank(); // Vizsgalja hogy wildpsace karakterekből űll e space tab enter, ha igen akkor trueval jön vissza
        System.out.println(wildSpace);
        System.out.println(gg.contains("kut"));// tartalmazza e a string ezt a szovegreszt ha igen trueval jon vissza
        System.out.println(gg.equals(szokozOs));// logikai egyenloseget vizsgal a 2 stringben ha egyformak akkor igazzal jon vissza, az IgnoreCassel a kis nagybetut nem viszgalja
        String exlaminationMarks = "buv".repeat(10); // Ismetli a stringet a megadott counter ertek alapjan
        System.out.println(exlaminationMarks);
    }
}

