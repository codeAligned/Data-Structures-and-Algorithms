        /**
         * Created by ruthless on 15/4/16.
         */

        import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.util.Arrays;

        public class ParenthesesDiv2Easy {

            public static int getDepth(String s)
            {
                if(s.length()==0) return 0;
                else {
                    char[] c = s.toCharArray();
                    int posc = 0;
                    int res = 0;
                    int prev = 0;
                    int max=0;
                   int i=0;
                    int arr[]=new int[51];
                    int ac=0;
                    int cd=0;
                   int ch[]=new int[s.length()];
                    for (i=0;i<s.length();i++)
                    {
                        if(c[i]=='(')
                        {
                            posc+=1;
                        }
                        if(c[i]==')')
                        {
                            posc-=1;
                        }
                        if(c[i]==')')
                        {
                            cd+=1;
                        }
                        if(c[i]=='(' && i>0 && i<s.length()-1 )
                        {
                            arr[ac]=cd;
                            if(posc==0) arr[ac]+=1;
                            ac+=1;
                            cd=0;
                        }
                    }
                Arrays.sort(arr);
                    return arr[50];
                }

            }
            public  static  void main(String args[])
            {
                System.out.println(getDepth("((())())"));
            }
            }
