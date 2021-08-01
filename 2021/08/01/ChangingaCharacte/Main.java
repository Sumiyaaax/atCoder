import java.util.Scanner;

public class Main {
    // A - Changing a Character
    // https://atcoder.jp/contests/abc126/tasks/abc126_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        char[] schar = sc.next().toCharArray();
        sc.close();
        schar[K - 1] = Character.toLowerCase(schar[K - 1]);
        StringBuilder sb = new StringBuilder();
        for(char c : schar) {
            sb.append(c);
        }
        System.out.println(sb);
    }
} 
