import java.io.*;
import java.math.BigInteger;
class csub
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int t=Integer.parseInt(br.readLine());
     int count=0;
    while(t-->0)
    {
      int n=Integer.parseInt(br.readLine());
      String s=br.readLine();
      long sum=0;
      for (int i=0;i<n;i++)
      {
        if(s.charAt(0)=='1')
        sum+=1;
      }
      bw.write(sum*(sum+1)/2+"");
      bw.newLine();
    }
    bw.close();
  }
}
