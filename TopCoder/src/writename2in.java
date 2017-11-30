/**
 * Created by ruthless on 14/3/16.
 */

import java.io.*;


public class writename2in {
    public static void main(String args[]) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("name2.in"));
        out.println("1");
        for (int i=1;i<=25000;i++)
        {
            out.print("j");
        }
        out.print(" ");
        for (int i=1;i<=25000;i++)
        {
            if(i%2==0) out.print("j");
            else out.print("o");
        }
        out.close();
    }
}
