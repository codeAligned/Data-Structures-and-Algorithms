import java.io.*;
import java.math.BigInteger;
import java.util.Vector;

/**
 * Created by ruthless on 3/2/16.
 */
public class cl1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Vector<BigInteger> vi = new Vector<>(n + 1);
        vi.add(0, BigInteger.ZERO);
        vi.add(1, BigInteger.ONE);
        BigInteger ms = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            vi.add(i, vi.get(i - 1).add(vi.get(i - 2)));
            ms = ms.add(vi.get(i));
        }
        BigInteger res = BigInteger.ZERO;
        s = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            res = res.add(new BigInteger(s[i]));
        }
        BigInteger sum = BigInteger.ZERO;

        bw.write(ms.subtract(res) + "\n");
        bw.close();
    }
}