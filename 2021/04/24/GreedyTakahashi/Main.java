import java.util.Scanner;

public class Main {
    // B - Greedy Takahashi
    // https://atcoder.jp/contests/abc149/tasks/abc149_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        if(K <= A) {
            A = K - A;
        } else {
            K = K - A;
            if(K <= B) {
                B = B - K;
            } else {
                B = 0;
            }
            A = 0;
        }
        System.out.println(A + " " + B);
    }
} 
