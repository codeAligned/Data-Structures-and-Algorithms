import java.io.*;


/**
 * Created by ruthless on 26/1/16.
 */
public class kes {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        boolean stop = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(s[i]);
            if (num <= m) count += 1;
            else if (!stop && num > m) {
                stop = true;
            } else {
                break;
            }
        }
        bw.write(count + "\n");
        bw.close();
    }
}
