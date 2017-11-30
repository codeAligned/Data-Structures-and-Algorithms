import java.io.IOException;
import java.util.Arrays;


/**
 * Created by ruthless on 6/2/16.
 */
public class PrimeAnagrams {

    static boolean prime[];

    public static void permutation(String str) {
        permutation("", str);
    }

    public static void count(String s) {
        int ret[] = new int[0];
        boolean switch1 = false;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= s.length() - 3; i++) {
            for (int j = i + 1; j <= s.length() - 2; j++) {

                int n1 = Integer.parseInt(s.substring(0, i));
                // 2nd number is digits i through j-1
                int n2 = Integer.parseInt(s.substring(i, j));
                // 3rd number is digits j through len(p)-1
                int n3 = Integer.parseInt(s.substring(j, s.length()));
                if (!(s.substring(0, i).charAt(0) == '0') && !(s.substring(i, j).charAt(0) == '0') && !(s.substring(j, s.length()).charAt(0) == '0')) {
                    switch1 = true;
                    if (prime[n1] && prime[n2] && prime[n3]) {
                        if (min > (n1 * n2 * n3)) {
                            System.out.println(n1 + " " + n2 + " " + n3 + "\n");
                        }
                    }
                } else {
                    if (!switch1)
                        System.out.println("wtf\n");
                }

            }
        }

    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static void sieve(int n) {
        n = 10000000;
        prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i; j * i <= n; j++) {
                    prime[j * i] = false;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        sieve(11);
        permutation("352279");
    }
}
