import java.io.*;

/**
 * Created by ruthless on 2/2/16.
 */
public class paradise {

    public static int func(int p, int arr[], int k) {
        int m = -1, sum = 0;
        sum = arr[p];
        for (int i = p; i < arr.length; i += 1) {
            if (i - p >= k + 1 && arr[i] > 0) {
                sum += func(i, arr, k);
                if (m < sum) {
                    m = sum;
                }
            }

        }
        return m;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int ar[] = new int[n];
            int res[] = new int[n];
            s = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(s[i]);
            }
            for (int i = 0; i <= k; i++) {
                if (ar[i] > 0) {
                    res[i] = func(i, ar, k);
                }
            }
        }
    }
}