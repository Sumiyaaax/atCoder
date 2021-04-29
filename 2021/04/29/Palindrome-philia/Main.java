import java.util.Scanner;

public class Main {
    // B - Palindrome-philia
    // https://atcoder.jp/contests/abc147/tasks/abc147_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        sc.close();
        int answer = 0;
        for(int i = 0; i < S.length / 2; i++) {
            if(S[i] != S[S.length - 1 - i]) {
                answer ++;
            }
        }
        System.out.println(answer);
    }
} 
