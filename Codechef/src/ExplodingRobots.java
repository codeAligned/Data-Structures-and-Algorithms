/**
 * Created by ruthless on 6/2/16.
 */
public class ExplodingRobots {
    public static String canExplode(int x1, int y1, int x2, int y2, String in) {
        char c[] = in.toCharArray();
        int a1[] = new int[c.length + 1];
        int b1[] = new int[c.length + 1];
        int a2[] = new int[c.length + 1];
        int b2[] = new int[c.length + 1];
        a1[0] = x1;
        a2[0] = x2;
        b1[0] = y1;
        b2[0] = y2;
        for (int i = 1; i <= c.length; i++) {
            if (c[i - 1] == 'L') {
                a1[i] = a1[i - 1] - 1;
                a2[i] = a2[i - 1] - 1;
                b1[i] = b1[i - 1];
                b2[i] = b2[i - 1];
            }
            if (c[i - 1] == 'R') {
                a1[i] = a1[i - 1] + 1;
                a2[i] = a2[i - 1] + 1;
                b1[i] = b1[i - 1];
                b2[i] = b2[i - 1];
            }
            if (c[i - 1] == 'U') {
                a1[i] = a1[i - 1];
                a2[i] = a2[i - 1];
                b1[i] = b1[i - 1] + 1;
                b2[i] = b2[i - 1] + 1;
            }
            if (c[i - 1] == 'D') {
                a1[i] = a1[i - 1];
                a2[i] = a2[i - 1];
                b1[i] = b1[i - 1] - 1;
                b2[i] = b2[i - 1] - 1;
            }
        }
        for (int i = 0; i <= c.length; i++) {
            for (int j = 0; j <= c.length; j++)
                if (a1[i] == a2[j] && b1[i] == b2[j])
                    return "Explosion";
        }
        return "Safe";
    }

    public static void main(String args[]) {
        System.out.print(canExplode(10, 5, -9, -10, "LULULULLLUULRULULULULULULLULULLULD"));
    }
}
