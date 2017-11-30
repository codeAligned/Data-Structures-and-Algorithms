import java.util.Arrays;

/**
 * Created by ruthless on 9/2/16.
 */
public class ChangePurse {
    public static int[] optimalCoins(int[] a, int n) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        int res[] = new int[b.length];
        for (int i = b.length - 1; i >= 0; i--) {
            int t = b[i];
            if ((n + 1) % t == 0) {
                res[i] = ((n + 1) / t) - 1;
                n = n - (res[i] * b[i]);
                if (n == 0) break;
            }
        }
        int cal[] = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    cal[i] = res[j];
                }
            }
        }
        return cal;
    }

    public static void main(String argsp[]) {
        for (int i : optimalCoins(new int[]{795, 5536, 26, 915, 18590, 60840, 49140, 2,
                119700, 162235, 369000, 383936, 478800, 505995,
                949, 95984, 455, 8, 420, 239400, 276800, 191968,
                619305, 654810, 706420, 393120, 738000, 767872,
                425880, 786240, 830400, 676, 4500, 851760, 957600,
                648940, 1, 112, 180, 457}, 687245439)) {
            System.out.println(i + " ");
        }
    }
}
