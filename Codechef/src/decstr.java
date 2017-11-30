/**
 * Created by ruthless on 13/3/16.
 */

import java.io.*;
public class decstr {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        String rep=new StringBuffer("abcdefghijklmnopqrstuvwxyz").reverse().toString();
        while(t-->0)
        {
            int b=Integer.parseInt(br.readLine());
            if(b<=25)
            {
                bw.write(new StringBuffer(rep.substring(25-b,26)).toString()+"\n");
            }
            else if(b>25)
            {
                StringBuilder sb=new StringBuilder();
                int c=b%25;
                b=b/25;
                if(c!=0)
                sb.append(rep.substring(25-c,26));
                for (int i=1;i<=b;i++)
                {
                    sb.append(new StringBuffer(rep));
                }

                bw.write(sb.toString()+"\n");
            }
        }
        bw.close();
    }
}