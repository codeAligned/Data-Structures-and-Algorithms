import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 8/2/16.
 */
public class coder {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int max = -1;
        while (k-- > 0) {
            s = br.readLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            int sum = 0;
            for (int i = n - 1; i >= n / 2; i--) {
                sum += arr[i];
            }
            if (max < sum) max = sum;
        }
        bw.write(max + "\n");
        bw.close();
    }
}
