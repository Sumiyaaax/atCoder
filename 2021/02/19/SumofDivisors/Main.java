import java.util.Scanner;

public class Main {
    // D - Sum of Divisors
    // https://atcoder.jp/contests/abc172/tasks/abc172_d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        long answer = 0;
        long[] numArray = new long[(int) (N + 1)];
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j <= N; j += i) {
                numArray[j] ++;
            }
        }
        for(int i = 1; i <= N; i++) {
            answer += i * numArray[i];
        }
        System.out.println(answer);
    }
}