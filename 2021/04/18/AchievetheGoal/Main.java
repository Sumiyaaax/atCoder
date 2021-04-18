import java.util.Scanner;

public class Main {
    // B - Achieve the Goal
    // https://atcoder.jp/contests/abc151/tasks/abc151_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        int answer = -1;
        int totalScore = N * M;
        int totalScoreBeforeFinalTest = 0;
        for(int i = 0; i < N - 1; i++) {
            totalScoreBeforeFinalTest += sc.nextInt();
        }
        sc.close();
        if(totalScore - totalScoreBeforeFinalTest <= 0) {
            answer = 0;    
        } else if(totalScore - totalScoreBeforeFinalTest <= K) {
            answer = totalScore - totalScoreBeforeFinalTest;
        }
        System.out.println(answer);
    }
} 
