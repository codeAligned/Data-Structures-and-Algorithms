import java.util.Arrays;

/**
 * Created by ruthless on 8/2/16.
 */
public class PrimePolynom {
    public static boolean[] sieve(int n) {
        boolean primes[] = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i; j * i <= n; j++) {
                    primes[j * i] = false;
                }
            }
        }
        return primes;
    }

    public static int reveal(int a, int b, int c) {
        boolean res[] = sieve(1000000);
        int r = 0;
        for (int i = 1; i <= 1000000; i++) {
            int cal = (a * i * i) + (b * i) + c;
            if (cal > 0) {
                if (!res[cal])
                    return i;
            } else return 0;
        }
        return 0;
    }

    public static void main(String args[]) {
        System.out.println(reveal(1, -79, 1601));
    }
}
