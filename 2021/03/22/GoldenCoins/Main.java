import java.util.Scanner;

public class Main {
    // B - Golden Coins
    // https://atcoder.jp/contests/abc160/tasks/abc160_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();
        long answer = 0;
        answer = (X / 500) * 1000;
        answer += ((X % 500) / 5) * 5;
        System.out.println(answer);
    }
}