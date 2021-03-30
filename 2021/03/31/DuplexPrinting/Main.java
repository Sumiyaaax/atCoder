import java.util.Scanner;

public class Main {
    // A - Duplex Printing
    // https://atcoder.jp/contests/abc157/tasks/abc157_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int answer = (N / 2) + (N % 2);
        System.out.println(answer);
    }
} 