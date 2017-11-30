/**
 * Created by ruthless on 22/3/16.
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class batsman {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long arr[]=new long[n];
            for (int i=0;i<n;i++)
            {
                arr[i]=Long.parseLong(st.nextToken());
            }
            Arrays.sort(arr);
            long sum=0;
            int run=(int)Math.pow(2,n);
            for(int i=1;i<=run;i++)
            {
                int ll=0;
                int ml=Integer.toBinaryString(i).length()-1;
                if(i>1)
                 ll=ml-(Integer.numberOfTrailingZeros(i));
                long bq=(arr[ml]-arr[ll])%(1000000007);
                sum+=bq;
            }
            bw.write(sum+"\n");
        }
        bw.close();
    }
}
