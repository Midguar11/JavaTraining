package X_miden;

public class ArgumentHosszVizsgalo {
    public static void main(String[] args) {
        String N = "";
        for (int i = 0; i < args.length; i++) {
                if (args[i].length() > N.length()) {
                N = args[i];
            }
        }
        System.out.println(" Leghosszabb argumentum:\n" + N);
    }
}
