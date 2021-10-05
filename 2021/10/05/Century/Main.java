import java.util.Scanner;

public class Main {
    // A - Century
    // https://atcoder.jp/contests/abc200/tasks/abc200_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int answer = ((N - 1) / 100) + 1;
        System.out.println(answer);
    }
} 
