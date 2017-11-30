import java.util.Arrays;

/**
 * Created by ruthless on 13/2/16.
 */
public class ClapLight {
    public static int threshold(int[] br) {
        int a[] = new int[br.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = br[i];
        }
        int t = 0;
        int mid = a.length / 2;
        Arrays.sort(a);
        t = a[mid];
        for (int i = 0; i < br.length - 3; i++) {
            if (t >= br[i] && t <= br[i + 1] && t <= br[i + 2] && t >= br[i + 3]) {
                int m = Math.min(br[i + 1], br[i + 2]);
                t = m + 1;
            }
        }
        return t;
    }

    public static void main(String args[]) {
        System.out.println(threshold(new int[]{500, 500, 500, 501, 1000, 503, 500, 500, 500}));
    }
}
