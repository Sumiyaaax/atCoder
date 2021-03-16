import java.util.Scanner;

public class Main {
    // A - ABC Swap
    // https://atcoder.jp/contests/abc161/tasks/abc161_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        sc.close();
        int tmp = X;
        X = Y;
        Y = tmp;
        tmp = X;
        X = Z;
        Z = tmp;
        System.out.println(X + " " + Y + " " + Z);
    }
}