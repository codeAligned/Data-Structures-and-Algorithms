  /*  import java.io.*;

    /**
     * Created by ruthless on 4/3/16.

    class doubles {
        static int a[];
        public static String bfun(String a,String b) {
            int count = 0;
            int j = 0;
            char p[] = a.toCharArray();
            char q[] = b.toCharArray();
            int lb = b.length();
            int la = a.length();
            int locr = 0;
            for (int i = 0; i < la; i++) {
                while (j < lb) {
                    if (q[j] == p[i])
                        break;
                    j++;
                }
                if (j > lb) return "NO\n";
                j++;
            }
            return "YES\n";
        }

        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int t=Integer.parseInt(br.readLine());
            while(t-->0)
            {
                String s=br.readLine();
                int l=s.length();
                if(l%2==0)
                {
                    int mid=l/2;
                    String a=s.substring(0,mid);
                    String b=s.substring(mid,l);
                    bw.write(bfun(a,b));
                }
                else
                {
                    int loc=0;
                    char c[]=s.toCharArray();
                    a=new int[26];
                    for (int i=0;i<c.length;i++)
                    {
                        int val=((int)c[i])-97;
                        a[val]+=1;
                    }
                    int count=0;
                    for (int i=0;i<26;i++)
                    {
                        if(a[i]%2!=0)
                        {
                            count+=1;
                        }

                        if(count>1) break;
                    }
                    if(count>1) bw.write("NO\n");
                    else
                    {
                        int mid=l/2;
                        String a,b;
                        a=s.substring(0,mid);
                        b=s.substring(mid,l);
                        if(bfun(a,b).equals("NO\n"))
                        {
                            a=s.substring(0,mid+1);
                            b=s.substring(mid+1,l);
                            bw.write(bfun(b,a));
                        }
                        else

                        {
                            bw.write("YES\n");
                        }
                    }
                }
            }
            bw.close();
        }
    }*/
  import java.io.*;
  import java.util.Arrays;

  /**
   * Created by ruthless on 4/3/16.
   */
  class doubles {
      static int a[];
      public static String bfun(String a,String b)
      {
          int count=0;
          int j=0;
          char p[]=a.toCharArray();
          char q[]=b.toCharArray();
          int lb=b.length();
          int la=a.length();
          int locr=0;
          for (int i=0;i<a.length();i++)
          {
              while (j<lb && i<la && p[i]==q[j])
              {
                  i+=1;
                  j+=1;
              }
              if(i==la)
              {
                  b=b.substring(0,la);
                  if(a.equals(b)) return "YES\n";
                  else return "NO\n";
              }
              if(p[i]!=q[j])
              {
                  locr=j;
                  break;
              }
          }
          b=b.substring(0,locr)+b.substring(locr+1,lb);
          if(a.equals(b)) return "YES\n";
          return "NO\n";
      }
      public static void main(String args[]) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int t=Integer.parseInt(br.readLine());
          while(t-->0)
          {
              String s=br.readLine();
              int l=s.length();
              if(l%2==0)
              {
                  int mid=l/2;
                  String a=s.substring(0,mid);
                  String b=s.substring(mid,l);
                  if(a.equals(b)) bw.write("YES\n");
                  else bw.write("NO\n");
              }
              else
              {
                  int loc=0;
                  char c[]=s.toCharArray();
                  a=new int[26];
                  for (int i=0;i<c.length;i++)
                  {
                      int val=((int)c[i])-97;
                      a[val]+=1;
                  }
                  int count=0;
                  for (int i=0;i<26;i++)
                  {
                      if(a[i]%2!=0)
                      {
                          count+=1;
                      }

                      if(count>1) break;
                  }
                  if(count>1) bw.write("NO\n");
                  else
                  {
                      int mid=l/2;
                      String a,b;
                      a=s.substring(0,mid);
                      b=s.substring(mid,l);
                      if(bfun(a,b).equals("NO\n"))
                      {
                          a=s.substring(0,mid+1);
                          b=s.substring(mid+1,l);
                          bw.write(bfun(b,a));
                      }
                      else

                      {
                          bw.write("YES\n");
                      }
                  }
              }
          }
          bw.close();
      }
  }