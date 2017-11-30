import java.io.*;

/**
 * Created by ruthless on 29/2/16.
 */
public class EqualSubstrings2 {
public static int get(String s)
{
    int l=s.length();
    int count=0;
   char[] c=s.toCharArray();
    for (int k=1;k<=l;k++) {
        for (int i = 0; i < l-k; i++) {
          String s1=s.substring(i,i+k);
            for (int j = i + k; j <=l-k; j++) {
String s2=s.substring(j,j+k);
    if(s1.equals(s2)) count+=1;
            }
        }
    }
    return count;
}
    public static void main(String args[])
    {
        System.out.println(get("a"));
    }
}
