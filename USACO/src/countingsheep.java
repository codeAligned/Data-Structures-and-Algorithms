/**
 * Created by ruthless on 9/4/16.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Vector;

public class countingsheep {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.in"));
        PrintWriter bw = new PrintWriter(new BufferedWriter(new FileWriter("a.out")));
        int t=Integer.parseInt(br.readLine());
        int caser=1;
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            if(n==0) bw.println("Case #"+(caser++)+": "+"INSOMNIA");
             else
            {
                int count=0;
                boolean arr[]=new boolean[10];
                int i=1;
                long last=0;
                while(count!=10)
                {
                    int ta=i++*n;
                    char temp[]=((ta)+"").toCharArray();
                    Arrays.sort(temp);
                  for (char k:temp)
                  {
                      int v=Integer.parseInt(k+"");
                      if(!arr[v])
                      {
                          arr[v]=true;
                          count+=1;
                          last=ta;
                      }
                  }
                }
                bw.println("Case #"+(caser++)+": "+last);
            }
          }
        bw.close();
    }
}
