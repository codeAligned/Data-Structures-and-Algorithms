import java.io.*;
import java.util.ArrayList;

/**
 * Created by ruthless on 27/2/16.
 */
public class square {

    public static boolean looper(ArrayList dx,ArrayList dy,int mat[][],int ox,int oy,int nx,int ny)
    {
        int count_for_=0;
        if(oy==ny)
        for (int i=ox;i<=nx;i++)
        {
            if(dx.contains(i)) return true;
        }
        if(nx==ox)
        {
            for (int i=oy;i<=ny;i++)
            {
                if(dy.contains(i)) return true;
            }
        }
        for (int i=ox;i<=nx;i++)
        {

        }
    return true;
    }
    public static boolean coord(int mat[][],int ox,int oy,int nx,int ny)
    {
        if(nx<0 || ny<0) return false;
        if(mat[ox][oy]==mat[nx][ny]) return true;
        return false;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            ArrayList<Integer> x=new ArrayList<>();
            ArrayList<Integer> y=new ArrayList<>();
            ArrayList<Integer> dx=new ArrayList<>();
            ArrayList<Integer> dy=new ArrayList<>();
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            int mat[][]=new int[n][n];
            int loc=0;
            int dloc=0;
            for (int i=0;i<n;i++)
            {
                s=br.readLine().split("");
                for (int j=0;j<n;j++)
                {
                    char c=s[j].charAt(0);
                    if(c=='X') {
                        mat[i][j] = 1;
                    x.add(loc,i);
                        y.add(loc,j);
                        loc+=1;
                    }
                        else if(c=='.') {
                        mat[i][j] = 0;
                        dx.add(dloc,i);
                        dy.add(dloc,j);
                        dloc+=1;
                    }
                        else mat[i][j]=-1;
                }
            }
            for (int i=0;i<x.size();i++)
            {
                int lx=x.get(i);
                int ly=y.get(i);
                if(coord(mat,lx,ly,lx-k,ly))
                {
                    looper(dx,dy,mat,lx,ly,lx-k,ly);
                }
                else if(coord(mat,lx,ly,lx,ly+k))
                {

                }
                else if(coord(mat,lx,ly,lx+k,ly))
                {

                }
                else if(coord(mat,lx,ly,lx-k,ly-k))
                {

                }
                else if(coord(mat,lx,ly,lx-k,ly+k))
                {

                }
                else if(coord(mat,lx,ly,lx+k,ly+k))
                {

                }
                else if(coord(mat,lx,ly,lx+k,ly-k))
                {

                }
                else if(coord(mat,lx,ly,lx,ly-k))
                {

                }
            }
        }
    }
}
