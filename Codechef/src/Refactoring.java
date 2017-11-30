

/**
 * Created by ruthless on 6/2/16.
 */
public class Refactoring {
    public static int count(int n, int lf) {
        int res = 0;
        for (int i = lf; i * i <= n; i++) {
            if (n % i == 0)
                res += count(n / i, i) + 1;
        }
        return res;
    }

    public static int refactor(int n) {
        return count(n, 2);
    }
}
