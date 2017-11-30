import java.io.*;

/**
 * Created by ruthless on 28/2/16.
 */
public class RugSizes {
    public static int rugCount(int n)
    {
        int count=0;
        for (int i=1;i*i<=n;i++)
        {
            if(n%i==0) {
               int m=n/i;
                if(i%2==0 && m%2==0 && i!=m & i!=1) continue;
                count += 1;
            }
            }
    return count;
    }
    public static  void  main(String args[])
    {
        System.out.println(rugCount(98415));
    }
}

