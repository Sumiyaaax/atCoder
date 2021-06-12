import java.util.Scanner;

public class Main {
    // C - Build Stairs
    // https://atcoder.jp/contests/abc136/tasks/abc136_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String answer = "Yes";
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        for(int i = N - 1; i > 0; i--) {
            if(numList[i - 1] - 1 == numList[i]) {
                numList[i - 1] --; 
            } else if(numList[i - 1] - 1 > numList[i]) {
                answer = "No";
            }
        }
        sc.close();
        System.out.println(answer);
    }
} 
