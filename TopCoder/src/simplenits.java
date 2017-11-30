        /**
         * Created by ruthless on 22/3/16.
         */

        import java.io.*;

        public class simplenits {
            public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                int t=Integer.parseInt(br.readLine());
                int max=Integer.MIN_VALUE;
                while(t-->0)
                {
                    String s[]=br.readLine().split(" ");
                    int w=Integer.parseInt(s[0]);
                    int ta=Integer.parseInt(s[1]);
                    int l=Integer.parseInt(s[2]);
                    int expr=(3*w)+(ta)-(l);
                    if(expr>max) max=expr;
                }
                bw.write(max+"\n");
                bw.close();
            }
        }
