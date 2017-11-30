

/**
 * Created by ruthless on 9/2/16.
 */
public class Rounder {
    public static int round(int n, int b) {
        int lower = 0, upper = 0;
        boolean l = false, u = false;
        for (int i = 0; i <= n; i++) {
            if ((n - i) % b == 0 || (n + i) % b == 0) {
                if ((n + i) % b == 0) return n + i;
                else if ((n - i) % b == 0) return n - i;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        System.out.print(round(5, 10));
        System.out.print(round(49, 7));
    }
}
