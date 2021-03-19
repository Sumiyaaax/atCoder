import java.util.Scanner;

public class Main {
    // C - Replacing Integer 
    // https://atcoder.jp/contests/abc161/tasks/abc161_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        long answer = Math.min(N % K, K - N % K);
        System.out.println(answer);
    }
}