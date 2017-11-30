import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 5/2/16.
 */
public class indexsort {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String inp[] = new String[2000001];
        Arrays.fill(inp, "");
        int max = -1;
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int t = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);
            if ((t + d) > max) {
                max = t + d;
            }
            inp[t + d] += (i + 1) + "";
        }
        for (int i = 1; i <= max; i++) {
            if (!inp[i].equals("")) {
                String arr[] = inp[i].split("");
                Arrays.sort(arr);
                for (int j = 0; j < arr.length; j++) {
                    bw.write(arr[j]);
                    if (arr.length - j >= 1) {
                        bw.write("");
                    }
                }

            }
        }
        bw.close();
    }
}
