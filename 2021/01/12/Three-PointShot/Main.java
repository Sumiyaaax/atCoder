import java.util.Scanner;

public class Main {
    // A - Three-Point Shot
    // https://atcoder.jp/contests/abc188/tasks/abc188_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();
        if((X - Y <= 2 && X - Y >= 0) || (Y - X <= 2 && Y - X >= 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}