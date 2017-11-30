import java.io.*;

/**
 * Created by ruthless on 8/2/16.
 */
public class dcd {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) bw.write(n / 2 + " " + n / 2 + "\n");
            else bw.write((n / 2) + " " + (n / 2 + 1) + "\n");
        }
        bw.close();
    }
}
