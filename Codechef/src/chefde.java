import java.io.*;

/**
 * Created by ruthless on 5/2/16.
 */
public class chefde {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int arr[] = new int[n + 1];
        int max = -1;
        boolean res[] = new boolean[100000 + 1];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = Integer.parseInt(s[i]);
            res[arr[i + 1]] = true;
            if (arr[i + 1] > max) max = arr[i + 1];
        }
        for (int i = 0; i <= n; i++) {
            if (!res[i])
                bw.write(i + " ");
        }
        bw.close();
    }
}
