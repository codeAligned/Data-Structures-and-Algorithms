import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 22/2/16.
 */
public class match {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ar[] = new int[n];
            long check[] = new long[n];
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(s[i]);
            }
            s = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                check[i] = Long.parseLong(s[i]);
            }
            long m = Long.parseLong(br.readLine());
            long sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                long tc = m / ar[i];
                if (Arrays.binarySearch(check, tc) >= 0) {
                    sum += 1;
                }
            }
            bw.write(sum + "\n");
        }
        bw.close();
    }
}
