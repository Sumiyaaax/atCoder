import java.util.Scanner;

public class Main {
    // A - ReLU
    // https://atcoder.jp/contests/abc183/tasks/abc183_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.println(N >= 0 ? N : 0);
    }
}