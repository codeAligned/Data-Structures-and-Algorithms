    import java.io.*;
    /**
     * Created by ruthless on 4/3/16.
     */
    public class pals {

        public static String func(char[] a,char[] b)
        {
            for (int  i=0;i<a.length;i++)
            {
                for (int j=0;j<b.length;j++)
                {
                  if(a[i]==b[j])
                  {
                      return "Yes\n";
                  }
                }
            }
            return "No\n";
        }

        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
            while(t-->0)
            {
                char[] a=br.readLine().toCharArray();
                char[] b=br.readLine().toCharArray();
                bw.write(func(a,b)+"");
            }
            bw.close();
        }
    }
