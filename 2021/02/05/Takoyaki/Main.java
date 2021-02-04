import java.util.Scanner;

public class Main {
    // A - Takoyaki
    // https://atcoder.jp/contests/abc176/tasks/abc176_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        sc.close();
        int times = N / X;
        if(N % X != 0) {
            times += 1;
        }
        System.out.println(times * T);
    }
}