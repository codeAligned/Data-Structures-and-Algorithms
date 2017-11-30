/**
 * Created by ruthless on 16/3/16.
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class countprime {
    static int  prime[];

    static boolean primef(int n)
    {
        for (int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void sieve() {
        int max = 10000001;
        prime = new int[max];
        Arrays.fill(prime, 1);
        for (int i = 2; i * i <= max - 1; i++) {
            if (prime[i] == 1) {
                for (int j = i; j * i <= max-1; j++) {
                    prime[j * i] = 0;
                }
            }
        }
        for (int i=1;i<=max-1;i++)
        {
            if(prime[i]==1)prime[i]=prime[i-1]+1;
             else prime[i]=prime[i-1];
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sieve();
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            bw.write(prime[b]-prime[a-1]+"\n");
        }
        bw.close();
    }
}
