/**
 * Created by ruthless on 23/4/16.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;

public class SimilarUserDetection {

    public static boolean match(String a,String b)
    {
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        for (int i=0;i<a1.length;i++)
        {
            if(a1[i]=='0') a1[i]='O';
            if(b1[i]=='0') b1[i]='O';
            if(a1[i]=='1' || a1[i]=='l') a1[i]='I';
            if(b1[i]=='1' || b1[i]=='l') b1[i]='I';
            if(a1[i]!=b1[i]) return false;
        }
        return true;
    }
public static String haveSimilar(String[] handle)
{
    int l=handle.length;
    for (int i=0;i<l;i++)
    {
        String a=handle[i];
        for (int j=i+1;j<l;j++)
        {
            String b=handle[j];
            if(a.length()==b.length())
            {
                if(match(a,b))
                    return "Similar handles found";
            }
        }
    }
    return "Similar handles not found";
}

    public static void main(String args[])
    {
        System.out.println(haveSimilar(new String[]{"top", "coder", "TOPCODER", "TOPC0DER"}));
    }
}

