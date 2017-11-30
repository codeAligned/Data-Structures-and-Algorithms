public class Education {
    public static int minimize(String b, int[] ar) {
        int g = 0;
        if (b.equals("A")) g = 90;
        else if (b.equals("B")) g = 80;
        else if (b.equals("C")) g = 70;
        else if (b.equals("D")) g = 60;
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        int l = ar.length + 1;
        int res = (l * g) - sum;
        if (res <= 0) return 0;
        else if (res > 100) return -1;
        else
            return res;
    }
}
