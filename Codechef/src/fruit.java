import java.io.*;

/**
 * Created by ruthless on 24/1/16.
 */
public class fruit {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
        String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int k=Integer.parseInt(s[2]);
            while(n!=m && k!=0)
            {
                if(n>m) {
                    m+=1;
                    k-=1;
                }
                else if(m>n)
                {
                    n+=1;
                    k-=1;
                }
            }
            bw.write(Math.abs(n-m)+"\n");
        }
        bw.close();

         }

}
