import java.util.Scanner;

public class Main {
    // A - twiblr
    // https://atcoder.jp/contests/abc182/tasks/abc182_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int max = A * 2 + 100;
        System.out.println(max - B);
    }
}