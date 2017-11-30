import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class icpc1 {

    static class A{
        int a,b,c,index;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            LinkedList<A> mem=new LinkedList<>();
            int x=3;
            int i=1;
            while(x-->0){
            A a=new A();
            a.a=sc.nextInt();
            a.b=sc.nextInt();
            a.c=sc.nextInt();
            a.index=i++;
            mem.add(a);
            }
            Collections.sort(mem, new Comparator<A>() {
                @Override
                public int compare(A o1, A o2) {
                    int a1=o1.a;
                    int b1=o1.b;
                    int c1=o1.c;
                    int a2=o2.a;
                    int b2=o2.b;
                    int c2=o2.c;
                    if(propComparison(a1,b1,c1,a2,b2,c2)==1) return 1;
                    else if(propComparison(a1,c1,b1,a2,c2,b2)==1) return 1;
                    else if(propComparison(b1,a1,c1,b2,a2,c2)==1) return 1;
                    else if(propComparison(b1,c1,a1,b2,c2,a2)==1) return 1;
                    else if(propComparison(c1,a1,b1,c2,a2,b2)==1) return 1;
                    else return propComparison(c1,b1,a1,c2,b2,a2);
                }
            });
            System.out.println(check(mem)?"yes":"no");
        }
    }

    private static boolean check(LinkedList<A> mem) {
    for(int i=0;i<mem.size()-1;i++){
        A x=mem.get(i);
        A y=mem.get(i+1);
        if(x.a==y.a && x.b==y.b && x.c==y.c) return false;
    }
    return true;
    }

    static int propComparison(int a1,int b1,int c1,int a2,int b2,int c2){
    if(a1>=a2 && b1>=b2 && c1>c2)
        return 1;
    return 0;
    }

}
