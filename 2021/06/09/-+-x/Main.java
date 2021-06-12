import java.util.Scanner;

public class Main {
    // A - +-x
    // https://atcoder.jp/contests/abc137/tasks/abc137_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(Math.max(A + B, Math.max(A - B, A * B)));
    }
} 
