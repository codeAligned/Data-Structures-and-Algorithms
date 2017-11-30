import java.io.*;
import java.util.*;

/**
 * Created by ruthless on 24/1/16.
 */
public class arrhand {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String[] s=br.readLine().split(" ");
            int pos[]=new int[n];
            int posh=0;
            int arr[]=new int[n];
            for (int i=0;i<n;i++)
            {
             arr[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            int count=0;
            boolean last=false;
            for (int i=0;i<n-1;i++)
            {
                int temp=0;
                while(arr[i]==arr[i+1])
                {
                    i+=1;

                    temp+=1;
                    if(i==n-1)
                    {
                        last=true;
                        break;
                    }
                }
                if(last)
                {
                    pos[posh]=temp+1;
                posh+=1;
                }
                else if (arr[i]!=arr[i+1])
                {
                    pos[posh]=temp+1;
                    posh+=1;
                }
            }
            if(!last)
            {
                pos[posh]+=1;
            posh+=1;
            }
            else
            {
                posh+=1;
            }
            Arrays.sort(pos);
            for (int i=0;i<posh;i++)
            {
                if(posh>n)
                {
                    posh=n;
                }
                if(pos[i]!=0 && i<posh-1) {
                    if (pos[i] == pos[i + 1]) {
                        count += pos[i];
                        int temp = pos[i];
                        pos[i] -= temp;
                        pos[i + 1] -= temp;
                    }
                    if (pos[i]!=pos[i+1])
                    {
                        int sub=Math.min(pos[i],pos[i+1]);
                        count+=sub;
                        pos[i]-=sub;
                        pos[i+1]-=sub;
                    }
                }
                else
                {
                    posh+=1;
                }
            }
            bw.write(count+pos[posh-1]+"\n");
        }
        bw.close();
    }
}
