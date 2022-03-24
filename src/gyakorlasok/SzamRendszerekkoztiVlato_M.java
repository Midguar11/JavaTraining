package gyakorlasok;

public class SzamRendszerekkoztiVlato_M {

    public static void main(String[] args) {

        int szam = 155;
        int celSzamrendszer = 3;
        System.out.println(szamrendszerValtas(szam, celSzamrendszer));
        System.out.println(szamrendszerValtas(10,2));
        System.out.println(szamrendszerValtas(255,16));
//        System.out.println("A "+celSzamrendszer+"-ben:"+eredmeny);

    }

    private static String szamrendszerValtas(int szam,  int celSzamrendszer) {
        String eredmeny = "";
        while (szam >0) {
            String maradek="";//szam % celSzamrendszer;
            switch (szam % celSzamrendszer){
                case 15:maradek="F";break;
                case 14:maradek="E";break;
                case 13:maradek="D";break;
                case 12:maradek="C";break;
                case 11:maradek="B";break;
                case 10:maradek="A";break;
                default:maradek += szam % celSzamrendszer;break;
            }
            eredmeny = maradek + eredmeny;
            szam = szam / celSzamrendszer;
            //System.out.println(eredmeny);
        }
        return eredmeny;
    }


}
