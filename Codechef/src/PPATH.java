/**
 * Created by ruthless on 12/4/16.
 */

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class PPATH {
    public static boolean sieve[];
    public static int adj[][];
    public static void sieve()
    {
        adj=new int[9000][9000];
        int max=10000;
        sieve=new boolean[max+1];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;

        for (int i=2;i*i<=max;i++)
        {
            if(sieve[i])
            for (int j=i;i*j<=max;j++)
            {
                sieve[j*i]=false;
            }
        }

        for (int i=1000;i<=9999;i++)
        {
            for (int j=i+1;j<=9999;j++)
            {
                if(fd(i,j))
                {
                    adj[i-1000][j-1000]=1;
                    adj[j-1000][i-1000]=1;
                }
            }
        }
    }
    public static boolean fd(int x,int y)
    {
    int count =0;
        char[] a=(x+"").toCharArray();
        char[] b=(y+"").toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i=0;i<4;i++)
        {
            if(a[i]!=b[i])
            {
                count+=1;
            }
            if(count>=2) return false;
        }
        return true;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        { String s[]=br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            LinkedList que=new LinkedList<>();
            int init=0;int wait=1;int visit=2;
            int ss=x;
            int distance[]=new int[9001];
            for(int i=0;i<=9000;i++)
            {
                distance[i]=-1;
            }
            int[] state=new int[9000];
            que.add(ss);
            while(que.size()!=0)
            {
                int SS=(int) que.remove(0);
                state[SS]=visit;
                for (int i=SS+1;i<=y;i++)
                {
                 if(adj[SS][i]==1 && state[i]==init)
                 {
                     que.add(i);
                     state[i]=wait;

                 }
                }
            }
        }
    }
}
