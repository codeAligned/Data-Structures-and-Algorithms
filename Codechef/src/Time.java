

/**
 * Created by ruthless on 23/2/16.
 */
public class Time {

    public static double maxDis(int maxx, int maxy, int dist) {
        if (Math.abs(maxx + maxy) < dist) return -1.0;
        int ma = Math.max(maxx, maxy);
        int mi = Math.min(maxx, maxy);
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= mi; i++) {
            double sqrt = 0.0;
            int all = dist - i;
            if (all <= ma && all >= 0) {
                sqrt = Math.sqrt((all * all) + (i * i));
            }
            if (max < sqrt) {
                max = sqrt;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        System.out.println(maxDis(976421, 976421, 1000000));
    }
}
