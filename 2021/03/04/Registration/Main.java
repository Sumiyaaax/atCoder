import java.util.Scanner;

public class Main {
    // A - Registration
    // https://atcoder.jp/contests/abc167/tasks/abc167_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        sc.close();
        String answer = "No";
        if(S.length != T.length - 1) {
            System.out.println(answer);
            return;
        }
        for(int i = 0; i < S.length; i++) {
            if(S[i] != T[i]) {
                System.out.println(answer);
                return;
            }
        }
        answer = "Yes";
        System.out.println(answer);
    }
}