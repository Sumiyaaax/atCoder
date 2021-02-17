import java.util.Scanner;

public class Main {
    // B - Minor Change
    // https://atcoder.jp/contests/abc172/tasks/abc172_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        sc.close();
        int answer = 0;
        for(int i = 0; i < S.length; i++) {
            if(S[i] != T[i]) {
                answer ++;
            }
        }
        System.out.println(answer);
    }
}