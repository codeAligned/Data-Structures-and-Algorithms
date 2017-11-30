import java.io.*;
import java.util.Arrays;

/**
 * Created by ruthless on 7/3/16.
 */
public class Istr {
    public static int count(String s,int k)
    {
        char c[]=s.toCharArray();
        int l=c.length;
        int a[]=new int[26];
        for (int i=0;i<l;i++)
        {
            int var=((int)c[i])-97;
            a[var]+=1;
        }
        Arrays.sort(a);
        int count=0;
        while(k>0)
        {
            a[25]-=1;
            k-=1;
            Arrays.sort(a); 
        }
        for (int i=25;i>=0;i--)
        {
            count=count+(a[i]*a[i]);
        }
        return count;
    }
    public static void main(String args[])





    {
        System.out.println(count("wersrsresesrsesrawsdsw",11));
    }
}
