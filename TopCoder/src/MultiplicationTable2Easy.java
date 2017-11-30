/**
 * Created by ruthless on 19/3/16.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


public class MultiplicationTable2Easy {
            public static String isGoodSet(int[] table,int[] t)
            {

                Arrays.sort(t);

                Vector<Integer> vec=new Vector<>();
                for(int i:t)
                {
                    vec.add(i);
                }
                int n=(int)Math.sqrt((double) table.length);
                for (int i=0;i<t.length;i++)
                {
                    for (int j=0;j<t.length;j++)
                    {
                        int temp=table[(t[i]*n)+t[j]];
                        if(vec.contains(temp)) {
                            continue;
                        }
                        else return "Not Good";
                    }
                }
                return "Good";
            }
    public static void main(String args[])
    {
        System.out.println(isGoodSet(new int[]{1, 1, 2, 3, 1, 0, 2, 3, 3, 3, 0, 3, 2, 2, 2, 0},new int[]{1}));
    }
}
