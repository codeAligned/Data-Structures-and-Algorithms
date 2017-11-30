/**
 * Created by ruthless on 11/3/16.
 */

import java.io.*;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.StringTokenizer;

public class gcd2 {

    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer s=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(s.nextToken());
            BigInteger b=new BigInteger(s.nextToken());
            int c=b.mod(new BigInteger(a+"")).intValue();
            bw.write(gcd(a,c)+"\n");
        }
        bw.close();
      }
}
