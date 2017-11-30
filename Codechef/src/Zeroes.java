import java.io.*;

/**
 * Created by ruthless on 17/1/16.
 */
public class Zeroes {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        String arr[]=br.readLine().split(" ");
        long pro=1;
        for (int i=0;i<n;i++)
        {
            pro*=Long.parseLong(arr[i]);
        }
        int t=Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++)
        {
            int j=Integer.parseInt(br.readLine());
            String prod=Long.toUnsignedString(pro,j);
            int res=0;
            for (int k=prod.length()-1;k>=0;k--)
            {

                if(prod.charAt(k)!='0')
                {
                    break;
                }
                else
                    res+=1;
            }
            bw.write(prod+" "+res+"\n");
            }
        bw.close();
    }
}
