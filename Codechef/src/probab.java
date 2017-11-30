import java.io.*;
import java.util.ArrayList;

/**
 * Created by ruthless on 1/2/16.
 */
public class probab {
    static double cala(int n, int r) {
        double arr[] = new double[n + 1];
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            arr[i] = i / r;
            sum += arr[i] * arr[i];
        }
        return 1 / sum;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Double> al = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        int si = t;
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int r = Integer.parseInt(s[1]);
            double a = cala(n, r);
            for (int i = 0; i <= 2 * n; ) {
                al.add(i, (double) (i + 1 / r));
                double probab = a * (i + 1 / r) * (i + 1) / r;
                al.add(i + 1, probab);
                i += 1;
            }
        }
    }
}
