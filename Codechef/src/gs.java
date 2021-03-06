import java.util.*;
import java.io.*;
 class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine().trim());
        pt[] pts = new pt[n];
        for (int i=0; i<n; i++) {
            StringTokenizer tok = new StringTokenizer(stdin.readLine());
            int x = Integer.parseInt(tok.nextToken());
            int y = Integer.parseInt(tok.nextToken());
            pts[i] = new pt(x, y);
        }

        int refIndex = getIndexMin(pts, n);
        pt.refX = pts[refIndex].x;
        pt.refY = pts[refIndex].y;

        System.out.printf("%.1f\n", grahamScan(pts, n));

    }

    public static int getIndexMin(pt[] pts, int n) {
        int res = 0;
        for (int i=1; i<n; i++)
            if (pts[i].y < pts[res].y || (pts[i].y == pts[res].y && pts[i].x < pts[res].x))
                res = i;
        return res;
    }

    public static double grahamScan(pt[] pts, int n) {

        // Sort the points by angle with reference point.
        Arrays.sort(pts);

        // Push first two points on.
        Stack<pt> myStack = new Stack<pt>();
        myStack.push(pts[0]);
        myStack.push(pts[1]);

        // Go through the rest of the points.
        for (int i=2; i<n; i++) {

            // Get last three pts.
            pt cur = pts[i];
            pt mid = myStack.pop();
            pt prev = myStack.pop();

            // Pop off the left turns.
            while (!prev.isRightTurn(mid, cur)) {
                mid = prev;
                prev = myStack.pop();
            }

            // Push back the last right turn.
            myStack.push(prev);
            myStack.push(mid);
            myStack.push(cur);
        }

        // Add up distances around the hull.
        double res = 0;
        pt cur = pts[0];
        while (myStack.size() > 0) {
            pt next = myStack.pop();
            res += cur.dist(next);
            cur = next;
        }

        // Return.
        return res;
    }
}

class pt implements Comparable<pt> {

    // Stores reference pt
    public static int refX;
    public static int refY;

    public int x;
    public int y;

    public pt(int myx, int myy) {
        x = myx;
        y = myy;
    }

    public pt getVect(pt other) {
        return new pt(other.x-x, other.y-y);
    }

    public double dist(pt other) {
        return Math.sqrt((other.x-x)*(other.x-x) + (other.y-y)*(other.y-y));
    }

    public int crossProductMag(pt other) {
        return this.x*other.y - other.x*this.y;
    }

    public boolean isRightTurn(pt mid, pt next) {
        pt v1 = getVect(mid);
        pt v2 = mid.getVect(next);
        return v1.crossProductMag(v2) >= 0;
    }

    public boolean isZero() {
        return x == 0 && y == 0;
    }

    public int compareTo(pt other) {

        pt myRef = new pt(refX, refY);
        pt v1 = myRef.getVect(this);
        pt v2 = myRef.getVect(other);

        // To avoid 0 issues.
        if (v1.isZero()) return -1;
        if (v2.isZero()) return 1;

        // Angles are different, we are going counter-clockwise here.
        if (v1.crossProductMag(v2) != 0)
            return -v1.crossProductMag(v2);

        // This should work, smaller vectors come first.
        if (myRef.dist(v1) < myRef.dist(v2)) return -1;
        return 1;
    }
}