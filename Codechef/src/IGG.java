import java.io.*;

/**
 * Created by ruthless on 26/1/16.
 */
public class IGG {
    static boolean decide[][];

    static boolean[][] precalc(int n)
    {
        boolean[][] arr=new boolean[n+1][n+1];
        for (int i=1;i<=n;i++)
        {
            arr[0][i]=true;
            arr[i][i]=true;
            arr[i][0]=true;
        }
        for (int i=1;i<=n;i++)
        {
            for (int j=i+1;j<=n;j++)
            {
                arr[i][j]=func(i,j,arr);
            arr[j][i]=arr[i][j];
            }
        }
        return arr;
    }
    static boolean func(int x,int y, boolean arr[][])
    {
        for (int b=x-1;b>=0;b--)
        {
            if(!arr[b][y])
            {
                return true;
            }
        }

            for (int b=y-1;b>=0;b--)
            {
                if(!arr[x][b])
                {
                    return true;
                }
            }
        int min=(x>y)?y:x;
        for (int i=1;i<=min;i++)
        {
            if(!arr[x-i][y-i])
                return true;
        }
    return false;
        }
        public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        decide=precalc(1000);
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] str=br.readLine().split(" ");
            int m=Integer.parseInt(str[0]);
            int n=Integer.parseInt(str[1]);
            int p=Integer.parseInt(str[2]);
            int q=Integer.parseInt(str[3]);
            if(decide[m-p][n-q]) bw.write("Alice\n");
            else bw.write("Bob\n");
        }
        bw.close();
    }
}
