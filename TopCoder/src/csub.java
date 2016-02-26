import java.io.*;

class csub
{
  public static void main(String args[])
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int t=Integer.parseInt(br.readLine());
     int count=0;
    while(t-->0)
    {
      String s[]=br.readLine.split("");
      int sum=0;
      for (String a:s)
      {
        if(a.equals("1"))
        sum+=1;
      }
      bw.write(n*(n+1)/2+"\n");
    }
    bw.close();
  }
}
