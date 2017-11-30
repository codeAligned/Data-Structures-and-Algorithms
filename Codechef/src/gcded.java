import java.io.*;
import java.util.HashMap;

/**
 * Created by ruthless on 4/2/16.
 */
public class gcded {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int max(int x, int y, int k)

    {
        if (k > 0) {
            map.put(x, y);
            if (!map.get(x).equals(y))
                return Math.max(Math.max(gcd(x + 1, y), gcd(x - 1, y)), Math.max(gcd(x, y + 1), gcd(x, y - 1)));
            else
                return Integer.MIN_VALUE;
        }
        return 0;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
//bw.write(max());
        }
    }
}
