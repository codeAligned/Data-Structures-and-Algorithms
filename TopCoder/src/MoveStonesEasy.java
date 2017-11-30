

/**
 * Created by ruthless on 29/2/16.
 */
public class MoveStonesEasy {

    public static int count=0;
public static void checker(int[] res,int prel,int mid)
{
    if(res[mid]>=res[prel] && res[mid]>0)
    {
       count+=(Math.abs(mid-prel))*Math.abs(res[prel]);
        res[mid]=res[mid]-Math.abs(res[prel]);
        }
    else if(prel>mid & mid<res.length)
        checker(res,prel,res.length/2+mid/2+1);
    else
        checker(res,prel,res.length/2-mid/2);
}

 public static int get(int[] a,int[] b)
 {
     int res[]=new int[a.length];
     for (int i=0;i<a.length;i++)
     {
         res[i]=b[i]-a[i];
     }
     for (int i=0;i<a.length;i++)
     {
         if(res[i]<0)
         {
            checker(res,i,res.length/2);
         }
     }
 return count;
 }
    public static void main(String args[])
    {
        System. out.println(get(new int[]{3,10,0,4,0,0,0,1,0},new int[]{5,5,0,7,0,0,0,0,1}));
    }
}
