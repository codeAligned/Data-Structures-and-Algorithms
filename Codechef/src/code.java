import java.io.*;

/**
 * Created by ruthless on 20/1/16.
 */
public class code {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int size=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
     StringBuilder sb=new StringBuilder();
        int count=0;
        for (int i=0;i<size;i++)
        {
            if(s[i].charAt(0)=='0')
            {
                count=0;
                sb=new StringBuilder("");
                sb.append("0");
                break;
            }
            else if(s[i].length()!=1 && s[i].charAt(0)=='1' && s[i].charAt(1)=='0')
            {
                count=s[i].length()-1;
            }
            else if(!s[i].equals("1"))
            {
                sb.append(s[i]);
            }
            else if(s[i].equals("1") && sb.toString()=="")
            {
                sb.append("1");
            }
        }

        for (int i=1;i<=count;i++)
        {
            sb.append("0");
        }
        bw.write(sb.toString()+"\n");
        bw.close();
    }
}
