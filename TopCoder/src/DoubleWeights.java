/**
 * Created by ruthless on 19/3/16.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;



public class DoubleWeights {

    static int rec=0;
    static int[] w1;
    static int[] w2;

    public static int recr(int i,int j)
    {

        int count=Math.min(1,1);
        return 0;
    }
      public static int minimialCost(String[] w1a,String[] wa2)
    {
        w1=new int[w1a.length];
        w2=new  int[wa2.length];
        for (int i=0;i<w1.length;i++)
        {
            if(!w1.equals(".")) {
                w1[i] = Integer.parseInt(w1a[i]);
                w2[i] = Integer.parseInt(wa2[i]);
            }
            }

        return recr(0,0);
    }
}