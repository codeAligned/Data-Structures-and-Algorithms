    /**
     * Created by ruthless on 27/4/16.
     */


    import java.io.*;
    import java.util.*;


    class spoj_cc {
        static LinkedList<Integer>[] list;
        static LinkedList<Integer>[] tlist;
        static boolean visited[];
        static Stack<Integer> ts;
        static int gno;
        static int comp[];

        public static void DFS1(int x)
        {
            if(visited[x]) return;
            visited[x]=true;

            for(int i=0;i<list[x].size();i++) DFS1(list[x].get(i));
            ts.push(x);
        }

        public static void DFS2(int x)
        {
            if(visited[x]) return;
            visited[x]=true;
            for (int i=0;i<tlist[x].size();i++) DFS2(tlist[x].get(i));
            comp[x]=gno;
        }
        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] s=br.readLine().trim().split(" ");
            int v=Integer.parseInt(s[0]);
            int e=Integer.parseInt(s[1]);
            list=new LinkedList[v+1];
            tlist=new LinkedList[v+1];
            visited=new boolean[v+1];
            ts=new Stack<>();
            gno=0;
            comp=new int[v+1];
            for (int i=1;i<=v;i++)
            {
                list[i]=new LinkedList();
                tlist[i]=new LinkedList<>();
            }
            while (e-->0)
            {
                s=br.readLine().trim().split(" ");
                int f=Integer.parseInt(s[0]);
                int t=Integer.parseInt(s[1]);
                list[f].add(t);
                tlist[t].add(f);
            }

            for (int i=1;i<=v;i++)
            {
                DFS1(i);
            }

            visited=new boolean[v+1];
            while(!ts.isEmpty())
            {
                int node=ts.pop();
                if(!visited[node])
                {
                    gno+=1;
                    DFS2(node);
                }
            }
            int outdeg[]=new int[gno+1];
            for(int i=1;i<=v;i++)
            {
                for (int j=0;j<list[i].size();j++)
                {
                    if(comp[i]!=comp[list[i].get(j)])
                    {
                        outdeg[comp[i]]+=1;
                    }
                }
            }

            long count=0;

            String sb ="";
            for (int i = 1; i <= v; i++) {
                if (outdeg[comp[i]] == 0) {
                    count += 1;
                    sb+=i+" ";
                }
            }

            bw.write(count + "\n");
            bw.write(sb.trim() + "");
            bw.close();
        }
    }
