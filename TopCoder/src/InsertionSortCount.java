
public class InsertionSortCount {


    public static int countMoves(int[] arr)
{
    int count=0;
    for (int i=1;i<=arr.length-1;i++)
    {
        int key=arr[i];
        int j=i-1;
      while (j>=0 && arr[j]>key)
      {
         arr[j+1]=arr[j];
          j=j-1;
          count+=1;
      }
        arr[j+1]=key;
    }
    return count;
}

    public static void main(String args[])
    {
        System.out.println(countMoves(new int[]{20,40,30,10}));
    }
}
