import java.util.Scanner;

public class Main {
    // A - Odds of Oddness
    // https://atcoder.jp/contests/abc142/tasks/abc142_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        // 解答１
        // int countOdd = 0;
        // for(int i = 1; i <= N; i++) {
        //     if(i % 2 != 0) {
        //         countOdd ++;
        //     }
        // }
        // double answer = (double)countOdd / (double)N; 
        
        // 解答２
        double answer = (double) (N - N / 2) / N;
        System.out.println(answer);      
    }
} 
