import java.util.Scanner;

public class Main {
    // C - A x B + C
    // https://atcoder.jp/contests/abc179/submissions/me
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        long answer = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N / i; j++) {
                if(i * j < N) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}