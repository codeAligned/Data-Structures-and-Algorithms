import java.io.*;
/**
 * Created by ruthless on 4/3/16.
 */
class namecheck {

    public static String check(char[] s,char[] l)
    {
        int e=s.length;
        int j=0;
        boolean[] vis=new boolean[s.length];
        for (int i=0;i<e;i++)
        {
            while(s[i]!=l[j])
            {
                j+=1;
                if(j>l.length-1) break;
            }
            if(j>l.length-1)
            {
                return "NO\n";
            }
            if(s[i]==l[j]) vis[i]=true;
        }
        for (int i=0;i<e;i++)
        {
            if(!vis[i]) return "NO\n";
        } return "YES\n";
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[]=br.readLine().split(" ");
            char[] a=s[0].toCharArray();
            char[] b=s[1].toCharArray();
            int la=a.length;
            int lb=b.length;
            if(la==lb)
            {
                if(s[0].equals(s[1])) bw.write("YES\n");
                else bw.write("NO\n");
            }
            else if(la<lb)
            {
                bw.write(check(a,b));
            }
            else
            {
                bw.write(check(b,a));
            }
        }
        bw.close();


    }
}