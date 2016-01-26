import java.io.*;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by ruthless on 22/1/16.
 */
public class alpha {

   static boolean prime[];
    static void SieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        prime=new boolean[n+1];

        Arrays.fill(prime,true);
        prime[1]=false;
        prime[0]=false;
        for (int p=2; p*p<=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true)
            {
                // Update all multiples of p
                for (int i=p*2; i<=n; i += p)
                    prime[i] = false;
            }
        }

    }
public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    SieveOfEratosthenes(1000000);
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
    String[] inp=br.readLine().split(" ");
        int a=Integer.parseInt(inp[0]);
        int b=Integer.parseInt(inp[1]);
        Stack<Integer>[] input=new Stack[(b-a)+1];
      for (int i=a;i<=b;i++)
      {
        String f=i+"";
          input[i-a]=new Stack<>();
        for (int j=0;j<f.length();j++)
        {
         input[i-a].push(Integer.parseInt(f.charAt(j)+""));
        }
      }
        int count=0;
      for(int i=0;i<input.length;i++)
      {
          int op=0;
          String tp="";
          while(!input[i].empty())
          {
              op=input[i].pop();
              tp=op+tp;
          if(prime[Integer.parseInt(tp)])
          {
              count+=1;
              break;
          }
          }
      }
        bw.write(count+"\n");
    }
    bw.close();
}
 }