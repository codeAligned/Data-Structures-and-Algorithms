import java.io.*;

/**
 * Created by ruthless on 8/2/16.
 */
public class bakku {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().split(" ");
        int p1 = Integer.parseInt(s[0]);
        int p2 = Integer.parseInt(s[1]);
        int bakku[] = new int[100001];
        for (int i = 1; i <= 100000; i++) {
            if (i % p1 == 0 || i % p2 == 0) bakku[i] = 1 + bakku[i - 1];
            else bakku[i] = bakku[i - 1];
        }
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            double a = bakku[y];
            double b = bakku[x - 1];
            Double f = (a - b) / (y - x + 1);
            System.out.printf("%.6f", f);
            System.out.println();
        }
    }
}
