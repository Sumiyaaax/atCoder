import java.util.Scanner;

public class Main {
    // A - Rotate
    // https://atcoder.jp/contests/abc197/tasks/abc197_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < S.length; i++) {
            sb.append(S[i]);
        }
        sb.append(S[0]);
        System.out.println(sb.toString());
    }
} 
