        import java.io.*;
        import java.util.Arrays;
        import java.util.HashMap;

        /**
         * Created by ruthless on 5/3/16.
         */
        public class count {
            public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                char c[] = br.readLine().toCharArray();
                int l = c.length;
                int x = 0, y = 0;
                int a = 0, b = 0;
                for (int i = 0; i < l; i++) {
                    if (c[i] == 'N') {
                        y += 1;
                    } else if (c[i] == 'E') {
                        x += 1;
                    } else if (c[i] == 'W') {
                        x -= 1;
                    } else {
                        y -= 1;
                    }
                }
                while(x - a > 0) {
                    bw.write("E");
                    x-=1;
                }
                while (x - a < 0)
                {
                    bw.write("W");
                x+=1;
                }
                while (y - b > 0)
                {
                    bw.write("N");
                y-=1;
                }
                while (y - b < 0)
                {
                    y+=1;
                    bw.write("S");
                }
                bw.close();
            }
        }
