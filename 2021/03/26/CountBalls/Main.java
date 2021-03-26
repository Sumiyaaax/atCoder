import java.util.Scanner;

public class Main {
    // B - Count Balls
    // https://atcoder.jp/contests/abc158/tasks/abc158_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
        long x = N / (A + B);
        long y = N % (A + B);
        long answer = x * A;
        if(y >= A) {
            answer += A;
        } else {
            answer += y;
        }
        System.out.println(answer);
    }
}