import java.util.Scanner;

public class Main {
    // A - Beginner
    // https://atcoder.jp/contests/abc156/tasks/abc156_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        sc.close();
        int answer = 0;
        if(N >= 10) {
            answer = R;
        } else {
            answer = R + (100 * (10 - N));
        }
        System.out.println(answer);
    }
} 