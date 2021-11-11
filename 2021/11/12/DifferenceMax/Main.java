import java.util.Scanner;

public class Main {
    // A - Difference Ma
    // https://atcoder.jp/contests/abc196/tasks/abc196_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int answer = b - c;
        System.out.println(answer);
    }
} 
