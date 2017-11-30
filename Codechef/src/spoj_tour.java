/**
 * Created by ruthless on 27/4/16.
 */

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class spoj_tour {
    static List<Integer> list[];
    static List<Integer> tlist[];
    static boolean[] visited;
    static Stack<Integer> ts;
    static Vector<Integer> size;
    static int[] comp;
    static int gno;

    static void DFS1(int node)
    {
        if(visited[node]) return;
        visited[node]=true;

        for (int i=0;i<list[node].size();i++) DFS1(list[node].get(i));
        ts.push(node);
    }

    static void DFS2(int node)
    {
        if(visited[node]) return;
        visited[node]=true;
        for (int i=0;i<tlist[node].size();i++) DFS2(tlist[node].get(i));
        comp[node]=gno;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine().trim());
            list=new LinkedList[n+1];
            tlist=new LinkedList[n+1];
            ts=new Stack<>();

            gno=0;
            comp=new int[n+1];
            for (int i=1;i<=n;i++)
            {
                list[i]=new LinkedList<>();
                tlist[i]=new LinkedList<>();
            }
            for (int j=1;j<=n;j++) {
                int to=j;
                String s[]=br.readLine().trim().split(" ");
                int m = Integer.parseInt(s[0]);
                for (int i = 1; i <= m; i++) {
                 int from=Integer.parseInt(s[i]);
                    list[from].add(to);
                    tlist[to].add(from);
                }
            }
            visited=new boolean[n+1];
            size=new Vector<>();
            for (int i=1;i<=n;i++)
            {
                DFS1(i);
            }
            visited=new boolean[n+1];
            while(!ts.isEmpty())
            {
                int current= ts.pop();
                if(!visited[current])
                {
                     gno+=1;
                     DFS2(current);
                }
            }
            int indeg[]=new int[gno+1];
            for (int i=1;i<=n;i++)
            {
                for (int j=0;j<list[i].size();j++)
                {
                  if(comp[i]!=comp[list[i].get(j)])
                  {
                      indeg[comp[list[i].get(j)]]+=1;
                  }
                }
            }
            int c=0;
            int loc=0;
            for (int i=1;i<=gno;i++)
            {
                if(indeg[i]==0)
                {
                    loc=i;
                    c+=1;
                }
            }
            if(c==0 || c>1) bw.write("0\n");
            else
            {
                int count=0;
                for(int i=1;i<=n;i++)
                {
                    if(comp[i]==loc) count+=1;
                }
                bw.write(count+"\n");
            }
        }
        bw.close();
    }
    }
