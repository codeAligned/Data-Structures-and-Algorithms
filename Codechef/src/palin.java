import java.io.*;
import java.util.Vector;

/**
 * Created by ruthless on 2/2/16.
 */
public class palin {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int inp[] = new int[n];
        int out[] = new int[n];
        Vector<String> heck = new Vector<>();
        for (int i = 0; i < n; i++) {
            String ip = br.readLine();
            heck.add(i, ip);
        }
        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(heck.get(i));
            String ip = sb.reverse() + "";
            if (heck.contains(ip)) {
                bw.write(ip.length() + " " + ip.charAt(ip.length() / 2) + "");
                break;
            }
        }
        bw.close();
    }
}
