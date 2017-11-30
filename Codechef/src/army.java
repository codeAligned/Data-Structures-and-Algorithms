import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 22/2/16.
 */
public class army {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int ar[] = new int[2 * n];
            for (int i = 0; i < s.length; i++) {
                ar[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(ar);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (ar[(2 * n) - (i + 1)] - ar[i]);
            }
            bw.write(sum + "\n");
        }
        bw.close();

    }
}
