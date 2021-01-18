import java.util.Scanner;

public class Main {
    // B - Almost GCD
    // https://atcoder.jp/contests/abc182/tasks/abc182_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        int count;
        int max = 0;
        int answer = 0;
        for(int k = 2; k <= 1000; k++) {
            count = 0;
            for(int i = 0; i < N; i++) {
                if(numList[i] % k == 0) {
                    count++;
                }
            }
            if(max < count) {
                max = count;
                answer = k;
            }
        }
        System.out.println(answer);
    }
}