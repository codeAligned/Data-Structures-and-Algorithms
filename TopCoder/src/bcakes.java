/**
 * Created by ruthless on 11/3/16.
 */
/*
import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class bcakes {
    /*
        public static boolean returnSmallest(int arr[],int vtc)
        {
            char c[]=(vtc+"").toCharArray();
            int aux[]=new int[10];
            int l=c.length;
            for (int i=0;i<l;i++)
            {
                aux[c[i]-48]+=1;
            }
            for (int i=0;i<10;i++)
            {
                if(aux[i]!=0 && arr[i]-aux[i]<0)
                {
                    return true;
                }
            }
            return false;

        }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int arr[] = new int[10];
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = 0;
            int min = Integer.MAX_VALUE, loc = -1;
            for ( i=0;i<=9;i++)
            {
                arr[i]=Integer.parseInt(st.nextToken());
                if(min>arr[i] && i>=1)
                {
                    min=arr[i];
                    loc=i;
                }
            }

            if(arr[0]<min)
            {
                min=arr[0];
                loc=0;
            }
                    if (loc == 0) bw.write("1");
                    for (i = 0; i <= min; i++) {
                        bw.write(loc + "");
                    }
                    bw.newLine();
            }
            bw.close();
        }
    }
*/
/**
 * Created by ruthless on 11/3/16.
 */

import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

class bcakes {
    /*
        public static boolean returnSmallest(int arr[],int vtc)
        {
            char c[]=(vtc+"").toCharArray();
            int aux[]=new int[10];
            int l=c.length;
            for (int i=0;i<l;i++)
            {
                aux[c[i]-48]+=1;
            }
            for (int i=0;i<10;i++)
            {
                if(aux[i]!=0 && arr[i]-aux[i]<0)
                {
                    return true;
                }
            }
            return false;

        }
        */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int arr[] = new int[10];
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = 0;
            int min = Integer.MAX_VALUE, loc = -1;
            while (st.hasMoreTokens()) {
                arr[i++] = Integer.parseInt(st.nextToken());
                if (i>1 && i<=10 && min > arr[i-1]) {
                    min = arr[i-1];
                    loc = i-1;
                }
            }

            if(arr[0]<min)
            {
                min=arr[0];
                loc=0;
            }
            if (loc == 0) bw.write("1");
            for (i = 0; i <= min; i++) {
                bw.write(loc + "");
            }
            bw.newLine();
        }
        bw.close();
    }
}
