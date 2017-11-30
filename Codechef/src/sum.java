import java.io.*;

/**
 * Created by ruthless on 13/2/16.
 */
public class sum {
    public static int flm(int n, int k) {
        for (int i = n; i >= 0; i--) {
            if (i % k == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int p = (k - 1) / 2 * (k);
            int mul = ((int) Math.floor(n / k)) * k;
            int l = n - mul;
            int sum = (mul / k) * p;
            int adder = 1;
            for (int i = 1; i <= l; i++) {
                if ((mul + i) % k != 0) {
                    sum += adder;
                    adder += 1;
                } else
                    adder = 1;
            }
            bw.write(sum + "\n");
        }
        bw.close();
    }

}
