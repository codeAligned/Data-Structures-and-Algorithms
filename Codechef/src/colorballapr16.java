/**
 * Created by ruthless on 2/4/16.
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class colorballapr16 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            long a[]=new long[3];
            a[0]=Long.parseLong(st.nextToken());
            a[1]=Long.parseLong(st.nextToken());
            a[2]=Long.parseLong(st.nextToken());
            Arrays.sort(a);
            long n1=a[0];
            long n2=a[1];
            long n3=a[2];
            long k=Integer.parseInt(br.readLine());
            long ans=0;
            if(k<n1 || k==n1)
            {
                ans=(3*k)-2;
            }
            else if(n1<k && k<=n2)
            {
                ans=n1+(k-1)+k;
            }
            else if(n2<k && k<=n3)
            {
                ans=n1+n2+k;
            }
            bw.write(ans+"\n");
        }
        bw.close();
    }
}
