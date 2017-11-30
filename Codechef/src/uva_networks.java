/**
 * Created by ruthless on 29/4/16.
 */

import java.io.*;
import java.util.LinkedList;

public class uva_networks {
    static LinkedList<Integer> list[];
    static boolean[] visited;
    static int parent[];
    static boolean ap[];
    static int time;
    static int disc[];
    static int low[];

    public static void DFS(int node)
    {
        visited[node]=true;
        disc[node]=time;
        low[node]=time;
        int kids=0;
        for (int i=0;i<list[node].size();i++)
        {
            int child=list[node].get(i);
            if(!visited[child])
            {
                parent[child]=node;
                time+=1;
                kids+=1;
                DFS(child);

                low[node]=Math.min(low[node],low[child]);

                if(parent[node]==0 && kids>1) ap[node]=true;

                else if(parent[node]!=0 && low[child]>=disc[node]) ap[node]=true;
            }
            else if(visited[child] && parent[node]!=child)
            {
                low[node]=Math.min(low[node],disc[child]);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine().trim());
        String s[]=br.readLine().trim().split(" ");
        while(n!=0)
        {
            int v=n;
            list=new LinkedList[v+1];
            parent=new int[v+1];
            visited=new boolean[v+1];
            ap=new boolean[v+1];
            time=0;
            disc=new int[v+1];
            low=new int[v+1];
            for (int i=1;i<=v;i++)
            {
              list[i]=new LinkedList<>();
            }
            for (int i=1;i<=v;i++)
            {
            int n1=Integer.parseInt(s[0]);
                for (int j=1;j<s.length;j++)
                {
                    int n2=Integer.parseInt(s[j]);
                    list[n1].add(n2);
                    list[n2].add(n1);
                }
                s=br.readLine().trim().split(" ");
                if(s[0].equals("0")) break;
            }
            for (int i=1;i<=v;i++)
            {
                if(!visited[i])
                {
                    DFS(i);
                }
            }
            int count=0;
            for (int i=1;i<=v;i++)
            {
                if(ap[i]) count+=1;
            }
            bw.write(count+"\n");
            n=Integer.parseInt(br.readLine().trim());
            if(n==0)
        break;
        }
        bw.close();
    }
}
