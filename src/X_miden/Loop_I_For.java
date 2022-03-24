package X_miden;

public class Loop_I_For {
    public static void main(String[] args) {
        int N = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = N * i;
            System.out.println(N + " x " +i + " = " +result);
        }
    }
}

