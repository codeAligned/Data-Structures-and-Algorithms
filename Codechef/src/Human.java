import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


/**
 * Created by ruthless on 23/2/16.
 */
class Human {
    public static String name;
    public static int age;

    Human(String name, int age) {
        Human.name = name;
        Human.age = age;
    }

    public void introduce() {
        System.out.println("Hey! I'm " + name + " and I'm " + age + " years old.");
    }
}

class SuperHero extends Human {

    public static String ae;

    SuperHero(String ae, String name, int age) {
        super(name, age);
        if (ae != null)
            SuperHero.ae = ae;
    }

    public static <T extends Comparable<T>> void sort(
            T[] array) {
        Arrays.sort(array, new Comparator<T>() {
            @Override
            public int compare(T a1, T a2) {
                return a1.compareTo(a2);
            }
        });
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[t];
        int i = 0;
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            if (s.length == 4) {
                arr[i] = Integer.parseInt(s[2]);
                SuperHero sh = new SuperHero(s[3], s[1], arr[i]);

                sh.introduce(s[3]);
            } else {
                arr[i] = Integer.parseInt(s[2]);
                SuperHero sh = new SuperHero(null, s[1], arr[i]);
                sh.introduce();
            }
            i++;
        }
        sort(arr);
        for (Integer j : arr) {
            bw.write(j + "\n");
        }
        bw.close();
    }

    public void introduce(String s) {
        System.out.println("Hey! I'm " + name + " and I'm " + age + " years old. I'm also known as " + s + "!");
    }
}
