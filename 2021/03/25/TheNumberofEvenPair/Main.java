import java.util.Scanner;

public class Main {
    // A - The Number of Even Pairs
    // https://atcoder.jp/contests/abc159/tasks/abc159_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        int evenN = (N * (N - 1)) / 2;
        int evenM = (M * (M - 1)) / 2;
        System.out.println(evenN + evenM);
    }
}