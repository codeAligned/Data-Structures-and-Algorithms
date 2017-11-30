/**
 * Created by ruthless on 18/3/16.
 */

import java.io.*;
import java.util.ArrayList;

public class namer {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int q=Integer.parseInt(s[1]);
        ArrayList<String> names=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            names.add(br.readLine());
        }
        ArrayList<Integer> inte=new ArrayList<>();
        ArrayList<String> namep=new ArrayList<>();
        String regex="\\d+";
        for (int i=0;i<q;i++)
        {
            String sa=br.readLine();
            if(sa.matches(regex))
            {
                inte.add(Integer.parseInt(sa));
            }
            else namep.add(sa);
        }
        int count=0;
        for (int i:inte)
        {
            if(i<20) count+=1;
        }
        for (String sp:namep)
        {
            if(names.contains(sp))
            {
                names.remove(sp);
            }
            else
            {
                count+=1;
            }
        }
        bw.write(count+"\n");
        bw.close();
    }}
