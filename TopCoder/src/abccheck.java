import java.io.*;
import java.util.HashMap;

/**
 * Created by ruthless on 8/3/16.
 */
public class abccheck {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s=br.readLine();
        char[] chr=s.toCharArray();
        int l=chr.length;
        HashMap<String,Long> map=new HashMap<>();
        int a=0,b=0,c=0;
        for (int i=0;i<l;i++)
        {
            if(chr[i]=='A') a+=1;
            if(chr[i]=='B') b+=1;
            if(chr[i]=='C') c+=1;

            String k=(a-b)+""+(a-c);
            if(map.containsKey(k))
            {
                map.put(k,map.get(k)+1);
            }
            else
            {
                map.put(k,(long)1);
            }
                    }
        long ans=0;
        for (String key:map.keySet())
        {
            long val=map.get(key);
            ans+=(val*(val-1))/2;
        }
        bw.write(ans+"\n");
    bw.close();
    }

}
