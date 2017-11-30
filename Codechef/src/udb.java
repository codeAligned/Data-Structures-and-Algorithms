import java.io.*;

/**
 * Created by ruthless on 1/2/16.
 */
public class udb {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int t = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int arr[] = new int[t];
            int min = Integer.MAX_VALUE;
            int count = 0;
            for (int i = 0; i < t; i++) {
                arr[i] = Integer.parseInt(s[i]);
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            bw.write(min - 1 + " ");
            for (int i = 0; i < t; i++) {
                count += arr[i] - 1;
            }
            bw.write(count + "\n");
        }
        bw.close();
    }
}
