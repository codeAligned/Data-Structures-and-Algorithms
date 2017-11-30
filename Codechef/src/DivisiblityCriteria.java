
/**
 * Created by ruthless on 8/2/16.
 */
public class DivisiblityCriteria {
    static int[] multipliers(int n, int p) {
        int ret[] = new int[n], mult = 1;
        for (int i = n - 1; i >= 0; i--, mult = (mult * 10) % p) {
            ret[i] = mult;
        }
        return ret;
    }
}
