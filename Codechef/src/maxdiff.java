/**
 * Created by ruthless on 14/3/16.
 */

import java.io.*;
import java.util.Arrays;

class maxdifff {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            s=br.readLine().split(" ");
            int arr[]=new int[n],tsum=0;
            for (int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(s[i]);
                tsum+=arr[i];
            }
            Arrays.sort(arr);
            int m=Math.min(k,n-k);
            int sum=0;
            for (int i=n-1;i>=m;i--)
            {
                sum+=arr[i];
            }
            bw.write(sum-(tsum-sum)+"\n");
        }
        bw.close();
    }
}
