import java.util.Scanner;

public class Main {
    // B - Can you buy them all?
    // https://atcoder.jp/contests/abc209/tasks/abc209_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        int total = 0;
        for(int i = 0; i < N; i++) {
            if(i % 2 != 0) {
                total += numList[i] - 1;
            } else {
                total += numList[i];
            }
        }
        String answer = "Yes";
        if(total > X) {
            answer = "No";
        }
        System.out.println(answer);
    }
} 
