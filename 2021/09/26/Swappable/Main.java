import java.util.Scanner;

public class Main {
    // C - Swappable
    // https://atcoder.jp/contests/abc206/tasks/abc206_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(numList[i] != numList[j]) {
                    answer ++;
                }
            }
        }
        System.out.println(answer);
    }
} 
