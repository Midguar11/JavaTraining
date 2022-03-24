package ___Help;

// Continue és Break használata minden 5 el oszthatonal csak egy ures sor irodik ki
public class Continue_Break_Help {
    public static void main(String[] args) {
             for (int i = 0; i < 20; i++) {
            System.out.print(i); // Kiirja az i értékét
            if (i % 5 == 0) { // ha 5 el oszthato akkor ez a sor teljesul
                System.out.println("");
                continue; // lehetne break is; Aztan folytatodik ha break akkor lealna a futás
            }
            System.out.println(" -  Masterfield ");
        }
    }
}
