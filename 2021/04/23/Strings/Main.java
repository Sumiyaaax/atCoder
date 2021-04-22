import java.util.Scanner;

public class Main {
    // A - Strings
    // https://atcoder.jp/contests/abc149/tasks/abc149_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String S = sc.next();
        String T = sc.next();
        sc.close();
        sb.append(T);
        sb.append(S);
        System.out.println(sb.toString());
    }
} 
