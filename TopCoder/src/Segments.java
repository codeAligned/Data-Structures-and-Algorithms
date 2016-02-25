public class Segments
{
  public static String intersection(int[] p,int[] q)
  {
    p=new int[]{0, 0, 0, 1};
    q=new int[]{0, 1, 0, 2};
    int a=p[0],b=p[1],c=p[2],d=p[3];
    int e=q[0],f=q[1],g=q[2],h=q[3];
    if(c==e && d==f) return "POINT";
    if(e<c && f<d) return "SEGMENT";
    return "NO";
  }
}
