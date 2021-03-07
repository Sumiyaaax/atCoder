import java.util.Scanner;

public class Main {
    // B - 1%
    // https://atcoder.jp/contests/abc165/tasks/abc165_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();
        long total = 100;
        long answer = 0;
        while(total < X) {
            total += total / 100;
            answer ++;
        }
        System.out.println(answer);
    }
}