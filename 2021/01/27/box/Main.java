import java.util.Scanner;

public class Main {
    // A - box
    // https://atcoder.jp/contests/abc180/tasks/abc180_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(N - A + B);
    }
}