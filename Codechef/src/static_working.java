/**
 * Created by Abhiroj on 18/7/16.
 */

import java.io.IOException;
import java.util.Scanner;

class Static_Working {

    static {System.out.println("Hi, Let me show you the working of Static Keyword"); }
    static int sno;
    String name;
    public static void main(String args[]) throws IOException {
        System.out.println("Now, inside main method, Enter user input");
        Scanner sc=new Scanner(System.in);
        Static_Working swarray[]=new Static_Working[10];
        for (int i=0;i<swarray.length;i++)
        {
            Static_Working sw=new Static_Working();
            sw.sno=i+1; //Storing it in the Serial Number in the sw object
            sw.name=sc.next(); //Storing the User Input in the sw object
            swarray[i]=sw; //assigning Object to the Array Block
        }
        System.out.println();
        System.out.println("/*** Printing Array of Objects ***/");
        for (int i=0;i<swarray.length;i++)
        {
            System.out.println(swarray[i].sno+" "+swarray[i].name);
        }


    }
}