/**
 * Created by ruthless on 30/4/16.
 */
import java.io.*;
import java.util.LinkedList;
class spoj_polquery {
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    static int[] parent;
    static int[] disc;
    static int[] low;
    static int time;
    static boolean[] ap;

    static void  DFS(int node)
    {
        visited[node]=true;
        disc[node]=time;
        low[node]=time;
        int cn=0;
        for (int i=0;i<list[node].size();i++)
        {
            int child=list[node].get(i);
            if(!visited[child])
            {
                cn+=1;
                parent[child]=node;
                time+=1;
                DFS(child);
                low[node]=Math.min(low[node],low[child]);
                if(parent[node]==-1 && cn>1) ap[node]=true;
                if(parent[node]!=-1 && low[child]>=disc[node]) ap[node]=true;
            }
            else if(parent[node]!=child)
            {
                low[node]=Math.min(low[node],disc[child]);
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String s[]=br.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int e=Integer.parseInt(s[1]);
        list=new LinkedList[n];
        parent=new int[n];
        low=new int[n];
        disc=new int[n];
        time=0;
        visited=new boolean[n];
        ap=new boolean[n];
        for (int i=0;i<n;i++)
                      {
                          list[i]=new LinkedList<>();
                      }
        while (e-->0)
        {
            s=br.readLine().trim().split(" ");
            int to= Integer.parseInt(s[0])-1;
            int from=Integer.parseInt(s[1])-1;
            list[to].add(from);
            list[from].add(to);
        }
parent[0]=-1;
        for (int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                DFS(i);
            }
        }
        int q=Integer.parseInt(br.readLine().trim());
        while(q-->0)
        {
            s=br.readLine().trim().split(" ");
            if(s.length==5)
            {
                int ca=Integer.parseInt(s[1])-1;
                int cb=Integer.parseInt(s[2])-1;
                int pa=Integer.parseInt(s[3])-1;
                int pb=Integer.parseInt(s[4])-1;
                boolean ea=false;
                boolean eb=false;
                int ta=ca;
                while(true)
                {
                    if(parent[ta]==-1)
                    {
                        if(ea) eb=true;
                        else ea=true;
                        break;
                    }
                    if(parent[ta]==pa) {
                        ea=true;
                        break;
                    }
                    if(parent[ta]==pb){
                        eb=true;
                        break;
                    }
                    ta=parent[ta];
                }
                ta=cb;
                while(true)
                {
                    if(parent[ta]==-1)
                    {
                        if(ea) eb=true;
                        else ea=true;
                        break;
                    }
                    if(parent[ta]==pa) {
                        ea=true;
                        break;
                    }
                    if(parent[ta]==pb){
                        eb=true;
                        break;
                    }
                    ta=parent[ta];
                }
                if((ea && eb && ap[pa] && ap[pb]))
                {
                    bw.write("da\n");
                }
                else{
                    bw.write("ne\n");
                }
            }
            else
            {
             int ca=Integer.parseInt(s[1])-1;
                int cb=Integer.parseInt(s[2])-1;
                int poa=Integer.parseInt(s[3])-1;
                boolean check=false;
                int ta=ca;
                while(true)
                {
                    if(parent[ta]==-1)
                    {
                        check=true;
                        break;
                    }
                    if(parent[ta]==cb)
                    {
                        check=false;
                        break;
                    }
                    ta=parent[ta];
                }
                boolean secchk=false;
                ta=cb;
                while(true)
                {
                    if(parent[ta]==-1)
                    {
                        secchk=true;
                        break;
                    }
                    if(parent[ta]==ca)
                    {
                        secchk=false;
                        break;
                    }
                    ta=parent[ta];
                }
                if(check && secchk) bw.write("ne\n");
                else  bw.write("da\n");
            }
        }
        bw.close();
    }
}
