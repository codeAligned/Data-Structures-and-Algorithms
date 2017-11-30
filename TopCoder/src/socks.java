import java.io.*;

/**
 * Created by ruthless on 27/2/16.
 */
public class socks {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().split(" ");
        int jc = Integer.parseInt(s[0]);
        int sc = Integer.parseInt(s[1]);
        int tc = Integer.parseInt(s[2]);
        tc -= jc;
        if (tc == 0)
            bw.write("Unlucky Chef\n");
        else {
            int dub = tc / sc;
            if(dub%2!=0) bw.write("Unlucky Chef\n");
            else bw.write("Lucky Chef");
        }
        bw.close();
    }
}
