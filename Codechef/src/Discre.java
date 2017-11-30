/**
 * Created by ruthless on 11/3/16.
 */
import java.io.*;
import java.util.*;

public class Discre {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().split(" ");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);
        int n3 = Integer.parseInt(s[2]);
        int t = n1 + n2 + n3;
        int[] arr = new int[t];
        int res[]=new int[50001];
        int j=0;
        for (int i=0;i<t;i++) {
            int a = Integer.parseInt(br.readLine());
             arr[i]=a;
        }
        Arrays.sort(arr);
        int l=0;
        for (int i=0;i<t;i++)
        {
            while(i<t-1 && arr[i]==arr[i+1]) {


            }
        }
        }
    }