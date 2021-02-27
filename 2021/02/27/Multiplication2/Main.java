import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // B - Multiplication 2
    // https://atcoder.jp/contests/abc169/tasks/abc169_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long answer = 1L;
        long[] numList = new long[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextLong();
        }
        sc.close();
        Arrays.sort(numList);
        if(numList[0] == 0L) {
            System.out.println(0);
            return;
        }
        for(int i = 0; i < N; i++) {
            if(1000000000000000000L / numList[i] < answer) {
                answer = -1;
                break;
            }
            answer *= numList[i];
        }
        System.out.println(answer);
    }
}