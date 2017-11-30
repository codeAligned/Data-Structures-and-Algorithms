/**
 * Created by ruthless on 10/3/16.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class nukes {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
        int limit=Integer.parseInt(st.nextToken());
        int shell=Integer.parseInt(st.nextToken());
        int res[]=new int[shell];
        while(t>0)
        {
            if(t-(limit+1)>0)
            {
                res[0]=limit+1;
                t-=(limit+1);
            }
            else
            {
                res[0]=t;
                t-=t;
            }
            for (int i=0;i<shell-1;i++)
            {
                if (res[i]>limit)
                {
                    res[i]=0;
                    if(i<shell-1) res[i+1]+=1;
                }
            }
        }
        for (int i=0;i<shell;i++)
        {
            bw.write(res[i]+" ");
        }
        bw.newLine();
        bw.close();
    }
    }
