/**
 * Created by ruthless on 6/2/16.
 */
public class CoinFlipsDiv2 {
    public static int countCoins(String s) {
        char c[] = s.toCharArray();
        int r = 0;
        if (c.length == 1) return 0;
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                if (c[i] != c[i + 1]) r += 1;
            }
            if (i == c.length - 1) {
                if (c[i - 1] != c[i]) r += 1;
            } else {
                if (c[i] != c[i - 1] || c[i] != c[i + 1]) r += 1;
            }
        }
        return r;
    }
}
