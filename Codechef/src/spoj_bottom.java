/**
 * Created by ruthless on 26/4/16.
 */



import java.io.*;
import java.util.*;

public class spoj_bottom {

    public static LinkedList<Integer> list[];
    public static LinkedList<Integer> tlist[];
    public static Stack<Integer> timestamp;
    public static boolean visited[];
    public static ArrayList<String> bottom;
    static String sar="";
    static boolean stringed[];
    public static void DFS(int cnode)
    {
        visited[cnode]=true;
        if(list[cnode]!=null)
        {
            Iterator it=list[cnode].iterator();
            while(it.hasNext())
            {
                int child=(int) it.next();
                if(!visited[child]) DFS(child);
            }
            if(!timestamp.contains(cnode))
            timestamp.push(cnode);
        }
        else {
            timestamp.push(cnode);
        }
    }

    public static String DFSCC(int node,int start)
    {
        visited[node]=true;
        if(tlist[node]!=null)
        {
            Iterator it=tlist[node].iterator();
            while(it.hasNext())
            {
                int child=(int) it.next();

                if(visited[child] && child==start)
                {
                    stringed[node]=true;
                    return node+"";

                }
                if(stringed[child])
                {
                    continue;
                }
                else
                {
                    stringed[node]=true;
                    return node+" "+DFSCC(child,start)+" ";
                }
            }
            return node+"";
        }

        return node+"";
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s=br.readLine();
        while(s.length()!=1)
        {
            StringTokenizer st=new StringTokenizer(s.trim());
            int v=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            list=new LinkedList[v+1];
            tlist=new LinkedList[v+1];
            s=br.readLine();
            String sa[]=s.split(" ");

            for (int i=0;i<(2*Math.ceil(sa.length/2));i=i+2)
            {
                int fr=Integer.parseInt(sa[i]);
                int to=Integer.parseInt(sa[i+1]);
                if(list[fr]==null) list[fr]=new LinkedList<>();
                list[fr].add(to);
                if(tlist[to]==null) tlist[to]=new LinkedList<>();
                tlist[to].add(fr);
            }

            timestamp=new Stack<>();
            visited=new boolean[v+1];
            stringed=new boolean[v+1];
            for (int i=1;i<=v;i++)
            {
              if(!visited[i]) {
                  DFS(i);
              }
            }
            int count=0;
            bottom=new ArrayList<>(v+1);
            visited=new boolean[v+1];
            while(!timestamp.isEmpty())
            {
                int current=timestamp.pop();
                if(!visited[current])
                {


                    sar=DFSCC(current,current)+"";
                    bottom.add(sar);
                    stringed[current]=true;
                    count+=1;
                    sar="";
                }
            }
            bw.write(bottom.get(count-1).trim()+"\n");
           s=br.readLine().trim();
        }
        bw.close();
    }
}
