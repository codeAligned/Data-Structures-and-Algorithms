/**
 * Created by ruthless on 21/3/16.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class BadNeighbors {
    static int[] read;
    public static int dp(int n)
    {
        if(n<read.length-1)
        {
                int b = read[n] + Math.max(dp(n + 2), dp(n + 3));

                return b;
        }
        return 0;
    }
    public static int dp1(int n)
    {
        if(n>0)
        {
            int b = read[n] + Math.max(dp1(n - 2), dp1(n - 3));
            return b;
        }
        return 0;
    }
    public static int maxDonations(int[] donations)
    {
        read=donations;
      //  visit=new boolean[read.length];
        int init=0;
        int res=0;
        res=Math.max(dp(0),dp1(read.length-1));
        return res;
    }

    public static void main(String args[])
    {
        System.out.println(maxDonations(new int[]{596, 633, 339, 994, 719, 901, 551, 772, 38, 211, 212, 812, 454, 931, 879, 78, 243, 637, 815, 182, 359, 192, 892, 152, 234, 480, 814, 649, 613, 216}));
    }
}

