import java.util.LinkedList;
import java.io.*;
class spoj_submrg
{

    static LinkedList<Integer> list[];
    static boolean[] visited;
    static int[] parent;
    static int time;
    static int disc[];
    static int low[];
    static boolean AP[];
    static void DFS(int node) {
        visited[node] = true;
        disc[node] = time;
        low[node] = time;
        int sanatan=0;
        for (int i = 0; i < list[node].size(); i++) {
            int child = list[node].get(i);
            if(!visited[child])
            {
                sanatan+=1;
                time+=1;
                parent[child]=node;
                DFS(child);

                low[node]=Math.min(low[node],low[child]); // TO check if subtree rooted at child of node has back edge to an ancestor of node
//1. if paret ahs more than one chilldren
                if(parent[node]==0 && sanatan>1) AP[node]=true;
//2. Low time of any child pf node is more than discovery time of node , than Node is an AP
                else if(parent[node]!=0 && low[child]>=disc[node])
                    AP[node]=true;
            }

            else if(visited[child] && parent[node]!=child)
            {
                low[node]=Math.min(low[node],disc[child]); // Checking the back edge
            }
        }
    }

    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s[]=br.readLine().trim().split(" ");
        int v=Integer.parseInt(s[0]);
        int e=Integer.parseInt(s[1]);
        while(true)
        {
            list=new LinkedList[v+1];
            visited=new boolean[v+1];
            parent=new int[v+1];
            low=new int[v+1];
            disc=new int[v+1];
            AP=new boolean[v+1];
            time=0;
            for (int i=0;i<=v;i++)
            {
                list[i]=new LinkedList<>();
            }
            while(e-->0)
            {
                s=br.readLine().trim().split(" ");
                int to=Integer.parseInt(s[0]);
                int from=Integer.parseInt(s[1]);
                list[to].add(from);
                list[from].add(to);
            }
            for (int i=1;i<=v;i++)
            {
                if(!visited[v])
                {
                    DFS(i);
                }
            }
            int count=0;
            for(int i=1;i<=v;i++)
            {
                if(AP[i]) count+=1;
             }
            bw.write(count+"\n");
            s=br.readLine().trim().split(" ");
            v=Integer.parseInt(s[0]);
            e=Integer.parseInt(s[1]);
            if(v==0 && e==0) break;
        }
        bw.close();
    }
}