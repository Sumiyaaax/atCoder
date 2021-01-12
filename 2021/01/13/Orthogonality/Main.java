import java.util.Scanner;

public class Main {
    // B - Orthogonality
    // https://atcoder.jp/contests/abc188/tasks/abc188_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int answer = 0;
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            answer += A[i] * B[i];
        }

        sc.close();
        if(answer == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}