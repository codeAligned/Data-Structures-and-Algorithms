/**
 * Created by ruthless on 18/3/16.
 */

import java.io.*;
import java.util.ArrayList;

public class RecursivePermut {


     static ArrayList<String> contain=new ArrayList<>();
    static int count=0;

    public static boolean check(String st)
    {
        int l=st.length();
        char c[]=st.toCharArray();
        for (int i=0;i<l-1;i++)
        {
            if(c[i]==c[i+1]) return false;
        }
        return true;
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n ==0 && !contain.contains(prefix)) {
            if (check(prefix)) {
                count += 1;
                contain.add(prefix);
            }
            else
            {
                contain.add(prefix);
            }
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[]=br.readLine().split(" ");
        int arr[]=new int[s.length];
        int min=Integer.MAX_VALUE;
        for (int i=0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
             if(min>arr[i] && arr[i]!=0)
             {
                 min=arr[i];
             }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int t=min;
                if(i==0)
                    while(t-->0)
                {
                    sb.append("r");
                }
                if(i==1)
                    while(t-->0)
                    {
                        sb.append("b");
                    }
                if(i==2)
                    while(t-->0)
                    {
                        sb.append("g");
                    }
                if(i==3)
                    while(t-->0)
                    {
                        sb.append("y");
                    }
            }
        }
        String st=sb.toString();
        permutation("",st);
        bw.write(count+"\n");
        bw.close();
     }
}
