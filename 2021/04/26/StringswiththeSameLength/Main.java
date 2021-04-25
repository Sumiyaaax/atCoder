import java.util.Scanner;

public class Main {
    // B - Strings with the Same Length
    // https://atcoder.jp/contests/abc148/tasks/abc148_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] s = sc.next().toCharArray(); 
        char[] t = sc.next().toCharArray();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(s[i]);
            sb.append(t[i]);
        }
        System.out.println(sb.toString());
    }
} 
