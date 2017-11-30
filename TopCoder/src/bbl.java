import java.io.*;

/**
 * Created by ruthless on 6/3/16.
 */
public class bbl {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int q=Integer.parseInt(s[1]);
            int maxx[]=new int[n];
            int minx[]=new int[n];
            int maxy[]=new int[n];
            int miny[]=new int[n];
            for (int i=0;i<n;i++)
            {
                s=br.readLine().split(" ");
                int x1=Integer.parseInt(s[0]);
                int y1=Integer.parseInt(s[1]);
                int x2=Integer.parseInt(s[2]);
                int y2=Integer.parseInt(s[3]);
                maxx[i]=Math.max(x1,x2);
                minx[i]=Math.min(x1,x2);
                maxy[i]=Math.max(y1,y2);
                miny[i]=Math.min(y1,y2);
            }
            for (int i=0;i<q;i++)
            {
                int count=0;
                s=br.readLine().split(" ");
                int x=Integer.parseInt(s[0]);
                int y=Integer.parseInt(s[1]);
                if(x>0)
                {
                    for (int j=0;j<n;j++)
                    {
                        if(minx[j]<=x && x<=maxx[j])
                            count+=1;
                    }
                }
                else if(y>0)
                {
                    for (int j=0;j<n;j++)
                    {
                        if(miny[j]<=y && y<=maxy[j])
                            count+=1;
                    }
                }
                bw.write(count+"\n");
            }
        }
        bw.close();
    }
}
