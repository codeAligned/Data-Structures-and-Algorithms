import java.io.*;

public class KMP {
    public static void main(String arg[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int j = 0;
        while (j < t) {
            String s = br.readLine();
            char inp1[] = s.toCharArray();
            char i1[] = new StringBuffer(s).reverse().toString().toCharArray();
            int count = 0;
            for (int i = 0; i < inp1.length; i++) {
                if (inp1[i] == i1[i]) {
                    count += 1;
                } else
                    break;
            }
            if (count == 0) bw.write("Case " + (j + 1) + ": -1\n");
            else bw.write("Case " + (j + 1) + ": " + count + "\n");
            j += 1;
        }
        bw.close();
    }
}