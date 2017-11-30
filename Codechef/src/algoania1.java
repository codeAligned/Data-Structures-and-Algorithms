import java.io.*;

/**
 * Created by ruthless on 14/2/16.
 */
public class algoania1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            int b = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            s = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);
            long z = Long.parseLong(s[2]);
            long cal = 0;
            if (x > (y + z)) {
                cal = b * (y + z) + w * y;

            } else if (y > (x + z)) {
                cal = w * (x + z) + b * x;
            } else {
                cal = b * x + w * y;
            }
            bw.write(cal + "\n");
        }
        bw.close();
    }

}
