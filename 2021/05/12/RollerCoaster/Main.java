import java.util.Scanner;

public class Main {
    // B - Roller Coaster
    // https://atcoder.jp/contests/abc142/tasks/abc142_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if(tmp >= K) {
                answer ++;
            }
        }
        sc.close();
        System.out.println(answer);
    }
} 
