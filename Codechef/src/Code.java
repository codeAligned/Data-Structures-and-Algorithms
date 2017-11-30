import java.io.*;

class Code {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            int l = str.length();
            int count = 0;
            for (int i = 0; i < l; i++) {
                char ch = str.charAt(i);

                if (ch == 'A' | ch == 'D' | ch == 'O' | ch == 'P' | ch == 'R' | ch == 'Q')
                    count++;
                else if (ch == 'B')
                    count += 2;
            }
            bw.write(count + "\n");
        }

        bw.close();
    }
}