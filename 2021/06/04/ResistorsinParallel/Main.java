import java.util.Scanner;

public class Main {
    // B - Resistors in Parallel
    // https://atcoder.jp/contests/abc138/tasks/abc138_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        double answer = 0;
        for(int i = 0; i < N; i++) {
            double tmp = (double) 1 / (double) numList[i];
            answer += tmp;
        }
        answer = 1.0 / answer;
        System.out.println(answer);
    }
} 
