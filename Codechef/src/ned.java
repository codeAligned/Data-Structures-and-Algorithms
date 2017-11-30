import java.io.*;

/**
 * Created by ruthless on 29/1/16.
 */
public class ned {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        String arr[][] = new String[h + 1][w + 1];
        int ho[][] = new int[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            s = br.readLine().split("");
            for (int j = 1; j <= w; j++) {
                arr[i][j] = s[j - 1];
            }
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < w; j++) {
                if (arr[i][j].equals(arr[i][j + 1]) && arr[i][j].equals(".")) {
                    ho[i][j + 1] = ho[i][j] + 1;
                } else {
                    ho[i][j + 1] = ho[i][j];
                }
            }
        }
        for (int j = 1; j <= w; j++) {
            for (int i = 1; i < h; i++) {
                if (arr[i][j].equals(arr[i + 1][j]) && arr[i][j].equals(".")) {
                    ho[i + 1][j] += ho[i][j] + 1;
                } else {
                    ho[i + 1][j] += ho[i][j];
                }
            }
        }
        int q = Integer.parseInt(br.readLine());
        {
            s = br.readLine().split(" ");
            int r1 = Integer.parseInt(s[0]);
            int c1 = Integer.parseInt(s[1]);
            int r2 = Integer.parseInt(s[2]);
            int c2 = Integer.parseInt(s[3]);
        }
    }
}
