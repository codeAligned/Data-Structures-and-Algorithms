import java.io.IOException;
import java.util.Arrays;

/**
 * Created by ruthless on 20/1/16.
 */
public class ListeningSongs {
    public static int listen(int durations1[],int durations2[],int min,int t)
    {
        Arrays.sort(durations1);
        Arrays.sort(durations2);
        boolean[] c1=new boolean[durations1.length];
        boolean[] c2=new boolean[durations2.length];
        int d1=durations1.length;
        int d2=durations2.length;
        if(d1<t || d2<t) return -1;
        int sec=min*60;
        int le1=0;
        int le2=0;
        for(int i=0;i<t;i++)
        {
            if(sec>=durations1[0]) {
                le1+=1;
                c1[i] = true;
                sec -= durations1[i];
            }
            else
            {
               return -1;
            }
        }
        for(int i=0;i<t;i++)
        {
            if(sec>=durations2[0]) {
                le2+=1;
                c2[i] = true;
                sec -= durations2[i];
            }
            else
            {
                return -1;
            }
        }
        int al=(d1+d2)-(le1+le2);
        if(al==0)
        {
            return (le1+le2);
        }
        else if(al>0)
        {
            int hold=0;
            int acheck[]=new int[al];
            for (int i=le1;i<d1;i++)
            {
                if(!c1[i])
                {
                    hold=i-(le1);
                    acheck[i-le1]=durations1[i];
                }
            }
            for (int i=le2;i<d2;i++)
            {
                if(!c2[i])
                {
                    acheck[hold+1]=durations2[i];
                hold+=1;
                }
            }
            Arrays.sort(acheck);
            int song=0;
            for (int i=0;i<al;i++)
            {

                if(sec>=acheck[0])
                {
                    song+=1;
                    sec-=acheck[i];
                }
                else
                {
                    return (le1+le2+song);
                }
            }
        }
            return -1;
    }
   /* public static void main(String args[]) throws IOException
    {
        int a[]=  {196,147,201,106,239,332,165,130,205,221,248,108,60};
        int b[]=  {280,164,206,95,81,383,96,255,260,244,60,313,101};
        System.out.println(listen(a,b,60,3));
    }*/
}
