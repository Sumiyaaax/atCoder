import java.util.Scanner;

public class Main {
    // B - AtCoder Condominium
    // https://atcoder.jp/contests/abc203/tasks/abc203_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int total = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= K; j++) {
                total += i * 100 + j;
            }
        }
        System.out.println(total);
    }
} 
