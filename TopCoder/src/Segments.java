public class Segments
{
  public static String intersection(int[] x,int[] y)
  {
    int xx1=x[0],xy1=x[1], xx2=x[2], xy2=x[3];
    int yx1=y[0],yy1=y[1], yx2=y[2], yy2=y[3];
    int left=Math.max(Math.min(xx1,xx2),Math.min(yx1,yx2));
    int right=Math.min(Math.max(xx1,xx2),Math.max(yx1,yx2));
    int top=Math.max(Math.min(xy1,xy2),Math.min(yy1,yy2));
    int bottom=Math.min(Math.max(xy1,xy2),Math.max(yy1,yy2));
    if(top>bottom || left>right)
      return "NO";
    if(top==bottom && left==right)
      return "POINT";
    return "SEGMENT";
   }
  public static void main(String args[])
  {
    System.out.println(intersection(new int[]{0,0,0,1},new int[]{1,0,1,1}));
  }
}
