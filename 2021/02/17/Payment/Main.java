import java.util.Scanner;

public class Main {
    // A - Payment
    // https://atcoder.jp/contests/abc173/tasks/abc173_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int answer = N % 1000 == 0 ? N % 1000 : 1000 - (N % 1000);
        System.out.println(answer); 
    }
}