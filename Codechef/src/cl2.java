import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 3/2/16.
 */
public class cl2 {
    public static void main(String arg[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            char inp[] = br.readLine().toCharArray();
            char d[] = inp;
            Arrays.sort(inp);
            for (int i = 0; i < n; i++) {
            }
        }
    }


}

