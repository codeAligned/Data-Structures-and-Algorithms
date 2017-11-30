import java.io.*;

/**
 * Created by ruthless on 14/2/16.
 */
public class ranker {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String sa[] = br.readLine().split(" ");
            int n = Integer.parseInt(sa[0]);
            long s = Integer.parseInt(sa[1]);
            long exp = n * (n + 1) / 2;
            long diff = Math.abs(exp - s);
            int inp[] = new int[n + 1];
            int ne = n;
            for (int i = 1; i <= n; i++) {
                inp[i] = i;
            }
            long ch = 0;
            for (int i = n; i >= 1; i--) {
                boolean c = false;
                while (inp[i] > 1 && diff > 0) {
                    inp[i] -= 1;
                    diff -= 1;
                    c = true;
                }
                if (c) {
                    ch = ch + 1;
                }
            }
            bw.write(ch + "\n");
        }
        bw.close();
    }
}
