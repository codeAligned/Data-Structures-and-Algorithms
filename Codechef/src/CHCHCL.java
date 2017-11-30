

import java.io.*;
import java.util.HashMap;


class CVitaRnd2 {


    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static HashMap<String,Integer> nametoscore=new HashMap<>();
    static String player1,player2;
    static  String name1;
    static int vals[];
    static int correctanswer;



    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        else
            return gcd(b, a % b);
    }

    public static int lcm(int x,int y)
    {
        int gcd=gcd(x,y);
        return (x*y)/gcd;
    }

    public static void printanser(String name1, int[] vals,String name2,int correctanswer,int answertold,boolean passornot) throws IOException {
        String values = "";
        for (int i : vals) {
            values += i + ",";
        }
        bw.write(name1 + "'s question is: " + values.substring(0, values.length() - 1) + "\n");
        if (passornot) {
            bw.write("Question is PASSed\n");
            bw.write("Answer is: " + correctanswer + "\n");
            bw.write(name2 + ": 0points\n");
        } else {
            if (correctanswer == answertold) {
                int currentscore = nametoscore.get(name2);
                currentscore += 10;
                nametoscore.put(name2, currentscore);
                bw.write("Correct Answer\n" + name2 + ": 10points");
                bw.newLine();

            } else {
                bw.write("Wrong Answer\n" + name2 + ": 0points");
                bw.newLine();
            }
        }
    }
    public static void printTotalScore() throws IOException {
        bw.write("Total Points:\n");
        int score1=nametoscore.get(player1);
        int score2=nametoscore.get(player2);
        bw.write(player1+": "+score1+"points\n");
        bw.write(player2+": "+score2+"points\n");
        bw.write("Game Result: ");
        if(score1>score2)
        {
            bw.write(player1+" is winner");
        }
        else if (score2>score1){
            bw.write(player2+" is winner");
        }
        else{
            bw.write("Draw");
        }

    }



    public static void main(String args[]) throws IOException {
        int n=(Integer.parseInt(br.readLine()));
        boolean invalidcheck=false;
        for (int j=1;j<=n;j++)
        {
            if(j%2!=0) {
                String ques = br.readLine();
                String[] quesdata = ques.split(" ");
                 name1 = quesdata[0];
                if (nametoscore.get(name1) == null) {
                    nametoscore.put(name1, 0);
                    player1 = name1;
                }
                if (quesdata.length < 2) {
                    invalidcheck = true;
                    bw.write("Invalid Input\n");
                    break;
                }
                String sets[] = quesdata[1].split(",");
                vals= new int[sets.length];
                if (vals.length < 2) {
                    invalidcheck = true;
                    bw.write("Invalid Input\n");
                    break;
                }
                for (int i = 0; i < sets.length; i++) {
                    vals[i] = Integer.parseInt(sets[i]);
                }
                int l = vals.length;
                int lcmcalculate = lcm(vals[0], vals[1]);
                for (int i = 2; i <= l - 1; i++) {
                    lcmcalculate = lcm(vals[i], lcmcalculate);
                }
                correctanswer = lcmcalculate;
            }
            else {
                String anser[] = br.readLine().split(" ");
                String name2 = anser[1];
                if (nametoscore.get(name2) == null) {
                    nametoscore.put(name2, 0);
                    player2 = name2;
                }
                String ans = anser[2];
                if (ans.equals("PASS")) {
                    printanser(name1, vals, name2, correctanswer, 0, true);
                } else {
                    printanser(name1, vals, name2, correctanswer, Integer.parseInt(ans), false);
                }
            }
            if(n%2!=0 && j==n-1)
            {
                invalidcheck=true;
                bw.write("Invalid Input\n");
                break;
            }


        }
        if(!invalidcheck)
        {
            printTotalScore();
        }

        bw.close();
    }


}