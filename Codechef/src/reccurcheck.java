/**
 * Created by ruthless on 30/4/16.
 */

import java.io.*;

public class reccurcheck {
    static int max=10000;

    public static void recur(int i)
    {
        if(i==max) return;
        i+=1;
        recur(i);
    }

    public static void main(String args[]) throws IOException {
       int i=0;
        recur(i);
        System.out.println("See no problem\n");
    }
}

