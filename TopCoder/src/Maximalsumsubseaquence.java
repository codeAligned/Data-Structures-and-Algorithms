    /**
     * Created by ruthless on 21/3/16.
     */

    import java.io.*;

    public class Maximalsumsubseaquence {
        static int flip[];

        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n=Integer.parseInt(br.readLine());
            flip=new int[n];
            int meh,msf;
            String s[]=br.readLine().split(" ");
            int i=0;    int sa=0;
            meh=Integer.MIN_VALUE+10;
            msf=Integer.MIN_VALUE+10;
            for (int j=0;j<n;j++)
            {
                if(s[j].equals("1"))
                    sa+=1;
            }
            for (String a:s)
            {
                flip[i++]=(a.equals("1"))?-1:1;
            }
            for(i=0;i<n;i++)
            {
                meh=Math.max(flip[i],meh+flip[i]);
               if(meh>msf)
               {
                   msf=meh;
               }
            }
            bw.write((sa+msf)+"\n");
         bw.close();
        }
    }
