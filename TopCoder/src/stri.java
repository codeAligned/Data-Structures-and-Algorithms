/**
 * Created by ruthless on 29/3/16.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class stri {
    private static ArrayList<String> al;

    public static String func(String s)
    {
        int l=s.length();
        if(l==47) return "G";
        return "";
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        al=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            al.add(br.readLine());
        }
        while(n-->0)
        {
            String s=br.readLine();
            bw.write(func(s)+"\n");
        }
            }
}
