import java.util.Scanner;

public class Main {
    // B - ROT N
    // https://atcoder.jp/contests/abc146/tasks/abc146_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        StringBuffer sb = new StringBuffer();
        sc.close();
        for(int i = 0; i < S.length; i++) {
            int x = S[i] - 'A';
            x = (x + N) % 26;
            sb.append((char) ('A' + x));
        }
        System.out.println(sb.toString());
    }
} 
