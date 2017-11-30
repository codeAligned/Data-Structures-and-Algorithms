import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 13/2/16.
 */
public class HBB {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int k = Integer.parseInt(s[0]);
            int l = Integer.parseInt(s[1]);
            int e = Integer.parseInt(s[2]);
            l -= e;
            s = br.readLine().split(" ");
            int ae[] = new int[s.length];
            for (int i = 0; i < k; i++) {
                ae[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(ae);

            for (int i = 0; i < k; i++) {
                if (l == 0) {
                    bw.write("NO\n");
                    break;
                }
                if (i == k - 1) {
                    if (l % ae[i] == 0) {
                        bw.write("YES\n");
                    } else {
                        bw.write("NO\n");
                    }
                    break;
                } else {

                    l -= ae[i];
                }
            }
        }
        bw.close();
    }
}
