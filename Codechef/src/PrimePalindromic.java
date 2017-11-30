import java.util.ArrayList;

/**
 * Created by ruthless on 9/2/16.
 */
public class PrimePalindromic {

    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int index = 0;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                int temp = i;
                while (temp % j == 0 && temp > 0) {
                    al.add(index, j);
                    temp = temp / j;
                }
            }
            int len = al.size();
            return 0;
        }
  return 0;
    }
}
